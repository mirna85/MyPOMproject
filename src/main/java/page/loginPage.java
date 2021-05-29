package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginPage {
	
	WebDriver driver;
	
	public loginPage() {
		//Default Constructor
	}
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	//Element Library
//	WebElement element = driver.findElement(By.xpath("//*[@id=\"username\"]"));
//	By locator = By.xpath("//*[@id=\"username\"]");
	
	@FindBy(how = How.XPATH, using = "//*[@id=\"username\"]") WebElement USERNAME_FIELD;
	@FindBy(how = How.XPATH, using = "//*[@id=\"password\"]") WebElement PASSWORD_FIELD;
	@FindBy (how = How.XPATH, using = "/html/body/div/div/div/form/div[3]/button") WebElement SIGNIN_FIELD;
	
	//Interactive Methods
	//Technique 1: Individual Methods
	public void enterUsername(String userName) {
		
		USERNAME_FIELD.sendKeys(userName);
		
	}
	
	public void enterPassword(String password) {
		
		PASSWORD_FIELD.sendKeys(password);
		
	}
	
	public void clickSignin() {
		
		SIGNIN_FIELD.click();
		
	}
	
	//Technique 2: Combined 
	
	public void testLogin(String userName, String password) {
		
		USERNAME_FIELD.sendKeys(userName);
		PASSWORD_FIELD.sendKeys(password);
		SIGNIN_FIELD.click();
	}

}
