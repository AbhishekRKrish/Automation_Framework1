package pages;


import org.openqa.selenium.By;


import static Utils.Utils.click;
import static Utils.Utils.sendKeys;

public class LoginPage   {

    By userName = By.xpath("");
    By passWord = By.xpath("");
    By submit = By.xpath("");
    By search = By.xpath("");
    By captchaText = By.xpath("");


    private LoginPage setUserName(String username){
        sendKeys(userName,username,"abcds");
        return this;
    }
    private LoginPage setPassword(String password){
        sendKeys(passWord,password,"abcds");
        return this;
    }

    private HomePage setSubmit(){
        click(submit,"submit");
        return new HomePage();
    }

    public HomePage loginToApp(String username,String password){
        return setUserName(username).setPassword(password)
                .setSubmit();
    }





}
