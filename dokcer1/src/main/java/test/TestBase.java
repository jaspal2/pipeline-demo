package test;


import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.BrowserType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.Assert;
import org.testng.annotations.*;
public class TestBase {
	public String baseUrl = "http://demo.guru99.com/test/newtours/";
    String driverPath = "/home/monash/Documents/selenium-driver/chromedriver";
    public WebDriver driver ; 

    @Test
    public void verifyHomepageTitle() throws MalformedURLException {
         
        /*System.out.println("launching firefox browser"); 
        System.setProperty("webdriver.gecko.driver", driverPath);
        driver = new ChromeDriver();
        driver.get(baseUrl);
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle, expectedTitle);
        driver.close(); */
    	String grid_url="http://localhost:4444/wd/hub";
    	DesiredCapabilities cap= new DesiredCapabilities();
    	cap.setBrowserName(BrowserType.CHROME);
    	WebDriver driver= new RemoteWebDriver(new URL(grid_url), cap);
    	driver.get("http://google.com");
    	driver.get("https://google.com");
    	
    }
    
    public static void main(String[] args) throws MalformedURLException {
    	
    	TestBase base= new TestBase();
    	base.verifyHomepageTitle();
    }
 
}