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
public class Store {
	/*
	store_id  NN 기본키
	store_name NN
	store_address NN
	store_time NN
	store_images  BLOB방식
	store_mension
	ceo_id NN 외래키
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long storeId;
	private String storeName;
	private String storeAddress;
	private String storeTime;
	private String storeImage;
	private String storeMension;
	
	@ManyToOne(targetEntity = CeoInfo.class)
	@JoinColumn(name="CEO_ID")
	private String ceoId;
}
