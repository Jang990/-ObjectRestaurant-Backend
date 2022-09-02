package com.object.objectrestaurant.controller;

public class garbeage {
	final static  private String URL="http://218.236.123.14:9090/ceo_login.php";
	public Request_CEO_LoginRequest(String userID, String userPassword, Response.Listener<String> listener) {
        
		super(Method.POST, URL, listener, null);
        map = new HashMap<>();
        map.put("ceo_id",userID);
        map.put("ceo_pw", userPassword);
    }
	
    
    //?? 이 셋은 뭐에 쓰는거지?
    final static  private String URL="http://218.236.123.14:9090/load_user_alldata.php";
    public Request_User_AllData(Response.Listener<String>listener){
    	
        super(Method.POST,URL,listener,null);
        map=new HashMap<>();
    }
    final static private String URL="http://218.236.123.14:9090/load_user_nickname.php"; //사용자 닉네임 가져옴?
    public Request_get_user_nickname(Response.Listener<String>listener){

    	super(Method.POST,URL,listener,null);
        map=new HashMap<>();
    }
    final static  private String URL="http://218.236.123.14:9090/load_ceo_alldata.php";
    public Request_Ceo_AllData(Response.Listener<String>listener){
    	
    	super(Method.POST,URL,listener,null);
    	map=new HashMap<>();
    }
    
    
    
    final static  private String URL="http://218.236.123.14:9090/delete_faq.php";
    public Request_delete_faq(int store_id, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);

        map=new HashMap<>();
        map.put("faq_id",String.valueOf(store_id));
    }
    
    
    
    
    final static  private String URL="http://218.236.123.14:9090/get_faq.php";
    public Request_get_faq(int store_id, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);

        map=new HashMap<>();
        map.put("store_id",String.valueOf(store_id));
        System.out.println("스토어아이디값은요@@"+store_id);
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
