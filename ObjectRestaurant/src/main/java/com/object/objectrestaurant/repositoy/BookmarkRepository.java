package com.object.objectrestaurant.repositoy;

import java.util.Optional; 

import org.springframework.data.jpa.repository.JpaRepository;

import com.object.objectrestaurant.entity.BookMark;

public interface BookmarkRepository extends JpaRepository<BookMark, String>{
	Optional<BookMark> findByUser_UserId(String userId);
}
