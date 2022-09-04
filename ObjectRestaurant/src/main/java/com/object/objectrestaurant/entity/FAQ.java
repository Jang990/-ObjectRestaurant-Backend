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
public class FAQ {
	/*
	faq_id NN 기본키
	faq_q
	faq_a
	store_id NN 외래키
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long faqId;
	private String question;
	private String answer;
	
	@ManyToOne
	@JoinColumn(name = "store_id")
	private Store store;
}
