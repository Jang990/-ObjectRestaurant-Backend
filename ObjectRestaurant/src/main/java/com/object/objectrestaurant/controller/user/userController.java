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
	
	/*
	
	 */
	
	
	
	
	
	
	//예약부분
	
	/*
	String URL="http://218.236.123.14:9090/load_user_reservation.php"; //사용자id로 예약정보 가져옴
    public Request_get_user_reservation(String userid, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);

        map=new HashMap<>();
        map.put("user_id",userid);
    }
	 */
	
	/*
	String URL="http://218.236.123.14:9090/input_reservation.php"; //사용자정보와 예약정보를 주고 예약등록
    public Request_input_reservation(String userid,String usernickname,int storeid,String date,String time,
                                     String people,String check,String storename,String storeaddress,Response.Listener<String>listener){

    	super(Method.POST,URL,listener,null);
        map=new HashMap<>();
        System.out.println("유저아이디보내ㅑ지냐:"+userid);
        map.put("user_id",userid);
        map.put("user_nickname",usernickname);
        map.put("store_id",String.valueOf(storeid));
        map.put("reservation_date",date);
        map.put("reservation_time",time);
        map.put("reservation_people",people);
        map.put("reservation_check",check);
        map.put("reservation_storename",storename);
        map.put("reservation_storeaddress",storeaddress);
    }
	 */
}
