package com.object.objectrestaurant.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Builder
@ToString
@Getter
@Setter
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
