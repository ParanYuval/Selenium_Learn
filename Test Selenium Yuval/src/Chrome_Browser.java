import java.util.concurrent.TimeUnit;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import static org.junit.Assert.*;
public class Chrome_Browser
{

			public static void main(String[] args) throws Exception
			{
				//open chrome
				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Yuval\\Downloads\\chromedriver_win32 (1)\\chromedriver.exe"); 
				WebDriver driver = new ChromeDriver(); 
				driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				
			//	open edge
			//	System.setProperty("webdriver.edge.driver", "C:\\Users\\Yuval\\Desktop\\Test Selenium\\Test Selenium Yuval\\MicrosoftWebDriver.exe"); 
			//	WebDriver driver_edge = new EdgeDriver() ; 
	    	//	driver_edge.get("https://google.com"); 


				//open firefox

//				System.setProperty("webdriver.gecko.driver", "C:\\Users\\Yuval\\Desktop\\Test Selenium\\Test Selenium Yuval\\geckodriver.exe");
//				WebDriver driver_firefox = new FirefoxDriver();
				
				//edge gmail login
	/*			driver_edge.get("https://google.com"); 
				driver_edge.findElement(By.name("btnK")).click();
			    System.out.println("dfs");
			    driver_edge.findElement(By.linkText("Gmail")).click();
			    driver_edge.findElement(By.id("identifierId")).sendKeys("paran.yuval1@gmail.com");
			    driver_edge.findElement(By.cssSelector("content.CwaK9")).click();
			    driver_edge.findElement(By.id("password")).sendKeys("paran1991");
			    driver_edge.findElement(By.linkText("הבא")).click();
			    driver_edge.quit();
  
			
				//Fire fox gmail login
				driver_firefox.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
				driver_firefox.get("https://www.google.com"); 
			    driver_firefox.findElement(By.name("btnK")).click();
			    System.out.println("dfs");
			    driver_firefox.findElement(By.linkText("Gmail")).click();
			    driver_firefox.findElement(By.id("identifierId")).sendKeys("paran.yuval1@gmail.com");
			    driver_firefox.findElement(By.cssSelector("content.CwaK9")).click();
			    driver_firefox.findElement(By.id("password")).sendKeys("paran1991");
			    driver_firefox.findElement(By.linkText("הבא")).click();

						    
*/				
			 	//Chrome moodle				
				driver.get("https://is.sce.ac.il/nidp/idff/sso?id=45&sid=1&option=credential&sid=1&target=https://portal.sce.ac.il/menu/index.php");
				driver.manage().window().maximize();
			    assertEquals("ברוכים הבאים לפורטל שירותי המידע האישי", driver.getTitle());
			    driver.findElement(By.name("Ecom_User_ID")).clear();
			    driver.findElement(By.name("Ecom_User_ID")).sendKeys("yuvalpa");
			    driver.findElement(By.name("Ecom_Password")).clear();
			    driver.findElement(By.name("Ecom_Password")).sendKeys("Yuv1991");
			    driver.findElement(By.name("enter")).click();
			    assertEquals("", driver.getTitle());
			    assertEquals("פורטל שירותי המידע האישי", driver.getTitle());
			    driver.findElement(By.partialLinkText("Moodle")).click();
			    assertEquals("מכללת סמי שמעון - למידה מתוקשבת", driver.getTitle());
			    driver.findElement(By.partialLinkText("בסיסי נתונים")).click();
			    assertEquals("קורס: בסיסי נתונים", driver.getTitle());
			  
			  
			 	//Chrome moodle gmail			  
			    driver.get("https://www.google.com"); 
				driver.manage().window().maximize();
			    WebElement element = driver.findElement(By.name("q"));
			    element.sendKeys("מכבי תל אביב");
			    element.submit();
			    driver.findElement(By.name("btnK")).click();
			    System.out.println("dfs");
			    driver.findElement(By.linkText("Gmail")).click();
			    driver.findElement(By.id("identifierId")).sendKeys("paran.yuval1@gmail.com");
			    driver.findElement(By.cssSelector("content.CwaK9")).click();
			    driver.findElement(By.name("password")).sendKeys("paran1991");
			    driver.findElement(By.linkText("הבא")).click();
			    
			    //chrome wikipedia
			    driver.get("https://he.wikipedia.org"); 
			    driver.findElement(By.name("search")).sendKeys("מכבי תל אביב");
			    driver.findElement(By.name("go")).click();

			}



}