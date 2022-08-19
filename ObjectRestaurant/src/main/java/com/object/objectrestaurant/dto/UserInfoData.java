package com.object.objectrestaurant.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class UserInfoData {
	private String userId;
	private String userPw;
	private String nickname;
}
