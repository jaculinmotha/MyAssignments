package org.testleaf.Week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteLeads {
public static void main(String[] args) {
    ChromeOptions opt=new ChromeOptions();
    opt.addArguments("guest");
ChromeDriver driver=new ChromeDriver(opt); 
driver.get("http://leaftaps.com/opentaps/control/main");
driver.manage().window().maximize();
driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
driver.findElement(By.id("password")).sendKeys("crmsfa");
driver.findElement(By.className("decorativeSubmit")).click();
driver.findElement(By.linkText("CRM/SFA")).click();
driver.findElement(By.linkText("Leads")).click();
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.linkText("Phone")).click();
driver.findElement(By.name("phoneNumber")).sendKeys("99");
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.linkText("10113")).click();
driver.findElement(By.linkText("Delete")).click();
driver.findElement(By.linkText("Find Leads")).click();
driver.findElement(By.name("id")).sendKeys("10113");
driver.findElement(By.linkText("Find Leads")).click();

}
}
