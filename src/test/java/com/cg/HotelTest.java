package com.cg;

import org.junit.Test;

import com.cg.HotelReservationMain;

import junit.framework.Assert;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HotelTest {
    
	@Test
	public void checkCheapestHotelForRegularCustomerInWeekdayRate() throws ParseException {
		HotelReservationMain hotelReservationMain = new HotelReservationMain();
		String hotel = hotelReservationMain.findCheapestHotelForRegularCustomersInWeekDayRate("10Sep2020","11Sep2020");
	    Assert.assertEquals("LakeWood", hotel);
	}
	
	@Test
	public void checkCheapestHotelForRegularCustomerConsideringWeekdayAndWeekend() throws ParseException {
		HotelReservationMain hotelReservationMain = new HotelReservationMain();
		List<String> hotelList = hotelReservationMain.findCheapestHotelForRegularCustomersConsideringWeekdayAndWeekend("10Sep2020","11Sep2020");
	    List<String> expectedList = new ArrayList<>(Arrays.asList("LakeWood","BridgeWood"));
	    Assert.assertEquals(expectedList, hotelList);
	}
	
	@Test
	public void checkCheapestBestRatedHotelForRegularCustomers() throws ParseException {
		HotelReservationMain hotelReservationMain = new HotelReservationMain();
		String hotel = hotelReservationMain.findCheapestBestRatedHotelForRegularCustomer("10Sep2020","11Sep2020");
		Assert.assertEquals("BridgeWood", hotel);
	}
}
