package com.object.objectrestaurant.service.user;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.object.objectrestaurant.dto.BookmarkData;
import com.object.objectrestaurant.dto.UserInfoData;
import com.object.objectrestaurant.entity.BookMark;
import com.object.objectrestaurant.entity.UserInfo;
import com.object.objectrestaurant.repositoy.BookmarkRepository;
import com.object.objectrestaurant.repositoy.UserInfoRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class SpecificUserServiceImpl implements SpecificUserService {
	
	private final UserInfoRepository userRepository;
	private final BookmarkRepository bookmarkRepository;

	@Override
	public UserInfoData getUser(String userId) {
		UserInfo user = userRepository.findByUserId(userId).orElseThrow(
				() -> new IllegalArgumentException("해당 사용자가 없습니다. id="+ userId));		
		
		return UserInfoData.builder()
				.userId(user.getUserId())
//				.userPw(user.getUserPw())
				.nickname(user.getNickname())
				.build();
	}

	@Override
	public BookmarkData getBookMark(String userId) {
		BookMark bookmark =  bookmarkRepository.findByUser_UserId(userId).orElseThrow(
				() -> new IllegalArgumentException("해당 사용자의 즐겨찾기가 없습니다. id="+ userId));
		
		return BookmarkData.builder()
				.markId(bookmark.getMarkId())
				.userId(bookmark.getUser().getUserId())
				.storeId(bookmark.getStore().getStoreId())
				.favoriteCheck(bookmark.getFavoriteCheck())
				.build();
	}
	
	
	
	
}
