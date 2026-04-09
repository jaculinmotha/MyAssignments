package steps;

import java.time.Duration;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStepDefinition{
    public ChromeDriver driver;

@Given("Launch the browser")
public void launchBrowser(){
    //C:\Selenium Profile
ChromeOptions options = new ChromeOptions();
options.addArguments("--user-data-dir=C:\\Selenium Profile");
options.addArguments("--disable-notifications");
driver=new ChromeDriver(options);
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
}

@And("Load the URL")
public void loadUrl(){
driver.get("https://login.salesforce.com/");
}

@And("Enter the username")
public void username(){
driver.findElement(By.xpath("//input[@id='username']")).sendKeys("jaculinmotha.a60a2a48aa1d@agentforce.com");;
}

@And("Enter the password")
public void password(){
driver.findElement(By.xpath("//input[@id='password']")).sendKeys("MervinJB@3");
}

@And ("Click on the login button")
public void clickLoginButton(){
driver.findElement(By.xpath("//input[@id='Login']")).click();
}

@And ("Click on toggle menu button")
public void clickToggleMenu(){
driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
}

@And ("Click on view all button")
public void clickViewAll(){
driver.findElement(By.xpath("//button[text()='View All']")).click();
}

@And ("Click on sales button")
public void clickSales(){
driver.findElement(By.xpath("//div[@type='search']/input[@class='slds-input']")).sendKeys("Sales");
driver.findElement(By.xpath("(//mark[text()='Sales'])[3]")).click();
}

@And ("Click on accounts tab")
public void clickAccountsTab(){
WebElement account = driver.findElement(By.xpath("//a[@title='Accounts']"));
driver.executeScript("arguments[0].click()",account);
}

@And ("Click on new button")
public void clickNewButton(){
driver.findElement(By.xpath("//div[text()='New']")).click();
}

@And ("Enter the account name as Jaculin")
public void enterAccountName(){
driver.findElement(By.xpath("//input[@name='Name']")).sendKeys("Jaculin");
/*WebElement scrollElement = driver.findElement(By.xpath("//label[text()='Ticker Symbol']"));
Actions act=new Actions(driver);
act.pause(1000).scrollToElement(scrollElement).perform();*/
driver.executeScript("document.body.style.zoom='80%'");
}

@And ("Select the ownership as public")
public void selectOwnership(){
driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux fix-slds-input_faux slds-combobox__input-value'])[3]")).click();
driver.findElement(By.xpath("//span[text()='Public']")).click();
}

@When ("Click on save button")
public void clickSaveButton(){
WebElement click = driver.findElement(By.xpath("(//button[text()='Save'])[2]"));
driver.executeScript("arguments[0].click()",click);
}

@Then("User should verify the account name as Jaculin")
public void verifyUserAccount(){
WebElement account1 = driver.findElement(By.xpath("//a[@class='slds-context-bar__label-action dndItem']/span[text()='Accounts']"));
driver.executeScript("arguments[0].click()",account1);
String text = driver.findElement(By.xpath("//span[text()='Jaculin']")).getText();
System.out.println(text);
}
}


