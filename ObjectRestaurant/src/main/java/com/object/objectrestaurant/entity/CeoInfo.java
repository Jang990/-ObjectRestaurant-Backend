package com.object.objectrestaurant.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CeoInfo {
	/*
	ceo_id  NN 기본키
	ceo_pw NN
	 */
	@Id
	private String ceoId;
	private String ceoPw;
}
