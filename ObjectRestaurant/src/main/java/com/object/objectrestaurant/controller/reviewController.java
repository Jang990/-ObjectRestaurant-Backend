package com.object.objectrestaurant.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class reviewController {
	/*
	final static  private String URL="http://218.236.123.14:9090/input_review.php";
    public Request_Insert_Review(String a,String w, String b, String c,String d,String e,String f,String g, Response.Listener<String> listener) {
        super(Method.POST, URL, listener, null);

        map = new HashMap<>();
        map.put("user_id",a);
        map.put("store_id",w);
        map.put("review_image1", b);
        map.put("review_image2", c);
        map.put("review_image3",d);
        map.put("review_like", e);
        map.put("review_mension", f);
        map.put("user_nickname", g);
    }
	 */
	/*
	final static  private String URL="http://218.236.123.14:9090/load_User_Review.php";
    public Request_User_Review(String userID, Response.Listener<String>listener){

    	super(Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("user_id",userID);
    }
	 */
	/*
	final static  private String URL="http://218.236.123.14:9090/load_get_Review.php";
    public Request_get_Review(int storeid, Response.Listener<String>listener){

    	super(Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("store_id",String.valueOf(storeid));
    }
	 */
	/*
	final static  private String URL="http://218.236.123.14:9090/load_get_ReviewID.php";
    public Request_get_ReviewID(String date,String userid,String mension, Response.Listener<String>listener){
        
    	super(Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("review_datetime",date);
        map.put("user_id",userid);
        map.put("review_mension",mension);
    }
	 */
	/*
	final static  private String URL="http://218.236.123.14:9090/load_get_ReviewID_CEO.php";
    public Request_get_ReviewID_CEO(String usernickname,int storeid, String mension, Response.Listener<String>listener){

    	super(Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("user_nickname",usernickname);
        map.put("store_id",String.valueOf(storeid));
        map.put("review_mension",mension);
    }
	 */
	/*
	final static  private String URL="http://218.236.123.14:9090/load_get_Review_CEO.php";
    public Request_get_Review_CEO(int storeid, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);

        map=new HashMap<>();
        map.put("store_id",String.valueOf(storeid));
    }
	 */
	/*
	final static  private String URL="http://218.236.123.14:9090/delete_Review.php";
    public Request_delete_Review(int reviewid, Response.Listener<String>listener){
     
    	super(Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("review_id", String.valueOf(reviewid));
        System.out.println("보낸 리뷰값"+reviewid);
    }
	 */
	
	@GetMapping("/review")
	public String getUserReview() {
		return "리뷰확인";
	}
	
	@PostMapping("/review") 
	public boolean registerUserReview() {
		//유저 리뷰 등록
		return true;
	}
}
