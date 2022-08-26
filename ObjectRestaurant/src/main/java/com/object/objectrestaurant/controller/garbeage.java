package com.object.objectrestaurant.controller;

public class garbeage {
	final static  private String URL="http://218.236.123.14:9090/ceo_login.php";
	public Request_CEO_LoginRequest(String userID, String userPassword, Response.Listener<String> listener) {
        
		super(Method.POST, URL, listener, null);
        map = new HashMap<>();
        map.put("ceo_id",userID);
        map.put("ceo_pw", userPassword);
    }
	
	final static  private String URL="http://218.236.123.14:9090/load_ceo_alldata.php";
    public Request_Ceo_AllData(Response.Listener<String>listener){
    
    	super(Method.POST,URL,listener,null);
        map=new HashMap<>();
    }
    
    
    
    
    final static  private String URL="http://218.236.123.14:9090/Register.php";
    public Request_Register(String userID, String userPassword, String userName, Response.Listener<String> listener) {
     
    	super(Method.POST, URL, listener, null);
        map = new HashMap<>();
        map.put("user_id",userID);
        map.put("user_pw", userPassword);
        map.put("user_nickname", userName);
    }
    
    

    final static  private String URL="http://218.236.123.14:9090/load_user_alldata.php";
    public Request_User_AllData(Response.Listener<String>listener){
    	
        super(Method.POST,URL,listener,null);
        map=new HashMap<>();
    }
    
    
    
    
    
    final static  private String URL="http://218.236.123.14:9090/Validate_ID.php";
    public Request_Validate(String userID, Response.Listener<String>listener){

    	super(Request.Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("user_id",userID);
    }
    
    
    final static  private String URL="http://218.236.123.14:9090/delete_faq.php";
    public Request_delete_faq(int store_id, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);

        map=new HashMap<>();
        map.put("faq_id",String.valueOf(store_id));
    }
    
    final static  private String URL="http://218.236.123.14:9090/delete_user_favorite.php";
    public Request_delete_favorite(String userid,int storeid, Response.Listener<String>listener){
     
    	super(Method.POST,URL,listener,null);
        map=new HashMap<>();
        System.out.println("유저아이디보내ㅑ지냐:"+userid);
        map.put("user_id",userid);
        map.put("store_id",String.valueOf(storeid));
    }
    
    
	
    
    final static  private String URL="http://218.236.123.14:9090/load_ceo_reservation.php";
    public Request_get_CEO_reservation(int storeid, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);

        map=new HashMap<>();
        map.put("store_id",String.valueOf(storeid));
    }
    
    final static  private String URL="http://218.236.123.14:9090/load_ceo_store_info.php";
    public Request_get_CEO_storeInfo(String userID, Response.Listener<String>listener){

    	super(Request.Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("ceo_id",userID);
    }
    
    final static  private String URL="http://218.236.123.14:9090/get_faq.php";
    public Request_get_faq(int store_id, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);

        map=new HashMap<>();
        map.put("store_id",String.valueOf(store_id));
        System.out.println("스토어아이디값은요@@"+store_id);
    }
    
    final static  private String URL="http://218.236.123.14:9090/load_user_favorite.php";
    public Request_get_favorite(String userid, Response.Listener<String>listener){
     
    	super(Method.POST,URL,listener,null);
        map=new HashMap<>();
        System.out.println("유저아이디보내ㅑ지냐:"+userid);
        map.put("user_id",userid);
    }
    
    
    
    final static  private String URL="http://218.236.123.14:9090/load_user_nickname.php";
    public Request_get_user_nickname(Response.Listener<String>listener){

    	super(Method.POST,URL,listener,null);
        map=new HashMap<>();
    }
    
    
    final static  private String URL="http://218.236.123.14:9090/load_user_reservation.php";
    public Request_get_user_reservation(String userid, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);

        map=new HashMap<>();
        map.put("user_id",userid);
    }

    
    final static  private String URL="http://218.236.123.14:9090/get_user_favorite_item.php";
    public Request_get_user_store_favorite(String userid, Response.Listener<String>listener){
        
    	super(Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("user_id",userid);
    }
    
    
    final static  private String URL="http://218.236.123.14:9090/input_reservation.php";
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
    
    
    final static  private String URL="http://218.236.123.14:9090/input_user_favorite.php";
    public Request_input_user_favorite(String userid,int storeid, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);

        map=new HashMap<>();
        System.out.println("유저아이디보내ㅑ지냐:"+userid);
        System.out.println("스토어아디보내지냐"+storeid);
        map.put("user_id",userid);
        map.put("store_id",String.valueOf(storeid));
    }
    
    
    final static  private String URL="http://218.236.123.14:9090/update_ceo_mension.php";
    public Request_insert_ceo_mension(int reviewid,String ceo_review, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);

        map=new HashMap<>();
        map.put("review_id",String.valueOf(reviewid));
        map.put("review_ceo_mension",ceo_review);
    }
    
    
    final static  private String URL="http://218.236.123.14:9090/input_insert_faq.php";
    public Request_insert_faq(String q,String a,int storeid, Response.Listener<String>listener){
    
    	super(Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("store_id",String.valueOf(storeid));
        map.put("faq_q",q);
        map.put("faq_a",a);
        System.out.println("스토어아이디:"+storeid);
    }
    
    final static  private String URL="http://218.236.123.14:9090/get_revisit.php";
    public Request_revisit(int store_id, Response.Listener<String>listener){
        
    	super(Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("store_id",String.valueOf(store_id));
    }
    
    
    
    
    final static  private String URL="http://218.236.123.14:9090/update_ceo_reservation.php";
    public Request_update_ceo_reservation(int reservation_id,String c, Response.Listener<String>listener){
        
    	super(Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("reservation_id",String.valueOf(reservation_id));
        map.put("reservation_check",c);
    }

    
    final static  private String URL="http://218.236.123.14:9090/update_ceo_reservation_reject.php";
    public Request_update_ceo_reservation_reject(int reservation_id, String c, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);

        map=new HashMap<>();
        map.put("reservation_id",String.valueOf(reservation_id));
        map.put("reservation_check",c);
    }
    
    
    final static  private String URL="http://218.236.123.14:9090/update_faq.php";
    public Request_update_faq(String q, String a, int storeid, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);

        map=new HashMap<>();
        map.put("faq_id",String.valueOf(storeid));
        map.put("faq_q",q);
        map.put("faq_a",a);
        System.out.println("faq아이디:"+storeid);
        System.out.println("faq :"+q);
        System.out.println("faqa :"+a);
    }

}
