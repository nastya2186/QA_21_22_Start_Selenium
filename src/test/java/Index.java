import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import javax.lang.model.util.Elements;
import java.sql.Driver;
import java.util.List;

public class Index {

    WebDriver wd;


    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("file:///C:/Users/anastasia/Downloads/21.index.html");
    }

    @Test
    public void cssLocators(){
        //by tag name
       WebElement e1 = wd.findElement(By.tagName("button"));
       WebElement element = wd.findElement(By.cssSelector("button"));
       List<WebElement> list = wd.findElements(By.tagName("a"));
       int i = list.size();
       WebElement el3 = list.get(3);


       //by class
        WebElement divcontainer = wd.findElement(By.className("container"));
        WebElement divcontainer1 = wd.findElement(By.cssSelector(".container"));
        List<WebElement> navlist = wd.findElements(By.className("nav-item"));
        List<WebElement> navlist1 = wd.findElements(By.cssSelector(".nav-item"));

        //by id

        WebElement nav = wd.findElement(By.id("nav"));
        WebElement nav1 = wd.findElement(By.cssSelector("#nav"));

        //by attribute

        WebElement inputEmail = wd.findElement(By.cssSelector("[placeholder='Type your name']"));
        WebElement a2 = wd.findElement(By.cssSelector("[href='#item2']"));

    }

}
