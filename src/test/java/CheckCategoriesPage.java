import com.thoughtworks.gauge.Step;
import org.junit.Assert;
import org.openqa.selenium.By;

public class CheckCategoriesPage extends BaseTest {


    @Step("Check Categories")
    public void checkApp() {
        try {
            appiumDriver.findElements((By.id("com.ozdilek.ozdilekteyim:id/relLayTop")));
            System.out.println("App On category Tab");

        } catch (Exception e) {
            Assert.fail("App could not reach category tab ");
        }
    }
}
