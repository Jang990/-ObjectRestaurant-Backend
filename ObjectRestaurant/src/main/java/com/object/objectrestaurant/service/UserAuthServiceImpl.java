package com.object.objectrestaurant.service;

import java.util.Optional;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.object.objectrestaurant.dto.UserInfoData;
import com.object.objectrestaurant.entity.UserInfo;
import com.object.objectrestaurant.repositoy.UserInfoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UserAuthServiceImpl implements UserAuthService {
	
	private final UserInfoRepository userInfoRepository;
	private final BCryptPasswordEncoder bCryptPasswordEncoder;
	
	/**
	 * UserInfo 아이디 중복 확인
	 * @return 중복일 시 true
	 */
	@Override
	public boolean validateDuplicate(UserInfoData user) {
		Optional<UserInfo> userCheck = userInfoRepository.findByUserId(user.getUserId());
		if(userCheck.isPresent()) return true;
		else return false;
	}
	
	@Override
	public boolean registerUser(UserInfoData userData) {
		if(validateDuplicate(userData)) return false;
		
		UserInfo user = UserInfo.builder()
				.userId(userData.getUserId())
				.userPw(bCryptPasswordEncoder.encode(userData.getUserPw()))
				.nickname(userData.getNickname())
				.build();
		userInfoRepository.save(user);
		return true;
	}

}
