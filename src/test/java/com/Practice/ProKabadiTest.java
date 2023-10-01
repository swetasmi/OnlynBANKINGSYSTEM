package com.Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ProKabadiTest {

	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String team="Tamil";
		driver.get("https://www.prokabaddi.com/standings");
		List<WebElement> details = driver.findElements(By.xpath("//div[@class='team-name']/p[contains(text(),'"+team+"')]/ancestor::div[@class='row-head']/div[*]/p[@class!='position-indicator position-up']"));
		List<WebElement> headings = driver.findElements(By.xpath("r"));
		System.out.println("Team - "+team);
		for (int i = 0; i < details.size(); i++) {
			System.out.println(headings.get(i).getText()+" - "+details.get(i).getText());
		}
		/*System.out.print("Team   ");
		for (WebElement h : headings) {
			System.out.print(h.getText()+" ");
		}
		System.out.println();
		System.out.print(team+" ");
		for (WebElement s : details) {
			System.out.print(s.getText()+" ");
		}*/
		driver.quit();
	}

	}


