package HomePageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class registrationPage {
WebDriver driver;
	
	public registrationPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	//to singup  link
		@FindBy(xpath="/html/body/form/table/tbody/tr[3]/td/a") private WebElement singuplink;
		
	//Email Id
		@FindBy(name="email_id") private WebElement emailid;
		
		@FindBy(name="pwd") private WebElement password;
		
		@FindBy(name="pwd2") private WebElement confirmpassword;
		@FindBy(name="name") private WebElement name;
		@FindBy(name="address") private WebElement address;
		@FindBy(name="city") private WebElement city;
		@FindBy(xpath="/html/body/form/table/tbody/tr[7]/td/button") private WebElement singupBtn;
		@FindBy(xpath="/html/body/a[3]") private WebElement editprofile;
		@FindBy(xpath="/html/body/form/table/tbody/tr[6]/td/button")private WebElement updateBtn;
		@FindBy(xpath="/html/body/a[5]")private WebElement logoutbtn;
		
		public void singuplink() {
			singuplink.click();
		}
		
		public void setemail(String Searchinput) {
				emailid.sendKeys(Searchinput);
				
		}
		
		public void setpassword(String Searchinput) {
				password.sendKeys(Searchinput);
		}
		
		public void setconfirmpassword(String Searchinput) {
			confirmpassword.sendKeys(Searchinput);
		}
	
		public void setname(String Searchinput) {
			name.sendKeys(Searchinput);
		}
		public void setaddress(String Searchinput) {
			address.sendKeys(Searchinput);
		}
		public void setcity(String Searchinput) {
			city.sendKeys(Searchinput);
		}
		public void signup() {
			singupBtn.click();
		}
		public void editprofile() {
			editprofile.click();
			
		}
		public void updateprofie() {
			updateBtn.click();
		}
		public void logout() {
			logoutbtn.click();
		}
}
