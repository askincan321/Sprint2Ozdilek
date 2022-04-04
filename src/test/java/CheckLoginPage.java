import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CheckLoginPage extends BaseTest {


    @Step("Check Login Page")
    public void LoginCheck() {
        try {
            appiumDriver.findElements((By.id("com.ozdilek.ozdilekteyim:id/btnLogin")));
            System.out.println("App On Login Page");

        } catch (Exception e) {
            Assert.fail("App could not On Login Page ");
        }
    }





}
