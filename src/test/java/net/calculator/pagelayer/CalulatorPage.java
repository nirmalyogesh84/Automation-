package net.calculator.pagelayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import net.calulator.TestBase;
public class CalulatorPage extends TestBase {
	public CalulatorPage()
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//span[@onclick='r(0)']")
	private WebElement click0;
	@FindBy(xpath = "//span[@onclick='r(1)']")
	private WebElement click1;
	@FindBy(xpath = "//span[@onclick='r(2)']")
	private WebElement click2;
	@FindBy(xpath = "//span[@onclick='r(3)']")
	private WebElement click3;
	@FindBy(xpath = "//span[@onclick='r(4)']")
	private WebElement click4;
	@FindBy(xpath = "//span[@onclick='r(5)']")
	private WebElement click5;
	@FindBy(xpath = "//span[@onclick='r(6)']")
	private WebElement click6;
	@FindBy(xpath = "//span[@onclick='r(7)']")
	private WebElement click7;
	@FindBy(xpath = "//span[@onclick='r(8)']")
	private WebElement click8;
	@FindBy(xpath = "//span[@onclick='r(9)']")
	private WebElement click9;

	public void enterZero() {
		click0.click();
	}

	public void enterOne() {
		click1.click();
	}

	public void enterTwo() {
		click2.click();
	}

	public void enterThree() {
		click3.click();
	}

	public void enterFour() {
		click4.click();
	}

	public void enterFive() {
		click5.click();
	}

	public void enterSix() {
		click6.click();
	}

	public void enterSeven() {
		click7.click();
	}

	public void enterEight() {
		click8.click();
	}

	public void enterNine() {
		click9.click();
	}

}
