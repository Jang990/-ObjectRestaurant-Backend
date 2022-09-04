package com.object.objectrestaurant.service.user;

import com.object.objectrestaurant.dto.BookmarkData;
import com.object.objectrestaurant.dto.UserInfoData;

public interface SpecificUserService {
	UserInfoData getUser(String userId);

	BookmarkData getBookMark(String userId);
}
