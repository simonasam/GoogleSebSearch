
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.NotConnectedException;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Simona
 */
public class WebDriverSearch {
    WebDriver driver;
    
    public void getDriver(String path) throws Exception{
        driver = new FirefoxDriver();
        //System.setProperty("chromedriver", "");
        //driver = new ChromeDriver();
        driver.get(path);
        driver.manage().window().maximize();
    }
    
    public void search(String inputText){
        driver.findElement(By.id("lst-ib")).sendKeys(inputText);
        driver.findElement(By.id("sblsbb")).click();
    }
    //getNodeValue("//div[@id='rso']//div[1]//h3[@class='r']//a/text()")
    public String checkResults(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(WebDriverSearch.class.getName()).log(Level.SEVERE, null, ex);
        }
        String result = driver.findElement(By.cssSelector("div#ires div.rc a")).getAttribute("href");
        return result;
    }
}
