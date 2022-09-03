package com.object.objectrestaurant.service;

import com.object.objectrestaurant.dto.UserInfoData;

public interface UserAuthService {
	boolean validateDuplicate(UserInfoData user);
	boolean registerUser(UserInfoData userData);
}
