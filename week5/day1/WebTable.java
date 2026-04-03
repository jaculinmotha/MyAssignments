package org.tesrleaf;

import java.time.Duration;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class WebTable {
public static void main(String[] args) {
    ChromeOptions opt=new ChromeOptions();
    opt.addArguments("disable.notifications");
    ChromeDriver driver=new ChromeDriver(opt);
    driver.get("https://erail.in/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    driver.findElement(By.id("txtStationFrom")).clear();
    driver.findElement(By.id("txtStationFrom")).sendKeys("MAS");
    driver.findElement(By.xpath("//div[text()='Mgr Chennai Ctr'][1]")).click();
    driver.findElement(By.id("txtStationTo")).clear();
    driver.findElement(By.id("txtStationTo")).sendKeys("MDU");
    driver.findElement(By.xpath("//div[text()='Madurai Jn'][1]")).click();
    driver.findElement(By.xpath("//input[@id='chkSelectDateOnly']")).click();
    List<WebElement> allTrainData = driver.findElements(By.xpath("//table[@class='DataTable TrainList TrainListHeader stickyTrainListHeader']//tr/td[2]"));
    Set<String> trainNames = new LinkedHashSet<String>();
    for(int i=0;i<allTrainData.size();i++) {
        String trainName = allTrainData.get(i).getText();
        trainNames.add(trainName);
        }
        System.out.println(trainNames);
        //driver.close();

}
}
