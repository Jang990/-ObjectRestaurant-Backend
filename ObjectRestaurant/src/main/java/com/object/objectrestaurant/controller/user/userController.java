package com.object.objectrestaurant.controller.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.object.objectrestaurant.dto.UserInfoData;
import com.object.objectrestaurant.service.UserAuthService;
import com.object.objectrestaurant.service.user.SpecificUserService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class userController {
	
	private final UserAuthService userAuthService;
	private final SpecificUserService specificUserService;
	
	
	/*
	String URL="http://218.236.123.14:9090/Register.php";
    public Request_Register(String userID, String userPassword, String userName, Response.Listener<String> listener) {
     
    	super(Method.POST, URL, listener, null);
        map = new HashMap<>();
        map.put("user_id",userID);
        map.put("user_pw", userPassword);
        map.put("user_nickname", userName);
    }
	 */
	@PostMapping("")
	public String registerUser(UserInfoData user) {
		if(user.getUserId() == null
				|| user.getUserPw() == null 
				|| user.getNickname() == null) return "정확한 사용자 데이터 필요";
		
		if(userAuthService.registerUser(user)) return "사용자 등록 완료";
		else return "사용자 등록 실패";
	}
	
	/*
	String URL="http://218.236.123.14:9090/Validate_ID.php"; //사용자 ID 중복 검색
    public Request_Validate(String userID, Response.Listener<String>listener){

    	super(Request.Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("user_id",userID);
    }
    */
	@GetMapping("/{userId}")
	public UserInfoData getUser(@PathVariable String userId) {
		return specificUserService.getUser(userId);
	}
	
}
