package com.object.objectrestaurant.service.user;

import com.object.objectrestaurant.dto.UserInfoData;

public interface SpecificUserService {
	UserInfoData getUser(String userId);
}
