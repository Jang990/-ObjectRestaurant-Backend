package com.object.objectrestaurant.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class CeoInfo {
	@Id
	private String ceoId;
	private String ceoPw;
}
