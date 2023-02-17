package project.maven.selenium;

import org.openqa.selenium.WebDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManagerDemo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = WebDriverManager.chromedriver().create();
		
		// Navigate to the demoqa website
		driver.get("https://www.lambdatest.com/selenium-playground/checkbox-demo");
		Thread.sleep(3000);
		
		driver.quit();

	}
		
}