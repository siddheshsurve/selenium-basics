import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo1 {
	public static void main(String[] args) {
		FirefoxDriver ch = new FirefoxDriver();
		ch.get("http://www.google.com");
		ch.manage().window().maximize();
		ch.findElement(By.id("APjFqb")).sendKeys("flipkart");
		ch.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[4]/center/input[1]")).click();
		ch.findElement(By.xpath("/html/body/div[3]/div/div[12]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3")).click();
		ch.findElement(By.xpath("ch.findElement(By.xpath(\"/html/body/div[3]/div/div[12]/div[1]/div[2]/div[2]/div/div/div[1]/div/div/div/div/div/div/div/div[1]/div/span/a/h3\")).click();\r\n"
				+ "")).sendKeys("smartphones");

		
	}
}