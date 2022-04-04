



import com.thoughtworks.gauge.Step;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;


public class BasePage extends BaseTest {

    @Step("Wait for <int> seconds")
    public void waitForsecond(int s) throws InterruptedException {
        Thread.sleep(s*1000);

    }


    @Step("<id> elementin sayfada gorunur oldugunu kontrol et ve tıkla")
    public void findByelementEndclick(String id){
        MobileElement element = appiumDriver.findElement(By.id(id));
        if (element.isDisplayed()){
            element.click();
        }else{
            System.out.println("!!!!! Kontrol edilen element görünür olmadı !!!!!");
        }
    }

    @Step("Xpath <xpath> li elementi bul  ve tıkla")
    public void clickByxpath(String xpath){appiumDriver.findElement(By.xpath(xpath)).click();}

    @Step("Id <id> li elenti bul ve tıkla")
    public void clickByid(String id) {appiumDriver.findElement(By.id(id)).click();}






}
