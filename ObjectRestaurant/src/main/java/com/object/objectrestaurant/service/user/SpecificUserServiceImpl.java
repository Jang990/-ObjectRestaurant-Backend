package com.object.objectrestaurant.service.user;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.object.objectrestaurant.dto.UserInfoData;
import com.object.objectrestaurant.entity.UserInfo;
import com.object.objectrestaurant.repositoy.UserInfoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SpecificUserServiceImpl implements SpecificUserService {
	
	private final UserInfoRepository userRepository;

	@Override
	public UserInfoData getUser(String userId) {
		UserInfo user = userRepository.findByUserId(userId).orElseThrow(
				() -> new IllegalArgumentException("해당 사용자가 없습니다. id="+ userId));		
		
		return UserInfoData.builder()
				.userId(user.getUserId())
//				.userPw(user.getUserPw())
				.nickname(user.getNickname())
				.build();
	}
	
	
	
	
}
