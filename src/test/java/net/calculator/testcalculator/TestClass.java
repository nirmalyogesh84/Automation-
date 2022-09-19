package net.calculator.testcalculator;

import org.testng.annotations.Test;

import net.calulator.TestBase;
public class TestClass extends TestBase {
	@Test(priority = 0)
	public void testMultiply() throws InterruptedException {
		caculate.enterFour();
		caculate.enterTwo();
		caculate.enterThree();
		util1.multiplication();
		caculate.enterFive();
		caculate.enterTwo();
		caculate.enterFive();
		Thread.sleep(10000);
	}

	@Test(priority = 1)
	public void testdivision() throws InterruptedException {
		caculate.enterFour();
		caculate.enterZero();
		caculate.enterZero();
		caculate.enterZero();
		util1.division();
		caculate.enterTwo();
		caculate.enterZero();
		caculate.enterZero();
		Thread.sleep(10000);
	}

	@Test(priority = 2)
	public void testAddition() throws InterruptedException {
		util1.subtraction();
		caculate.enterTwo();
		caculate.enterThree();
		caculate.enterFour();
		caculate.enterTwo();
		caculate.enterThree();
		caculate.enterFour();
		util1.addition();
		caculate.enterThree();
		caculate.enterFour();
		caculate.enterFive();
		caculate.enterThree();
		caculate.enterFour();
		caculate.enterFive();
		Thread.sleep(10000);
	}

	@Test(priority = 3)
	public void testSubtraction() throws InterruptedException {
		util1.subtraction();
		caculate.enterTwo();
		caculate.enterThree();
		caculate.enterFour();
		caculate.enterEight();
		caculate.enterTwo();
		caculate.enterThree();
		util1.subtraction();
		util1.subtraction();
		caculate.enterTwo();
		caculate.enterThree();
		caculate.enterZero();
		caculate.enterNine();
    	caculate.enterFour();
		caculate.enterEight();
		caculate.enterTwo();
		caculate.enterThree();
		Thread.sleep(10000);
	}

}

