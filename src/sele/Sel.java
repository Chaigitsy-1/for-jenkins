package sele;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Sel {
	 public static void main(String[] args) {
	        // declaration and instantiation of objects/variables
	    	System.setProperty("webdriver.chrome.driver","F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			//comment the above 2 lines and uncomment below 2 lines to use Chrome
			//System.setProperty("webdriver.chrome.driver","G:\\chromedriver.exe");
			//WebDriver driver = new ChromeDriver();
			 WebDriverWait wait = new WebDriverWait(driver,100);
			   // WebElement element = wait.until(
			                      //  ExpectedConditions.elementToBeClickable(By.id(item)))
	        String baseUrl = "https://play.playup.com/lobby/?modal=signin";
	       
	        driver.get(baseUrl);
	      
	        WebElement element1 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("username")));
	        driver.findElement(By.xpath("//*[@id='username']")).click();;
	        driver.findElement(By.xpath("//*[@id='username']")).sendKeys("svr.chaitu@gmail.com");
	        driver.findElement(By.id("password")).click();
	        driver.findElement(By.id("password")).sendKeys("beinghuman@1");
	      //  driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div[3]/form/button")).submit();
	       // driver.findElement(By.xpath("//*[normalize-space(text()) and normalize-space(.)='Forgot password?'])[1]/following::button[1]")).click();
	      //  driver.findElement(By.cssSelector("body > div:nth-child(33) > div > div > div > div:nth-child(4) > form > button")).click();
	        //driver.close();
	       
	    }

	}

