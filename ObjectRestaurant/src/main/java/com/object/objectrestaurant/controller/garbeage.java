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
    
    
    final static  private String URL="http://218.236.123.14:9090/input_store_info.php";
    public Request_InputStore(String a, String b, String c,String d,String e,String f, Response.Listener<String> listener) {
        
    	super(Method.POST, URL, listener, null);
        map = new HashMap<>();
        map.put("store_name",a);
        map.put("store_address", b);
        map.put("store_time", c);
        map.put("store_images",String.valueOf(d));
        System.out.println("여기기록되나");
        System.out.println("길이:"+d.length());
        map.put("store_mension", e);
        map.put("ceo_id",f);
    }
    
    
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
    
    
    final static  private String URL="http://218.236.123.14:9090/load_menu_id.php";
    public Request_Menu_ID(String a, String b,String d,String e, Response.Listener<String>listener){
        super(Request.Method.POST,URL,listener,null);

        map=new HashMap<>();
        map.put("store_id",a);
        map.put("menu_name", b);
        map.put("menu_price",d);
        map.put("menu_info", e);
        System.out.println("작동하냐구요ㅊ");
    }
    
    
    final static  private String URL="http://218.236.123.14:9090/Register.php";
    public Request_Register(String userID, String userPassword, String userName, Response.Listener<String> listener) {
     
    	super(Method.POST, URL, listener, null);
        map = new HashMap<>();
        map.put("user_id",userID);
        map.put("user_pw", userPassword);
        map.put("user_nickname", userName);
    }
    
    
    final static  private String URL="http://218.236.123.14:9090/load_store_id.php";
    public Request_Store_ID(String userID, Response.Listener<String>listener){

    	super(Request.Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("ceo_id",userID);
    }

    final static  private String URL="http://218.236.123.14:9090/load_user_alldata.php";
    public Request_User_AllData(Response.Listener<String>listener){
    	
        super(Method.POST,URL,listener,null);
        map=new HashMap<>();
    }
    
    
    
    final static  private String URL="http://218.236.123.14:9090/load_User_Review.php";
    public Request_User_Review(String userID, Response.Listener<String>listener){

    	super(Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("user_id",userID);
    }
    
    final static  private String URL="http://218.236.123.14:9090/Validate_ID.php";
    public Request_Validate(String userID, Response.Listener<String>listener){

    	super(Request.Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("user_id",userID);
    }
    
    final static  private String URL="http://218.236.123.14:9090/delete_Review.php";
    public Request_delete_Review(int reviewid, Response.Listener<String>listener){
     
    	super(Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("review_id", String.valueOf(reviewid));
        System.out.println("보낸 리뷰값"+reviewid);
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
    
    final static  private String URL="http://218.236.123.14:9090/input_delete_menu.php";
    public Request_delete_menu(String userID, Response.Listener<String>listener){
    
    	super(Request.Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("menu_id",userID);
        System.out.println("보낸 메뉴아이디는?"+userID);
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
    
    final static  private String URL="http://218.236.123.14:9090/load_get_Review.php";
    public Request_get_Review(int storeid, Response.Listener<String>listener){

    	super(Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("store_id",String.valueOf(storeid));
    }

    final static  private String URL="http://218.236.123.14:9090/load_get_ReviewID.php";
    public Request_get_ReviewID(String date,String userid,String mension, Response.Listener<String>listener){
        
    	super(Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("review_datetime",date);
        map.put("user_id",userid);
        map.put("review_mension",mension);
    }
    
    final static  private String URL="http://218.236.123.14:9090/load_get_ReviewID_CEO.php";
    public Request_get_ReviewID_CEO(String usernickname,int storeid, String mension, Response.Listener<String>listener){

    	super(Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("user_nickname",usernickname);
        map.put("store_id",String.valueOf(storeid));
        map.put("review_mension",mension);
    }
    
    
    final static  private String URL="http://218.236.123.14:9090/load_get_Review_CEO.php";
    public Request_get_Review_CEO(int storeid, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);

        map=new HashMap<>();
        map.put("store_id",String.valueOf(storeid));
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
    
    
    final static  private String URL="http://218.236.123.14:9090/load_get_menu.php";
    public Request_get_menu(int storeid, Response.Listener<String>listener){
        super(Request.Method.POST,URL,listener,null);

        map=new HashMap<>();
        map.put("store_id",String.valueOf(storeid));
    }
    
    
    final static  private String URL="http://218.236.123.14:9090/get_store_name.php";
    public Request_get_store_name(int storeid, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);

        map=new HashMap<>();
        map.put("store_id",String.valueOf(storeid));
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
    
    
    final static  private String URL="http://218.236.123.14:9090/input_insert_menu.php";
    public Request_insert_menu(String a,String w, String b, String c,String d,String e, Response.Listener<String> listener) {

    	super(Method.POST, URL, listener, null);
        map = new HashMap<>();
        map.put("store_id",a);
        map.put("menu_id",w);
        map.put("menu_name", b);
        map.put("menu_image", c);
        map.put("menu_price",d);
        map.put("menu_info", e);
    }

    
    final static  private String URL="http://218.236.123.14:9090/get_revisit.php";
    public Request_revisit(int store_id, Response.Listener<String>listener){
        
    	super(Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("store_id",String.valueOf(store_id));
    }
    
    final static  private String URL="http://218.236.123.14:9090/load_store_deep_info.php";
    public Request_store_info(int store_id, Response.Listener<String>listener){

    	super(Request.Method.POST,URL,listener,null);
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
    
    
    final static  private String URL="http://218.236.123.14:9090/input_update_menu.php";
    public Request_update_menu(String a, String b, String c,String d,String e, Response.Listener<String> listener) {

    	super(Method.POST, URL, listener, null);
        map = new HashMap<>();
        map.put("menu_id",a);
        map.put("menu_name", b);
        map.put("menu_image", c);
        map.put("menu_price",String.valueOf(d));
        map.put("menu_info", e);
    }

}
