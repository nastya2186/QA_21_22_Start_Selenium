import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class HomeWorks {

    WebDriver wd;

    @BeforeClass
    public void setUp(){
        wd = new ChromeDriver();
        wd.get("https://telranedu.web.app/login");

    }

    @Test
    public void cssLocators(){

        //by tag name

        WebElement e1 = wd.findElement(By.tagName("body"));
        List<WebElement> list1 = wd.findElements(By.tagName("div"));
        WebElement e2 = wd.findElement(By.cssSelector("h1"));
        WebElement e3 = wd.findElement(By.tagName("form"));
        List<WebElement> list2 = wd.findElements(By.tagName("button"));
        WebElement e4 = wd.findElement(By.tagName("br"));

        //by class
        WebElement divcon = wd.findElement(By.className("container"));
        WebElement divcon1 = wd.findElement(By.className("navbar-component_nav__1X_4m"));
        WebElement divcon2 = wd.findElement(By.cssSelector(".active"));
        WebElement divcon3 = wd.findElement(By.className("login_login__3EHKB"));


        //by id
        WebElement id1 = wd.findElement(By.id("root"));
        WebElement id2 = wd.findElement(By.cssSelector("#root"));


        //by attribute
        WebElement at1 = wd.findElement(By.cssSelector("[href = '/home']"));
        WebElement at2 = wd.findElement(By.cssSelector("[href = '/about']"));
        WebElement at3 = wd.findElement(By.cssSelector("[href = '/login']"));
        WebElement at4 = wd.findElement(By.cssSelector("[placeholder = 'Email']"));
        WebElement at5 = wd.findElement(By.cssSelector("[placeholder = 'Password']"));


        WebElement el18 =wd.findElement(By.cssSelector("[placeholder = 'Email']"));
        WebElement el19 =wd.findElement(By.cssSelector("[placeholder ^= 'Em']"));
        WebElement el20 =wd.findElement(By.cssSelector("[placeholder $= 'il']"));
        WebElement el21 =wd.findElement(By.cssSelector("[placeholder *= 'ma']"));




    }

}
