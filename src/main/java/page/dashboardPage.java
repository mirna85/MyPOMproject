package page;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.testng.Assert;

public class dashboardPage {
	
WebDriver driver;
	
	public dashboardPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy (how = How.XPATH, using = "//h2[contains(text(), 'Dashboard')]") WebElement DASHBOARD_HEADER_FIELD;
	@FindBy (how = How.XPATH, using = "//span[contains(text(), 'Customers')]") WebElement CUSTOMERS_FIELD;
	@FindBy (how = How.XPATH, using = "//a[contains(text(), 'Add Customer')]") WebElement ADD_CUSTOMER_FIELD;
	
	
	public void verifyDashboardPage() {
		
		Assert.assertEquals(DASHBOARD_HEADER_FIELD.getText(), "Dashboard", "Wrong Page!");
		
	}
	
	public void clickCustomersButton() {
		CUSTOMERS_FIELD.click();
	}
	
	public void clickAddCustomersButton() {
		ADD_CUSTOMER_FIELD.click();
	}

}
