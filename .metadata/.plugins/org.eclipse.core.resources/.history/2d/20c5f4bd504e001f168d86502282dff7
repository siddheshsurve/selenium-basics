package MavenSelenium.MavenSelenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseEvent {

	public static void main(String[] args) {
		String baseURL = "https://demo.guru99.com/test/newtours/";
		WebDriver driver = new EdgeDriver(); 
		driver.get(baseURL);
		
		WebElement link_home = driver.findElement(By.linkText("Home"));
		WebElement td_Home = driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[1]/td[1]"));
		
		Actions builder = new Actions(driver);
		org.openqa.selenium.interactions.Action mouseOverHome = builder.moveToElement(link_home).build();
		
		String bgColor = td_Home.getCssValue("background-color");
		System.out.println("Before hover : "+ bgColor);
		mouseOverHome.perform();
		bgColor = td_Home.getCssValue("background-color");
		System.out.println("Before hover : "+ bgColor);
	}

}
