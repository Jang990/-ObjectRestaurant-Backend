package com.object.objectrestaurant.controller.ceo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ceo")
public class ceoController {
    /*
	String URL="http://218.236.123.14:9090/load_ceo_store_info.php";
    public Request_get_CEO_storeInfo(String userID, Response.Listener<String>listener){

    	super(Request.Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("ceo_id",userID);
    }
     */
	@GetMapping("/{ceoId}/store")
	public String getStore(@PathVariable String ceoId) {
		return "ceo '"+ceoId+"'의 가게 검색";
	}
	
	//여기서 뇌정지왔다 /ceo/{ceoId}/reservation/{storeId} 이 맞는거지?
	
	/*
    String URL="http://218.236.123.14:9090/update_ceo_mension.php"; // 사장이 작성한 리뷰에 대한 답글 업데이트
    public Request_insert_ceo_mension(int reviewid,String ceo_review, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);

        map=new HashMap<>();
        map.put("review_id",String.valueOf(reviewid));
        map.put("review_ceo_mension",ceo_review);
    }
    */
    
	/*
    String URL="http://218.236.123.14:9090/update_ceo_reservation.php"; // 예약 승낙 업데이트
    public Request_update_ceo_reservation(int reservation_id,String c, Response.Listener<String>listener){
        
    	super(Method.POST,URL,listener,null);
        map=new HashMap<>();
        map.put("reservation_id",String.valueOf(reservation_id));
        map.put("reservation_check",c);
    }
    */
    /*
    String URL="http://218.236.123.14:9090/update_ceo_reservation_reject.php"; //예약 거부 업데이트
    public Request_update_ceo_reservation_reject(int reservation_id, String c, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);

        map=new HashMap<>();
        map.put("reservation_id",String.valueOf(reservation_id));
        map.put("reservation_check",c);
    }
	 */
	
}
