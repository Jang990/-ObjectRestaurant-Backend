package com.object.objectrestaurant.config.auth;

import java.util.Optional;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.object.objectrestaurant.entity.UserInfo;
import com.object.objectrestaurant.repositoy.UserInfoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PrincipalDetailsService implements UserDetailsService {
	
	private final UserInfoRepository userInfoRepository;
	
	@Override
	public UserDetails loadUserByUsername(String userId) throws UsernameNotFoundException {
		Optional<UserInfo> userCheck = userInfoRepository.findByUserId(userId);
		
		if(userCheck.isEmpty()) return null;
		
		return new PrincipalDetails(userCheck.get());
	}
	
}
