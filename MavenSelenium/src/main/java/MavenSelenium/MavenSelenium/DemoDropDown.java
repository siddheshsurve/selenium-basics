package MavenSelenium.MavenSelenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
//		driver.get("https://demo.guru99.com/test/radio.html");
		//Radio buttons selected
//		WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
//		WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
//		
//		radio1.click();
//		System.out.println("Radio Button Option 1 is selected.");
//		radio2.click();
//		System.out.println("Radio Button Option 2 is selected.");
//		
//		//selecting checkbox
//		WebElement option1 = driver.findElement(By.id("vfb-6-0"));
//		option1.click();
//		
//		//check whether the check box is toggled on
//		if(option1.isSelected()) {
//			System.out.println("Checkbox 1 toggled on");
//		} else {
//			System.out.println("Checkbox 2 toggled on");
//		}
//		
//		//selecting checkbox and using isSelected method
//		driver.get("https://demo.guru99.com/test/facebook.html");
//		WebElement chkFBPersist = driver.findElement(By.id("persist_box"));
//		for(int i=0; i<2; i++) {
//			chkFBPersist.click();
//			System.out.println("Facebook persists checkbox status if : "+ chkFBPersist.isSelected());
//		}
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		WebElement testDropDown = driver.findElement(By.xpath("//*[@id=\"post-2646\"]/div[2]/div/div/div/p/select"));  
		Select dropdown = new Select(testDropDown);  
		
		dropdown.selectByIndex(100);  
		dropdown.selectByIndex(102);  
	}

}
 