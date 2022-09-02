package com.object.objectrestaurant.controller.ceo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ceo/{ceoId}/reservation")
public class ceoReservationController {
	/*
	String URL="http://218.236.123.14:9090/load_ceo_reservation.php"; //가게 예약 가져오기
    public Request_get_CEO_reservation(int storeid, Response.Listener<String>listener){
        super(Method.POST,URL,listener,null);

        map=new HashMap<>();
        map.put("store_id",String.valueOf(storeid));
    }
    */
	@GetMapping("")
	public String getStore(@PathVariable String ceoId) {
		return "ceo '"+ceoId+"'의 가게 검색";
	}
}
