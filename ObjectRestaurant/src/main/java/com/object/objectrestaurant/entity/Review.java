package com.object.objectrestaurant.entity;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.CreationTimestamp;

import lombok.Data;

@Data
@Entity
public class Review {
	/*
	review_id NN 기본키
	review_image1  BLOB방식
	review_image2  BLOB방식
	review_image3  BLOB방식
	review_like NN
	review_mension NN
	review_datetime datetime NN
	review_ceo_mension
	user_id NN 외래키
	store_id NN 외래키
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long reviewId;
	private String reviewMension;
	private String review_ceo_mension;
	private int reviewLike;
	@CreationTimestamp
	private Timestamp review_datetime;
	private String reviewImage1;
	private String reviewImage2;
	private String reviewImage3;
	
	@ManyToOne
	@JoinColumn(name = "user_id")
	private UserInfo user;
	
	@ManyToOne
	@JoinColumn(name = "store_id")
	private Store store;
}
