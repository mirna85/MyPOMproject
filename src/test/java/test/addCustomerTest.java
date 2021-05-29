package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import page.AddCustomerPage;
import page.dashboardPage;
import page.loginPage;
import util.BrowserFactory;

public class addCustomerTest {

	WebDriver driver;
	
	@Test
	public void validUserToAddCustomer() {
		
		driver = BrowserFactory.init();
		
		loginPage login = PageFactory.initElements(driver, loginPage.class);
		login.enterUsername("demo@techfios.com");
		login.enterPassword("abc123");
		login.clickSignin();
		
		dashboardPage dashboard = PageFactory.initElements(driver, dashboardPage.class);
		dashboard.verifyDashboardPage();
		dashboard.clickCustomersButton();
		dashboard.clickAddCustomersButton();
		
		AddCustomerPage customer = PageFactory.initElements(driver, AddCustomerPage.class);
		customer.enterFullName("Mirna Reyes");
		customer.enterCompanyName("Techfios");
		customer.enterEmail("abc@techfios.com");
		
		BrowserFactory.tearDown();
	}
	
}
