package jenkinpackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "D:\\FreshSeleniumSetup\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		driver.findElement(By.xpath("//input[@class='gLFyf gsfi'] | //input[@name='q']")).sendKeys("selenium");
		Thread.sleep(2000);
		List<WebElement> list = driver.findElements(By.xpath(
				"//ul[@class='erkvQe']//descendant::div[@class='sbl1'] | //ul[@role='listbox']//descendant::div[@class='sbl1']"));
		System.out.println("Total Number of suggestions in the Box :" + list.size());
		list.get(1).click();	

//		for(int i=0; i<list.size(); i++) {
//			System.out.println(list.get(i).getText());
//			if (list.get(i).getText().contains("selenium download")) {
//				list.get(i).click();
//				break;
//			}
//		}

	}

}
