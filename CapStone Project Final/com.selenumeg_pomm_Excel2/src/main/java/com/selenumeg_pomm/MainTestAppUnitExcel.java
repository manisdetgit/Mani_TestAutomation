package com.selenumeg_pomm;

import static org.junit.jupiter.api.Assertions.assertTrue;

import java.time.Duration;
import java.util.stream.Stream;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.excel.utils.ExcelReadUtils;
import com.excel.utils.ExcelWriteUtils;

import static org.junit.jupiter.api.Assertions.*;

public class MainTestAppUnitExcel {

	private static WebDriver driver;
	private static WebDriverWait wait;
    private static final String BASE_URL = "file://C:\\Users\\Administrator\\eclipse-workspace\\com.selenumeg_pomm_Excel2\\src\\main\\resources\\HTML.html";


	@BeforeAll
	public static void setup() {
		//System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver-win32\\chromedriver.exe");

		// Create driver instance
		driver = new ChromeDriver();

		// wait
		wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		ExcelReadUtils.init();
		ExcelWriteUtils.init();
	}

	static Stream<Arguments> getContactFormData(){
		//invoke ExcelReadUtils method
		Stream<Arguments> contactdata = ExcelReadUtils.readProducts();
		return contactdata;
		
	}
	
	
	@ParameterizedTest
	@MethodSource("readProducts")
	public void checkProducts(String tcase_id, String product) {
		try {
			
			
		driver.get(BASE_URL);
		 WebElement searchInput = driver.findElement(By.id("searchInput"));
	       WebElement searchButton = driver.findElement(By.xpath("//button[text()='Search']"));
		
	       searchInput.sendKeys(product);
	       searchButton.click();
	       Thread.sleep(2000); 
	       WebElement results = driver.findElement(By.id("results"));
	       assertTrue(results.getText().contains("product"));
	       
		ExcelWriteUtils.writeTCResult(tcase_id, "Pass", "");
		}
		catch(AssertionError ae) {
			ExcelWriteUtils.writeTCResult(tcase_id, "Fail", "");
			ae.printStackTrace();
		}
		catch(Exception e) {
			ExcelWriteUtils.writeTCResult(tcase_id, "Error", "");
			e.printStackTrace();
		}
	}

	@AfterAll
	public static void tearDown() {
		
		ExcelWriteUtils.generateExcel();
		if (driver != null) {
			driver.quit();
		}
	}

}
