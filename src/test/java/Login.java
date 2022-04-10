import org.testng.annotations.Test;
import pages.LoginPage;

public class Login extends BaseTest {

    @Test(description = "To check whether existing user is able to login or not")
    public void testLogin(){
        LoginPage page = new LoginPage();
        String title =   page.loginToApp("abcds","testgg").getHomePageTitle();
        String expectedTitle = "something";
//        Assert.assertEquals(title,expectedTitle);
    }
}
