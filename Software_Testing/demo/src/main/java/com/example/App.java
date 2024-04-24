package com.example;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    @SuppressWarnings("deprecation")
    public static void main( String[] args )
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
       /*  
         driver.get("https://www.google.co.in");
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        WebElement searchbtn = driver.findElement(By.name("btnK"));
        searchbtn.submit();
        String winhand = (driver.getWindowHandle());
        if(driver.getTitle().contains("Selenium"))
        {
            System.out.print("Passed\n");
        }
        else
        System.out.print("Failed");
        WebElement searchResultLink = driver.findElement(By.cssSelector("h3"));
        searchResultLink.click();
        driver.navigate().back();
        driver.switchTo().newWindow(WindowType.TAB);
        driver.navigate().to("https://www.google.co.in");
        driver.switchTo().newWindow(WindowType.TAB);
        Set<String> windowhand = driver.getWindowHandles();
        for(String s:windowhand)
        System.out.println(s);
        driver.quit();


        
        driver.get("https://www.geeksforgeeks.org/");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.linkText("Trending Now")));
        element.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        js.executeScript("window.scrollTo(0, 0);");
        
        driver.get("https://www.geeksforgeeks.org/");
        WebElement element = driver.findElement(By.xpath("/html/body/nav/div/div[1]/ul[1]/li[4]/span"));
        
        driver.get("https://www.google.co.in");
        Actions action = new Actions(driver);
        action.keyDown(Keys.SHIFT);
        action.sendKeys("hello ").keyUp(Keys.SHIFT).sendKeys(" how are you").build().perform();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        WebElement element = driver.findElement(By.linkText("Images"));
        action.moveToElement(element).perform();
        */
        try{
        driver.get("https://placement.skcet.ac.in/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("727722euit020@skcet.ac.in"+Keys.ENTER);
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id='password']")).sendKeys("727722it020"+Keys.ENTER);
        
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage()+"Arun");
        }








    }
}
