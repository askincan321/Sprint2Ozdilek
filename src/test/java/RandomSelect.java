import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;


import java.util.List;
import java.util.Random;



public class RandomSelect extends BaseTest{
    @Step("Random Select Product")
    public void random(){
        List<MobileElement> elements = appiumDriver.findElements(By.xpath("//*[@resource-id='com.ozdilek.ozdilekteyim:id/imageView']"));
        Random ran = new Random();
        int ranInt = ran.nextInt(elements.size());
        elements.get(ranInt).click();
    }

}
