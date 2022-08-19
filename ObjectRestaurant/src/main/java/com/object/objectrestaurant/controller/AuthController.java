package com.object.objectrestaurant.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.object.objectrestaurant.dto.LoginData;
import com.object.objectrestaurant.dto.UserInfoData;
import com.object.objectrestaurant.service.AuthService;

@RestController
@RequestMapping("/auth")
public class AuthController {
	
	@Autowired
	AuthService authService;
	
	/*
	final static private String URL = "http://218.236.123.14:9090/login.php";
    public Request_User_Login(String userID, String userPassword, Response.Listener<String> listener) {
        
    	super(Method.POST, URL, listener, null);
        map = new HashMap<>();
        map.put("user_id",userID);
        map.put("user_pw", userPassword);
    }
	 */
	@PostMapping("/user") 
	public boolean checkUserAuth(LoginData loginData) {
		//로그인 가능여부
		//추후 JWT로 진행할 것이다.
		System.out.println(loginData);
		return authService.checkUserAuth(loginData);
	}
	
	
	@PostMapping("/user/abc") // 일단 URL을 이렇게 해놓음
	public boolean registerUser(UserInfoData userDataToRegister) {
		//회원가입
		return authService.registerUser(userDataToRegister);
	}
}
