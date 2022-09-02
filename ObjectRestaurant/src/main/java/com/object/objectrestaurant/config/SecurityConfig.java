package com.object.objectrestaurant.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.web.filter.CorsFilter;

import com.object.objectrestaurant.config.jwt.JwtAuthenticationFilter;
import com.object.objectrestaurant.config.jwt.JwtAuthorizationFilter;
import com.object.objectrestaurant.repositoy.UserInfoRepository;

import lombok.RequiredArgsConstructor;

@Configuration
@EnableWebSecurity
@RequiredArgsConstructor
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	
	private final CorsFilter corsFilter;
	private final UserInfoRepository userRepository;
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.formLogin().disable()
			.httpBasic().disable()
			.csrf().disable();
		
		http.sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
		
		http.authorizeRequests()
//			.antMatchers("/api/ceo~~").hasRole("CEO")
			.anyRequest().permitAll();
		
		http.addFilter(corsFilter);
//			.addFilter(new JwtAuthenticationFilter(authenticationManager()))
//			.addFilter(new JwtAuthorizationFilter(authenticationManager(), userRepository));
	}
	
	@Bean
	public BCryptPasswordEncoder bCryptPasswordEncoder() {
		return new BCryptPasswordEncoder();
	}
}
