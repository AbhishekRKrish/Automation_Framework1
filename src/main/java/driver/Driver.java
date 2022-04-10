package driver;

import org.openqa.selenium.WebDriver;

public final class Driver {
    private Driver(){

    }


    public static void initDriver(){
        //browser should be taken from properties
        if(DriverManager.getDriver()==null){
            String Browser = "chrome";
            WebDriver driver = DriverFactory.getDriver(Browser);
            DriverManager.setDriver(driver);
            DriverManager.getDriver().manage().window().maximize();
            //Do not hardcode , get values from properties or config
            DriverManager.getDriver().get("https://amazon.com");
        }

    }

    public static void quit(){
        if(DriverManager.getDriver()!=null){
            DriverManager.getDriver().quit();
            DriverManager.setDriver(null);
        }
    }
}
