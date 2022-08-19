package com.object.objectrestaurant.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.object.objectrestaurant.dto.LoginData;
import com.object.objectrestaurant.dto.UserInfoData;
import com.object.objectrestaurant.entity.UserInfo;
import com.object.objectrestaurant.repositoy.UserInfoRepository;

@Service
public class AuthServiceImpl implements AuthService {
	
	@Autowired
	UserInfoRepository userInfoRepository;
	
	@Override
	public boolean checkUserAuth(LoginData loginData) {
		Optional<UserInfo> userCheck = userInfoRepository.findByUserId(loginData.getId());
		if(userCheck.isEmpty()) return false;
		
		UserInfo user = userCheck.get();
		System.out.println(user);
		return user.getUserPw().equals(loginData.getPw());
	}

	@Override
	public boolean registerUser(UserInfoData userDataToRegister) {
		UserInfo user = UserInfo.builder()
				.userId(userDataToRegister.getUserId())
				.userPw(userDataToRegister.getUserPw())
				.nickname(userDataToRegister.getNickname())
				.build();
		userInfoRepository.save(user);
		return true;
	}

}
