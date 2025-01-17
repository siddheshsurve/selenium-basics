package MavenSelenium.MavenSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PageObjectsPercCalc {
	private static WebElement element = null;
	
	//Math Calc link
	public static WebElement link_math_calc(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"homelistwrap\"]/div[3]/div[2]/a"));
		return element;
	}
	
	//Percentage Calc link
	public static WebElement link_percent_calc(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/table[2]/tbody/tr/td/div[3]/a"));
		return element;
	}
	
	public static WebElement text1(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"cpar1\"]"));
		return element;
	}
	
	public static WebElement text2(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"cpar2\"]"));
		return element;
	}
	
	public static WebElement button(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/form[1]/table/tbody/tr[2]/td/input[2]"));
		return element;
	}
	
	public static WebElement web_result(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@id=\"content\"]/p[2]/font/b"));
		return element;
	}


}
