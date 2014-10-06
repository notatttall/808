package com.c503.lbs.service;

import com.c503.lbs.control.RestCar;
import com.c503.lbs.entity.RTLocation;

/**
 * 
 * 测试  上线车辆
 * @author huchaofeng
 *
 */
public class CarLogin {
	
	public static boolean login(RestCar car){
		RTLocation.carRT.put(car.getId(), car);
		return false;
	}

	public static void test() {
		RestCar car = new RestCar();
		car.setId("黑A0001");
		car.setLatitude("1111");
		car.setLongitude("222");
		login(car);
		
		RestCar car3 = new RestCar();
		car3.setId("黑D22222");
		car3.setLatitude("45.826");
		car3.setLongitude("126.538803");
		login(car3);
			
	}
}
