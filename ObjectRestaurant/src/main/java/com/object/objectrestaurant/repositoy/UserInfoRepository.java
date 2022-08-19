package com.object.objectrestaurant.repositoy;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.object.objectrestaurant.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, String>{
	Optional<UserInfo> findByUserId(String userId);
}
