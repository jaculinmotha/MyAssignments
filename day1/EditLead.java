package org.testleaf;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
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
driver.findElement(By.linkText("Create Lead")).click();
driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TCS");
driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Jaculin");
driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Motha");
driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Jackie");
driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("IT");
driver.findElement(By.id("createLeadForm_description")).sendKeys("Lead Creation");
driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("jaculinmotha@gmail.com");
WebElement sourceEle=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
Select option=new Select(sourceEle);
option.selectByVisibleText("New York");
driver.findElement(By.name("submitButton")).click();
driver.findElement(By.linkText("Edit")).click();
driver.findElement(By.id("updateLeadForm_description")).clear();
driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("Description Edit");
driver.findElement(By.name("submitButton")).click();
}
}
