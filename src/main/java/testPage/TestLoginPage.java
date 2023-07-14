package testPage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import HomePageObject.loginPage;
import HomePageObject.registrationPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class TestLoginPage {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
	driver.manage().window().maximize();
	driver.get("http://localhost:9001/FlyAway/login");
	}
	
	@Test
	public void testRegistrationPage(){
		
		loginPage object = PageFactory.initElements(driver, loginPage.class);
		object.setemailid("john@gmail.com");
		object.setpass("john");
		object.loginBtn();
		
	}
}
