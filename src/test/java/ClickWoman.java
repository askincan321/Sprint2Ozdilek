import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class ClickWoman extends BaseTest{



    @Step("Xpath <xpath> Find element with and click")
    public void clickByxpath(String xpath){appiumDriver.findElement(By.xpath(xpath)).click();}
}
