package org.tesrleaf.week5.day1.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import dev.failsafe.internal.util.Durations;

public class AmazonActions {
public static void main(String[] args) {
    ChromeOptions opt=new ChromeOptions();
    opt.addArguments("disable.notofications");
    ChromeDriver driver=new ChromeDriver(opt);
    driver.get("https://www.amazon.in/");
    driver.manage().window().maximize();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    WebElement scrollElement = driver.findElement(By.linkText("Conditions of Use & Sale"));
    Actions act=new Actions(driver);
    act.scrollToElement(scrollElement).perform();
    driver.findElement(By.linkText("Conditions of Use & Sale")).click();;
}
}
