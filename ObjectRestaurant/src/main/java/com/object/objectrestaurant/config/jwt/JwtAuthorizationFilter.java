package com.object.objectrestaurant.config.jwt;

import java.io.IOException;
import java.util.Optional;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.object.objectrestaurant.config.auth.PrincipalDetails;
import com.object.objectrestaurant.entity.UserInfo;
import com.object.objectrestaurant.repositoy.UserInfoRepository;

public class JwtAuthorizationFilter extends BasicAuthenticationFilter{
	
	private final UserInfoRepository userRepository;
	
	public JwtAuthorizationFilter(AuthenticationManager authenticationManager, UserInfoRepository userRepository) {
		super(authenticationManager);
		this.userRepository = userRepository;
	}
	
	@Override
	protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		String authValue = request.getHeader("Authorization");
		if(authValue == null || !(authValue.startsWith("Bearer: ")))
			chain.doFilter(request, response);
		String jwtToken = authValue.replace("Bearer: ", "");
		String userId = JWT.require(Algorithm.HMAC256("key")).build()
				.verify(jwtToken)
				.getClaim("userId").asString();
		
		if(userId == null) 
			chain.doFilter(request, response);
		
		Optional<UserInfo> user = userRepository.findByUserId(userId);
		if(user.isEmpty()) 
			chain.doFilter(request, response);
		
		//세션강제저장
		PrincipalDetails principalUser = new PrincipalDetails(user.get());
		Authentication authentication = 
				new UsernamePasswordAuthenticationToken(principalUser, null, principalUser.getAuthorities());
		SecurityContextHolder.getContext().setAuthentication(authentication);
		
		chain.doFilter(request, response);
	}

}
