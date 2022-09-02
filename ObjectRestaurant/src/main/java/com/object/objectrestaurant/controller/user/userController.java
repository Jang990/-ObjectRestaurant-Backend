package com.object.objectrestaurant.controller.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class userController {
	
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
	public String registerUser() {
		//시큐리티 연동부분.
		return "사용자 등록";
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
	public String getUser(@PathVariable String userId) {
		return "ID가 '"+userId + "'인 사용자 검색";
	}
	
}
