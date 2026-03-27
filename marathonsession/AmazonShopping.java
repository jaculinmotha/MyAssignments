package org.testleaf.marathonsession;

import java.time.Duration;
import java.util.Collections;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class AmazonShopping {
public static void main(String[] args) {
    ChromeOptions opt=new ChromeOptions();
    opt.addArguments("disable.notifications");
    ChromeDriver driver=new ChromeDriver(opt);
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Bag for Boys");
    driver.findElement(By.id("nav-search-submit-button")).click();
    String totalSearchResults = driver.findElement(By.xpath("//h2[@class='a-size-base a-spacing-small a-spacing-top-small a-text-normal']")).getText();
    System.out.println(totalSearchResults);
    driver.findElement(By.xpath("//div[@id='brandsRefinements']//i[@class='a-icon a-icon-checkbox']")).click();
    driver.findElement(By.xpath("(//div[@id='brandsRefinements']//i[@class='a-icon a-icon-checkbox'])[2]")).click();
    driver.findElement(By.id("a-autoid-62-announce")).click();;
    driver.findElement(By.xpath("//a[text()='Newest Arrivals']")).click();
    String name = driver.findElement(By.linkText("Skybags")).getText();
    System.out.println(name);
    String price = driver.findElement(By.xpath("//span[text()='2,559']")).getText();
    System.out.println(price);
    String title = driver.getTitle();
    System.out.println(title);
    driver.close();
}
}