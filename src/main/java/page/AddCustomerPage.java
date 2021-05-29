package page;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;

public class AddCustomerPage extends BasePage{
	
WebDriver driver;
	
	public AddCustomerPage(WebDriver driver) {
		this.driver = driver;
	}
	
	@FindBy (how = How.XPATH, using = "//*[@id=\"account\"]") WebElement FULL_NAME_FIELD;
	@FindBy (how = How.XPATH, using = "//*[@id=\"cid\"]") WebElement COMPANY_FIELD;
	@FindBy (how = How.XPATH, using = "//*[@id=\"email\"]") WebElement EMAIL_FIELD;

	public void enterFullName(String fullName) {
	
		FULL_NAME_FIELD.sendKeys(fullName + GenerateNumber(999));
	
	}
	
	public void enterCompanyName(String company) {
		
		selectDropdown(COMPANY_FIELD, company);
		
		}

	public void enterEmail(String email) {
		
		EMAIL_FIELD.sendKeys(GenerateNumber(999) + email);
		}
}
