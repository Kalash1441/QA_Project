package org.examples.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class Final_Project {
    public static void main(String[] args) {


    WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        driver. findElement(By. xpath("//a[@title='My Account']")).click();
        driver.findElement(By.xpath("//a[text()='Login']")). click();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.MILLISECONDS);
        driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("kalash1441@gmail.com");
        driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("test@123");
        driver.findElement(By.xpath("//input[@value='Login']")).click();
        WebElement a = driver.findElement(By.xpath("//a[text()='Laptops & Notebooks']"));
        WebElement b = driver.findElement(By.xpath("//a[text()='Show AllLaptops & Notebooks']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(a).click(b).build().perform();

        driver.findElement(By.xpath("(//span[text()='Add to Cart'])[3]")).click();
        driver.findElement(By.xpath("(//span[text()='Add to Cart'])[4]")).click();
        driver.findElement(By.xpath("//a[@title='Shopping Cart']")).click();
        String Product1=driver.findElement(By.xpath("(//a[contains(@href,'product_id=44')])[4]")).getText();
        String Product2=driver.findElement(By.xpath("(//a[contains(@href,'product_id=45')])[4]")).getText();

        if(Product1.equals("MacBook Air")){
            System.out.println("Product1 is displayed correctly");
        }else {
            System.out.println("Product1 is not  displayed correctly");

        }

        if(Product2.equals("MacBook Pro")){
            System.out.println("Product2 is displayed correctly");
        }else {
            System.out.println("Product2 is not  displayed correctly");

        }
       String amount=driver.findElement(By.xpath("(//table[@class='table table-bordered'])[3]//tr[4]/td[2]")).getText();
           if(amount.equals("$3,202.00")){
               System.out.println("Amount is correct");
           }else
           {
               System.out.println("Amount is incorrect");
           }
      driver.findElement(By.xpath("//a[text()='Checkout']")).click();


    }}
