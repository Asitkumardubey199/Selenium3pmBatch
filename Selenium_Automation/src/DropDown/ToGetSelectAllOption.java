package DropDown;

import java.awt.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ToGetSelectAllOption {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demoqa.com/select-menu/");
		
		WebElement dropdown = driver.findElement(By.id("cars"));
		Select select =new Select(dropdown);
		select.selectByIndex(0);
		Thread.sleep(2000);
		select.selectByVisibleText("Audi");
		Thread.sleep(2000);
		select.selectByValue("opel");
		Thread.sleep(2000);
		select.deselectByIndex(2);
		Thread.sleep(2000);
		select.selectByVisibleText("Audi");
		Thread.sleep(2000);
		select.selectByValue("opel");
		Thread.sleep(2000);
		
		java.util.List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		for(WebElement option:allSelectedOptions) {
			System.out.println( option .getText());
		}
		
		WebElement firstOption = (WebElement) select.getAllSelectedOptions();
		System.out.println("the first selected option is:"+firstOption.getText());
		
		}

	}


