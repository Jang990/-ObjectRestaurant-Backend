package com.object.objectrestaurant.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Menu {
	/*
	menu_name NN
	menu_image NN BLOB방식
	menu_price NN
	menu_info
	store_id NN 외래키 및 기본키
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String menuName;
	private String menuImage;
	private int menuPrice;
	private String menuInfo;
	
	@ManyToOne(targetEntity = Store.class)
	@JoinColumn(name = "store_id")
	private String storeId;
}
