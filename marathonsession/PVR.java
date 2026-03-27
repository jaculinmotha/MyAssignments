package org.testleaf.marathonsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class PVR {
public static void main(String[] args) throws InterruptedException {
 ChromeOptions opt=new ChromeOptions();
 opt.addArguments("disable.notifications");

ChromeDriver driver=new ChromeDriver(opt); 
driver.get("https://www.pvrcinemas.com/");
    driver.manage().window().maximize();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//span[text()='Cinema']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//span[text()='Select Cinema']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//span[contains(text(),'INOX')])[3]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//span[contains(text(),'Tomorrow')])")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("(//span[text()='YOUTH'])[2]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//span[contains(text(),'06:50 PM')]")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[@class='p-button p-component sc-hjsuWn kDwaXw bgColor filter-btn']/span[text()='Book']")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[text()='Accept']")).click();
    Thread.sleep(1000);
    driver.findElement(By.id("CL.CLUB|I:16")).click();
    Thread.sleep(1000);
    driver.findElement(By.xpath("//button[text()='Proceed']")).click();
    Thread.sleep(1000);
    String seatNo = driver.findElement(By.xpath("//p[text()='I16']")).getText();
    System.out.println(seatNo);
    String grandTotal = driver.findElement(By.xpath("//span[text()='218.02']")).getText();
    System.out.println(grandTotal);
    WebElement element = driver.findElement(By.xpath("//button[text()='Continue']"));
    driver.executeScript("arguments[0].click();", element);
    Thread.sleep(2000);
    driver.findElement(By.xpath("(//i[@class='pi pi-times'])[2]")).click();
    Thread.sleep(2000);
    driver.getTitle();
    System.out.println(driver.getTitle());
    driver.close();
}
}
   
