

	

	import org.junit.Test;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;


	public class SeleniumWDF {
		@Test
		public void eBayInChrome()
		{
			//1. Open Chrome Browser
			System.setProperty("webdriver.chrome.driver", "C:\\chromedriver_win32\\chromedriver.exe");
			ChromeDriver oBrowser = new ChromeDriver();
			
			//2. Launch ==> www.ebay.com
			oBrowser.get("http://www.ebay.com/");
			
			//3. Enter "laptop" in search text box
			//3.a ==> Recognize the text box ==> oBrowser.findElement(By.id("gh-ac"))
			//3.b then Enter value to the text box
			oBrowser.findElement(By.id("gh-ac")).clear();
			oBrowser.findElement(By.id("gh-ac")).sendKeys("laptop");
			
			//4. Click on "Search" button
			oBrowser.findElement(By.id("gh-btn")).click();
			
			//5. Click on "Advanced" link
			oBrowser.findElement(By.linkText("Advanced")).click();
			
		}
}
