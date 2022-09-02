package com.object.objectrestaurant.config.jwt;

import java.io.IOException;
import java.util.Date;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.UsernamePasswordAuthenticationFilter;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.object.objectrestaurant.config.auth.PrincipalDetails;
import com.object.objectrestaurant.entity.UserInfo;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class JwtAuthenticationFilter extends UsernamePasswordAuthenticationFilter{
	
	private final AuthenticationManager authenticationManager;
	
	@Override
	public Authentication attemptAuthentication(HttpServletRequest request, HttpServletResponse response)
			throws AuthenticationException {
		ObjectMapper om = new ObjectMapper();
		try {
			UserInfo user = om.readValue(request.getInputStream(), UserInfo.class);
			UsernamePasswordAuthenticationToken token = 
					new UsernamePasswordAuthenticationToken(user.getUserId(), user.getUserPw());
			//로그인 시도
			return authenticationManager.authenticate(token);
		} catch (IOException e) {
			e.printStackTrace();
		}
		//로그인 실패
		return null;
	}
	
	//로그인 성공
	@Override
	protected void successfulAuthentication(HttpServletRequest request, HttpServletResponse response, FilterChain chain,
			Authentication authResult) throws IOException, ServletException {
		PrincipalDetails user = (PrincipalDetails) authResult.getPrincipal();
		
		String jwtToken = JWT.create()
				.withSubject(user.getUsername())
				.withClaim("userId", user.getUsername())
				.withExpiresAt(new Date(System.currentTimeMillis() + 1000 * 60 * 30))
				.sign(Algorithm.HMAC256("key"));
		
		response.addHeader("Authorization", "Bearer: " + jwtToken);
	}
}
