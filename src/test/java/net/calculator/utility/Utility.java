package net.calculator.utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.calulator.TestBase;
public class Utility extends TestBase  {
	public Utility(){
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="(//div//span[@class='sciop'])[1]")
	private WebElement add;
	@FindBy(xpath="(//div//span[@class='sciop'])[3]")
	private WebElement subtract;
	@FindBy(xpath="(//div//span[@class='sciop'])[8]")
	private WebElement divide;
	@FindBy(xpath="(//div//span[@class='sciop'])[5]")
	private WebElement multyply;
	@FindBy(xpath="(//div//span[@class='scieq'])[1]")
	private WebElement clear;
	
	public void addition() {
		add.click();
	}

	public void subtraction() {
		subtract.click();
	}

	public void division() {
		divide.click();
	}
		public void multiplication() {
			multyply.click();
}
		public void allClear() {
			clear.click();
}
	


}


