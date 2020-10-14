package com.cg;

import org.junit.Test;

import com.cg.HotelReservationMain;

import junit.framework.Assert;

import static org.junit.Assert.*;

import java.text.ParseException;

public class HotelTest {
    
	@Test
	public void checkCheapestHotelForRegularCustomerInWeekdayRate() throws ParseException {
		HotelReservationMain hotelReservationMain = new HotelReservationMain();
		String hotel = hotelReservationMain.findCheapestHotelForRegularCustomersInWeekDayRate("10Sep2020","11Sep2020");
	    Assert.assertEquals("LakeWood", hotel);
	}
}
