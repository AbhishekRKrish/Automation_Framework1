package pages;

import driver.DriverManager;
import org.openqa.selenium.By;

public class HomePage {

    By username = By.xpath("");
    By password = By.xpath("");
    By submit = By.xpath("");
    By search = By.xpath("");
    HeaderMenu headerMenu;

    public HomePage(){
       headerMenu = new HeaderMenu();
    }

    public String getHomePageTitle(){
        return DriverManager.getDriver().getTitle();
    }
}
