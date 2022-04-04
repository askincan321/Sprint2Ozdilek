import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CheckProductItemPage extends BaseTest{

    @Step("Check Product Item Page")
    public void checkPIP() {
        try {
            appiumDriver.findElements((By.id("com.ozdilek.ozdilekteyim:id/relLaySizeView")));
            System.out.println("App is on Product details Page");


        } catch (Exception e) {
            Assert.fail("App is not on product details page ");
        }
    }


}
