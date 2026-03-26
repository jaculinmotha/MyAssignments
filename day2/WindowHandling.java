package org.testleaf.week4.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class WindowHandling {
public static void main(String[] args) throws InterruptedException {
    ChromeOptions options=new ChromeOptions();
    options.addArguments("guest");
    ChromeDriver driver=new ChromeDriver(options);
    driver.get("http://leaftaps.com/opentaps/control/main");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
    driver.findElement(By.id("password")).sendKeys("crmsfa");
    driver.findElement(By.className("decorativeSubmit")).click();
    driver.findElement(By.linkText("CRM/SFA")).click();
    driver.findElement(By.linkText("Contacts")).click();
    driver.findElement(By.linkText("Merge Contacts")).click();
    driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
    Set<String> childWindow = driver.getWindowHandles();
    List<String> childWindowShift=new ArrayList<String>(childWindow);
    driver.switchTo().window(childWindowShift.get(1));
    Thread.sleep(3000);
    //System.out.println(driver.getTitle());
    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
    Set<String> parentWindow=driver.getWindowHandles();
    List<String> parentWindowShift=new ArrayList<String>(parentWindow);
    driver.switchTo().window(parentWindowShift.get(0));
    driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
    Set<String> childWindow1=driver.getWindowHandles();
    List<String> childWindowShift1=new ArrayList<String>(childWindow1);
    driver.switchTo().window(childWindowShift1.get(1));
    //System.out.println(driver.getTitle());
    driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
    driver.switchTo().window(parentWindowShift.get(0));
    driver.findElement(By.xpath("//a[text()='Merge']")).click();
    Alert alert = driver.switchTo().alert();
    alert.accept();
    String title = driver.getTitle();
    System.out.println(title);
}
}
