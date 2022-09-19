package net.calulator;
import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;
import net.calculator.pagelayer.CalulatorPage;
import net.calculator.utility.Utility;

public class TestBase {
	public static WebDriver driver;
	public static CalulatorPage caculate;
	public static Utility util1;

	@BeforeMethod
	public void Lauchbroweser() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.calculator.net/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		caculate = new CalulatorPage();
		util1 = new Utility();
	}

	@AfterMethod
	public void colseBroweser() 
	{
		driver.quit();
	}

}
