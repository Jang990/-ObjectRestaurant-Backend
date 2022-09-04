package com.object.objectrestaurant.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BookmarkData {
	private Long markId;
	private String userId;
	private Long storeId;
	private int favoriteCheck;
}
