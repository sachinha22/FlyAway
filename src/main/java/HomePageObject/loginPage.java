package HomePageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class loginPage {
WebDriver driver;
	
	public loginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//Login_Email_Id
	@FindBy(xpath="/html/body/form/table/tbody/tr[1]/td[2]/input") private WebElement email_id;

	//Login Page Password
	@FindBy(xpath="/html/body/form/table/tbody/tr[2]/td[2]/input") private WebElement pwd;
	
	//Login Buitton
	@FindBy(xpath="/html/body/form/table/tbody/tr[3]/td/button") private WebElement loginBtn;
	
	public void setemailid(String arg) {
		email_id.sendKeys(arg);	
	}
	

	public void setpass(String arg) {
		pwd.sendKeys(arg);	
	}
	
	public void loginBtn() {
		loginBtn.click();
	}
}
