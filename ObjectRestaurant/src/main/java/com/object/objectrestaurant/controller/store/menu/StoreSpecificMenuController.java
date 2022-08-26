package com.object.objectrestaurant.controller.store.menu;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/store/{storeId}")
public class StoreSpecificMenuController {
	
	@DeleteMapping("/menu/{menuId}")
	public String deleteStoreMenu(@PathVariable(name = "storeId")String storeId, 
			@PathVariable(name = "menuId")String menuId) {
		return "스토어 '"+storeId+"'의 메뉴id '"+menuId+"' 삭제";
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
	@PutMapping("/menu/{menuId}")
	public String updateMenu(@PathVariable(name = "storeId")String storeId,
			@PathVariable(name = "menuId")String menuId) {
		return "스토어 '"+storeId+"'의 '"+menuId+"' 메뉴 업데이트";
	}
	
}
