package com.object.objectrestaurant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@Data
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class UserInfo {
	/*
	user_id  NN 기본키
	user_pw NN
	user_nickname NN
	 */
	@Id
	private String userId;
	private String userPw;
	@Column(name="nickname" , unique=true)
	private String nickname;
}
