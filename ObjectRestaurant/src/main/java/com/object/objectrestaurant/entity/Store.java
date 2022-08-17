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
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long storeId;
	private String storeAddress;
	private String storeTime;
	private String storeImage;
	private String storeMension;
	
	@ManyToOne(targetEntity = CeoInfo.class)
	@JoinColumn(name="CEO_ID")
	private String ceoId;
}
