package com.object.objectrestaurant.controller.user;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/{userId}/favorite")
public class userFavoriteController {
	
	/*
	String URL="http://218.236.123.14:9090/get_user_favorite_item.php"; //사용자id 받아서 즐겨찾기 아이템 가져옴
    public Request_get_user_store_favorite(String userid, Response.Listener<String>listener){
        
    	super(Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("user_id",userid);
    }
	 */
	/*
	String URL="http://218.236.123.14:9090/load_user_favorite.php"; //사용자id 받아서 즐겨찾기 가져옴?
    public Request_get_favorite(String userid, Response.Listener<String>listener){
     
    	super(Method.POST,URL,listener,null);
        map=new HashMap<>();
        System.out.println("유저아이디보내ㅑ지냐:"+userid);
        map.put("user_id",userid);
    }
	 */
	@GetMapping()
	public String getFavoriteStore(@PathVariable(name = "userId") String userId) {
		return "유저 '"+userId+"'의 스토어 '모든' 즐겨찾기 가져오기";
	}
	
	/*
	String URL="http://218.236.123.14:9090/input_user_favorite.php"; //사용자id 스토어id 받아서 즐겨찾기 등록
    public Request_input_user_favorite(String userid,int storeid, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);

        map=new HashMap<>();
        System.out.println("유저아이디보내ㅑ지냐:"+userid);
        System.out.println("스토어아디보내지냐"+storeid);
        map.put("user_id",userid);
        map.put("store_id",String.valueOf(storeid));
    }
	 */
	@PostMapping()
	public String registerFavoriteStore(@PathVariable(name = "userId") String userId) {
		return "유저 '"+userId+"'의 스토어 '특정' 즐겨찾기 등록";
	}
	
	
	/*
	String URL="http://218.236.123.14:9090/delete_user_favorite.php"; //사용자id, 스토어id를 주고 즐겨찾기 삭제
    public Request_delete_favorite(String userid,int storeid, Response.Listener<String>listener){
     
    	super(Method.POST,URL,listener,null);
        map=new HashMap<>();
        System.out.println("유저아이디보내ㅑ지냐:"+userid);
        map.put("user_id",userid);
        map.put("store_id",String.valueOf(storeid));
    }
	 */
	@DeleteMapping("/{storeId}")
	public String deleteFavoriteStore(@PathVariable String userId, 
			@PathVariable String storeId) {
		return "유저 '"+userId+"'의 스토어 '"+storeId+"' 즐겨찾기 삭제";
	}
	
	
	
}
