package HomePageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HomePage {

	WebDriver driver;
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//to Homepage link
	@FindBy(xpath="/html/body/a[1]") public WebElement homeBtn;
	
	//loginsingnup link
	@FindBy(xpath="/html/body/a[2]") public WebElement loginSingnup;
	
	//Source Locator
	@FindBy(xpath="/html/body/form/table/tbody/tr/td[1]/select") public WebElement sourcedropdown;
	
	//Destination Dropdown
	@FindBy(xpath="/html/body/form/table/tbody/tr/td[2]/select") public WebElement Destndropdown;
	
	//Submit Button
	@FindBy(xpath="/html/body/form/table/tbody/tr/td[3]/button") public WebElement submitBtn;
	
	//BookFlight1@homepage
	@FindBy(xpath="/html/body/table/tbody/tr[2]/td[6]/a") public WebElement bookFlightlink;
	
	//BookFlight2@Homepage
	 @FindBy(xpath="/html/body/table/tbody/tr[3]/td[6]/a") public WebElement bookFlightlinks;
	
	 //complete the payment
	 @FindBy(xpath="/html/body/a[6]") public WebElement completePayment;
	 
	 //viewbooking
	 @FindBy(xpath="/html/body/a[4]") public WebElement viewbooking;
	 
	 public void homepage() {
		 homeBtn.click();
	 }
	 public void setsource(String arg) {
		 Select dropdown = new Select(sourcedropdown);
		 dropdown.selectByValue(arg);
		}
	 
	 public void setdestination(String arg) {
		 Select dropdown3 = new Select(Destndropdown);
		 dropdown3.selectByValue(arg);
		}
	 
	 public void submit() {
		 submitBtn.click();
	 }
	 
	 public void bookflight() {
		 bookFlightlink.click();
	 }
	 public void completePayment() {
		 completePayment.click();
	 }
	 public void myBookings() {
		 viewbooking.click();
	 }
}
