import com.thoughtworks.gauge.Step;
import junit.framework.AssertionFailedError;
import org.junit.Assert;
import org.openqa.selenium.By;

public class AppOpen  extends BaseTest{

    @Step("Check App")
    public void checkApp(){
        try{
            appiumDriver.findElements((By.id("com.ozdilek.ozdilekteyim:id/textView")));


        }catch (Exception e) {
            Assert.fail("App did not reach the Launch screen");
        }

    }

}
