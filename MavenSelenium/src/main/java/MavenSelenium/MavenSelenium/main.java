package MavenSelenium.MavenSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class main {
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
		ch.findElement(By.id("APjFqb")).sendKeys("flipkart");
		ch.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		ch.findElement(By.xpath("/html/body/div[3]/div/div[12]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
		ch.findElement(By.xpath("ch.findElement(By.xpath(\"/html/body/div[3]/div/div[12]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3\")).click();\r\n"
				+ "")).sendKeys("smartphones");

		
	}
}