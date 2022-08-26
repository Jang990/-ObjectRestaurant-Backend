package com.object.objectrestaurant.controller.store.menu;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store/{storeId}")
public class StoreMenuController {
	/*
	String URL="http://218.236.123.14:9090/load_get_menu.php"; //스토어id를 주면 메뉴 리스트 가져오기  
    public Request_get_menu(int storeid, Response.Listener<String>listener){
        super(Request.Method.POST,URL,listener,null);

        map=new HashMap<>();
        map.put("store_id",String.valueOf(storeid));
    }
	 */
	@GetMapping("/menu")
	public String getStoreMenu(@PathVariable(name = "storeId")String storeId, @RequestParam(required = false) String select) {
		if(select == null)
			return "스토어 '"+storeId+"'의 메뉴 가져오기";
		
		return "스토어 '"+storeId+"'의 메뉴의 " +select+ " 가져오기";
	}
	
	/*
	String URL="http://218.236.123.14:9090/input_delete_menu.php";//메뉴id 주고 삭제 
    public Request_delete_menu(String userID, Response.Listener<String>listener){
    
    	super(Request.Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("menu_id",userID);
        System.out.println("보낸 메뉴아이디는?"+userID);
    }
	 */
	@DeleteMapping("/menu")
	public String deleteStoreMenu(@PathVariable(name = "storeId")String storeId) {
		return "메뉴 삭제";
	}
	
	/*
	String URL="http://218.236.123.14:9090/input_insert_menu.php";//스토어id, 메뉴(id, name, img, price, info) 주고 삽입
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
	 */
	@PostMapping("/menu")
	public String registerMenu(@PathVariable(name = "storeId")String storeId) {
		return "메뉴 추가";
	}
	
	/*
	String URL="http://218.236.123.14:9090/input_update_menu.php";//메뉴(id, name, img, price, info)를 주고 업데이트 
    public Request_update_menu(String a, String b, String c,String d,String e, Response.Listener<String> listener) {

    	super(Method.POST, URL, listener, null);
        map = new HashMap<>();
        map.put("menu_id",a);
        map.put("menu_name", b);
        map.put("menu_image", c);
        map.put("menu_price",String.valueOf(d));
        map.put("menu_info", e);
    }
	 */
	@PutMapping("/menu")
	public String updateMenu(@PathVariable(name = "storeId")String storeId) {
		return "메뉴 추가";
	}
	
	/*
	String URL="http://218.236.123.14:9090/load_menu_id.php"; //메뉴(이름, 가격, 정보) + 스토어id 주고 메뉴id 가져오기    
    public Request_Menu_ID(String a, String b,String d,String e, Response.Listener<String>listener){
        super(Request.Method.POST,URL,listener,null);

        map=new HashMap<>();
        map.put("store_id",a);
        map.put("menu_name", b);
        map.put("menu_price",d);
        map.put("menu_info", e);
        System.out.println("작동하냐구요ㅊ");
    }
    */
	
}
