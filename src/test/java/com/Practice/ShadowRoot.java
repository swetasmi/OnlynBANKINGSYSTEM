package com.Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;

public class ShadowRoot {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://selectorshub.com/xpath-practice-page/");
		Actions a=new Actions(driver);
		WebElement box = driver.findElement(By.xpath("//div[@class='jackPart']"));
		a.scrollToElement(box).perform();
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement dom=(WebElement) jse.executeScript("return document.querySelector('#userName').shadowRoot.querySelector('#kils')");
		dom.sendKeys("sweta");
		WebElement piz = (WebElement) jse.executeScript("return document.querySelector('#userName').shadowRoot.querySelector('#app2').shadowRoot.querySelector('#pizza')");
		piz.sendKeys("veg");
	}

}
