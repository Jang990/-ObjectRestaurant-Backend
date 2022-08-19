package com.object.objectrestaurant.service;

import com.object.objectrestaurant.dto.LoginData;
import com.object.objectrestaurant.dto.UserInfoData;

public interface AuthService {
	boolean checkUserAuth(LoginData loginData);
	boolean registerUser(UserInfoData userDataToRegister);
}
