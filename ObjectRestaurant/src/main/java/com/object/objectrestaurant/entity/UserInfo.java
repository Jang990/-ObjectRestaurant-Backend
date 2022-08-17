package com.object.objectrestaurant.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;


@Entity
@Data
public class UserInfo {
	@Id
	private String userId;
	private String userPw;
	private String nickname;
}
