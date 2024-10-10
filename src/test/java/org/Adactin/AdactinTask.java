package org.Adactin;

import java.io.IOException;
import java.util.Date;

import org.adactinobjectrepo.BookHotelPojo;
import org.adactinobjectrepo.BookingConfirmPage;
import org.adactinobjectrepo.LoginPagePojo;
import org.adactinobjectrepo.SearchHotelPagePojo;
import org.base.BaseClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdactinTask extends BaseClass {

	@BeforeMethod
	private void tcStartTime() {
		System.out.println("Test case Starts:  " + new Date());

	}

	@AfterMethod
	private void tcEndTime() {
		System.out.println("Test case ends:    " + new Date());

	}

	@BeforeClass
	private void browserLaunch() {

		loadBrowser("chrome");
		maximizeBrowser();
		launchUrl("http://www.adactin.com/HotelApp/");
		applyWaitToAllElements();
	}

	@AfterClass  
	private void closeBrowser() {
		driver.quit();

	}

	@Test
	private void tc1() throws IOException {

		LoginPagePojo l = new LoginPagePojo();

		enterText(l.getTxtUsername(), readDataFromExcel(1, 0));

		enterText(l.getTxtPassword(), readDataFromExcel(1, 1));

		clickElement(l.getBtnLogin());

		pauseExecution(3000);
	}

	@Test
	private void tc2() throws IOException {

		SearchHotelPagePojo s = new SearchHotelPagePojo();

		selectDropDownUsingValue(s.getLocation(), readDataFromExcel(1, 2));

		selectDropDownUsingValue(s.getHotels(), readDataFromExcel(1, 3));

		selectDropDownUsingValue(s.getRoomType(), readDataFromExcel(1, 4));

		selectDropDownUsingValue(s.getAdultRooms(), readDataFromExcel(1, 8));

		selectDropDownUsingValue(s.getChildRooms(), readDataFromExcel(1, 9));

		clickElement(s.getBtnSearch());

		pauseExecution(3000);
	}

	@Test
	private void tc3() {

		SearchHotelPagePojo s1 = new SearchHotelPagePojo();

		clickElement(s1.getBtnRadio());

		clickElement(s1.getBtnContinue());

		pauseExecution(3000);
	}

	@Test
	private void tc4() throws IOException {

		BookHotelPojo b = new BookHotelPojo();

		enterText(b.getFirstName(), readDataFromExcel(1, 10));

		enterText(b.getLastName(), readDataFromExcel(1, 11));

		enterText(b.getAddress(), readDataFromExcel(1, 12));

		enterText(b.getCreditCardNo(), readDataFromExcel(1, 13));

		selectDropDownUsingValue(b.getCreditCardType(), readDataFromExcel(1, 14));

		selectDropDownUsingValue(b.getCreditCardMonth(), readDataFromExcel(1, 15));

		selectDropDownUsingValue(b.getCreditCardYear(), readDataFromExcel(1, 16));

		enterText(b.getCcvNo(), readDataFromExcel(1, 17));

		clickElement(b.getBtnBookNow());
	}

	@Test
	private void tc5() throws IOException {

		BookingConfirmPage b1 = new BookingConfirmPage();

		String data1 = getAttributeValueOfWebelement(b1.getOrderNo());

		updationInExcel(0, 18, "OrderNo");
		updationInExcel(1, 18, data1);
	}

}
