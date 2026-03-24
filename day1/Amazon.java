package org.testleaf.week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Amazon {
public static void main(String[] args) throws InterruptedException {
    ChromeOptions option=new ChromeOptions();
    option.addArguments("disable notifications");
ChromeDriver driver=new ChromeDriver(option); 
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone 17 pro");
driver.findElement(By.id("nav-search-submit-button")).click();
Thread.sleep(3000);
List<WebElement> priceList=driver.findElements(By.xpath("//span[@class='a-price-whole']"));
List<Integer> price=new ArrayList<Integer>();
for(int i=0;i<priceList.size();i++){
    String text=priceList.get(i).getText();
    String replaceAll = text.replaceAll(",", "");
    //System.out.println(replaceAll);
    price.add(Integer.parseInt(replaceAll));
    
}
Collections.sort(price);

    System.out.println(price.get(0));
}
}
