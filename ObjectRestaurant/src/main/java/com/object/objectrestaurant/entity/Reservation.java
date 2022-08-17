package com.object.objectrestaurant.entity;

import java.sql.Date;
import java.sql.Time;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Reservation {
	/*
	reservation_id NN 기본키
	reservation_date NN
	reservation_time NN
	reservation_adult NN 
	reservation_child NN
	reservation_state NN
	user_id  NN 외래키
	user_nickname NN 외래키
	store_id NN 외래키
	 */
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long reservationId;
	
	private Date reservationDate;//예약한 날짜?
	private Time reservationTime;//예약한 시간?
	
	private int reservationAdult;
	private int reservationChild;
	private String reservationState;//?
	
	@ManyToOne(targetEntity = UserInfo.class)
	@JoinColumn(name = "user_id")
	private String userId;
	
	@ManyToOne(targetEntity = UserInfo.class)
	@JoinColumn(name = "nickname")
	private String userNickname;
	
	@ManyToOne(targetEntity = Store.class)
	@JoinColumn(name = "store_id")
	private Long storeId;
	
}
