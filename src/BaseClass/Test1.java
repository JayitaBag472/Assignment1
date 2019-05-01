package BaseClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;



public class Test1 {
	

	
@Test
	public void openBrowser(){
		WebDriver dr;
		System.setProperty("webdriver.chrome.driver","C:\\Users\\ejaybag\\Downloads\\Drivers\\chromedriver.exe");
		
		dr= new ChromeDriver();
	
	    dr.manage().window().maximize();
	    
	    dr.get("http://zoopla.co.uk//");
	 
	    
	    dr.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    
	    dr.quit();
		
	}

}


		




