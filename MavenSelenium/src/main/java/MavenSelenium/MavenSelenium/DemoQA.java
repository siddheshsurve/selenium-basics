package MavenSelenium.MavenSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoQA {
	public static String browser = "Firefox";
	public static WebDriver ch;
	public static void main(String[] args) {
		if(browser.equals("Chrome")) {
			ch = new ChromeDriver();
		} else if(browser.equals("Firefox")) {
			ch = new FirefoxDriver();
		} else if(browser.equals("Edge")) {
			ch = new EdgeDriver();
		}
		ch.get("https://demoqa.com/");
		ch.manage().window().maximize();
		////*[@id="app"]/div/div/div[1]/a/img
		//registration
		ch.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[1]/a/img")).click();
		
		
	}

}
