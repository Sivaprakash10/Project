package org.base;

import java.awt.Desktop.Action;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	//Browser Launch
	public static WebDriver driver;
   public static WebDriver launchBrowser() {
	   WebDriverManager.chromedriver().setup();
		
		driver =new ChromeDriver();
		return driver;
   }
		//url Launch
		
		public static void launchUrl(String url) {
			driver.get(url);
			driver.manage().window().maximize();
		}
		//Maximize
		 
		//public static void maximize() {
			//driver.manage().window().maximize();
			//}

		//wait
		public static void implicitywait(long time) {
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
      }
		
		//SendKeys
		public static void sendkeys(WebElement e,String value) {
		e.sendKeys(value);
    }
		//click
		public static void click(WebElement e) {
		e.click();	

		}
		
		//currentUrl
		
		public static String currenUrl() {
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;
			
		}
		//Quit
		private void quit() {
			driver.quit();

		}
//close
		private void close() {
			driver.close();

		}
		
		//get Text
		public static String gettext(WebElement e) {
		String text = e.getText();
		return text;	

		}
		
		//get Attributes
      public static String getAttributes(WebElement e) {
		String attribute = e.getAttribute("value");
		return attribute;

	}
      //actions
      //move to Element
      public static void movetoelement(WebElement e) {
		Actions a=new Actions(driver);
		a.moveToElement(e).perform();

	}
      //Doubleclick
      public static void doubleclick(WebElement e) {
		Actions a = new Actions(driver);
		a.doubleClick(e).perform();

	}
      //contentclick
      
     public static void contentclick(WebElement e) {
		Actions a = new Actions(driver);
		a.contextClick(e).perform();
		
     }
     //click and hold
     
     public static void clickandhold(WebElement e) {
		Actions a=new Actions(driver);
		a.clickAndHold(e).perform();

	}
  //windowHandle
     
     public static String windowHandle(WebElement e ) {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
		

	}

	}
    	 
    		
     
    		//Set<String> allIds = driver.getWindowHandles();
    		//System.out.println(allIds);
    		

	
     
	
     
     
      
      
      
      
      
      
      
      

