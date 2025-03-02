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

	@SuppressWarnings("deprecation")
	@Test
	public void checkCheapestHotelForRegularCustomerInWeekdayRate() throws ParseException {
		HotelReservationMain hotelReservationMain = new HotelReservationMain();
		String hotel = hotelReservationMain.findCheapestHotelForRegularCustomersInWeekDayRate("10Sep2020", "11Sep2020");
		Assert.assertEquals("Lakewood", hotel);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void checkCheapestHotelForRegularCustomer() throws ParseException {
		HotelReservationMain hotelReservationMain = new HotelReservationMain();
		List<String> hotelList = hotelReservationMain.findCheapestHotels("Regular", "10Sep2020", "11Sep2020");
		List<String> expectedList = new ArrayList<>(Arrays.asList("Lakewood", "Bridgewood"));
		Assert.assertEquals(expectedList, hotelList);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void checkCheapestBestRatedHotelForRegularCustomers() throws ParseException {
		HotelReservationMain hotelReservationMain = new HotelReservationMain();
		String hotel = hotelReservationMain.findCheapestBestRatedHotel("Regular", "10Sep2020", "11Sep2020");
		Assert.assertEquals("Bridgewood", hotel);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void checkBestRatedHotelForRegularCustomers() throws ParseException {
		HotelReservationMain hotelReservationMain = new HotelReservationMain();
		String hotel = hotelReservationMain.findBestRatedHotel("Regular", "10Sep2020", "11Sep2020");
		Assert.assertEquals("Ridgewood", hotel);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void checkCheapestBestRatedHotelForRewardCustomers() throws ParseException {
		HotelReservationMain hotelReservationMain = new HotelReservationMain();
		String hotel = hotelReservationMain.findCheapestBestRatedHotel("Reward", "10Sep2020", "11Sep2020");
		Assert.assertEquals("Ridgewood", hotel);
	}

	@SuppressWarnings("deprecation")
	@Test
	public void checkWithInvalidDateFormat() {
		HotelReservationMain hotelReservationMain = new HotelReservationMain();
		try {
			String hotel = hotelReservationMain.findCheapestBestRatedHotel("Reward", "102020", "11Sep");
		} catch (Exception e) {
			Assert.assertEquals("Enter date in proper format", e.getMessage());
		}
	}

	@SuppressWarnings("deprecation")
	@Test
	public void checkWithInvalidDateTypeOfCustomer() {
		HotelReservationMain hotelReservationMain = new HotelReservationMain();
		try {
			String hotel = hotelReservationMain.findCheapestBestRatedHotel("hotel", "10Sep2020", "11Sep2020");
		} catch (Exception e) {
			Assert.assertEquals("Enter either Reward or Regular", e.getMessage());
		}
	}
}
