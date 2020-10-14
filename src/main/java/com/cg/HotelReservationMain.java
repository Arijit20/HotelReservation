package com.cg;

import java.util.ArrayList;
import java.util.List;

public class HotelReservationMain {
	final Hotel LAKEWOOD = new Hotel("LakeWood", 110);
	final Hotel BRIDGEWOOD = new Hotel("BridgeWood", 150);
	final Hotel RIDGEWOOD = new Hotel("RidgeWood", 220);

	List<Hotel> hotelList = new ArrayList<>();

	public HotelReservationMain() {
		hotelList.add(LAKEWOOD);
		hotelList.add(BRIDGEWOOD);
		hotelList.add(RIDGEWOOD);
	}
}
