import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;

public class ProductClickButton extends BaseTest {

@Step("Id <id> Find element with and click")
    public void clickByid(String id){appiumDriver.findElement(By.id(id)).click();}

}
