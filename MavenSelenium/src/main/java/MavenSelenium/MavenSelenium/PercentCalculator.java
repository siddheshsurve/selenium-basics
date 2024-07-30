package MavenSelenium.MavenSelenium;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class PercentCalculator {

	public static void main(String[] args) {
		PageObjectsPercCalc page_objects_perc_calc = null;
		WebDriver driver = new EdgeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.calculator.net");
		
		//use page object library now
		page_objects_perc_calc.link_math_calc(driver).click();
		page_objects_perc_calc.link_percent_calc(driver).click();
		page_objects_perc_calc.text1(driver).clear();
		page_objects_perc_calc.text1(driver).sendKeys("50");
		page_objects_perc_calc.text2(driver).clear();
		page_objects_perc_calc.text2(driver).sendKeys("10");
		
		page_objects_perc_calc.button(driver).click();
		String res = page_objects_perc_calc.web_result(driver).getText();
		
		if(res.equals("5")) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}
		
		//driver.close();
	}

}
