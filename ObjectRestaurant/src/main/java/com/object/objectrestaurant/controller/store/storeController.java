package com.object.objectrestaurant.controller.store;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store")
public class storeController {
	/*
	String URL="http://218.236.123.14:9090/load_store_id.php"; // ceoid 주고 스토어가져오기
    public Request_Store_ID(String userID, Response.Listener<String>listener){

    	super(Request.Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("ceo_id",userID);
    }
	 */
	
	@GetMapping("")
	public String getStoreAll() {
		return "모든 스토어 정보 가져오기";
	}
	
	/*
	String URL="http://218.236.123.14:9090/input_store_info.php";//store(name, address, time, img, mension, ceoid)주고 생성
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
	 */
	@PostMapping("")
	public String registerStore() {
		return "스토어 등록";
	}
	
	/*
	String URL="http://218.236.123.14:9090/load_store_deep_info.php";// storeid 주고 세부정보 가져오기? 
    public Request_store_info(int store_id, Response.Listener<String>listener){

    	super(Request.Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("store_id",String.valueOf(store_id));
    }
	*/
	/*
	String URL="http://218.236.123.14:9090/get_store_name.php"; //스토어 id주고 이름가져오기
    public Request_get_store_name(int storeid, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);

        map=new HashMap<>();
        map.put("store_id",String.valueOf(storeid));
    }
	 */
	@GetMapping("/{storeId}")
	public String getStore(@PathVariable(name = "storeId")String storeId
			, @RequestParam(required = false) String select) {
		if(select == null)
			return "스토어id '"+storeId+"'의 세부정보 가져오기";
		
		if(select.equals("name"))
			return "스토어id '"+storeId+"'의 이름만 가져오기";
		
		return "스토어id '"+storeId+"'의 "+select+"만 가져오기";
	}
	
	
}
