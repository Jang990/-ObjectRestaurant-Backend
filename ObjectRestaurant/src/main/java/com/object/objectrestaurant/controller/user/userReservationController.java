package com.object.objectrestaurant.controller.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/{userId}/reservation")
public class userReservationController {
	//예약부분

	/*
	String URL="http://218.236.123.14:9090/load_user_reservation.php"; //사용자id로 예약정보 가져옴
	public Request_get_user_reservation(String userid, Response.Listener<String>listener){
	    super(Method.POST,URL,listener,null);

	    map=new HashMap<>();
	    map.put("user_id",userid);
	}
	*/
	@GetMapping
	public String getReservation(@PathVariable String userId) {
		return "유저 '"+userId+"'의 '모든' 예약정보 가져오기";
	}

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
	@PostMapping
	public String registerReservation(@PathVariable String userId) {
		return "유저 '"+userId+"'의 예약정보 등록";
	}
}
