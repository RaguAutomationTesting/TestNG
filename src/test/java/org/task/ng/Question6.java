package org.task.ng;

import org.base.BaseClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Question6 extends BaseClass {

	public WebDriver driver;

	@Parameters("browsertype")
	@Test
	private void tc1(String browser) {
		if (browser.equals("chrome")) {
			WebDriverManager.chromedriver().setup();

			driver = new ChromeDriver();

		} else if (browser.equals("firefox")) {
			WebDriverManager.firefoxdriver().setup();

			driver = new FirefoxDriver();

		} else {
			WebDriverManager.edgedriver().setup();

			driver = new EdgeDriver();
		}

		driver.get("http://www.greenstechnologys.com/");
		driver.manage().window().maximize();

	}

}
