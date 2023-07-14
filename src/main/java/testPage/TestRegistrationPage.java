package testPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.*;

import HomePageObject.registrationPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestRegistrationPage {
	WebDriver driver;
		
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://localhost:9001/FlyAway/signup");
	}
	
	@Test
	public void testRegistrationPage(){
			
		registrationPage obj = PageFactory.initElements(driver, registrationPage.class);
		obj.setemail("geetha@gmail.com");
		obj.setpassword("geetha");
		obj.setconfirmpassword("geetha");
		obj.setname("geetha");
		obj.setaddress("kerala");
		obj.setcity("kannur");
		obj.signup();
		
	}


}
