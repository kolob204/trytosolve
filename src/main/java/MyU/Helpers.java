package MyU;


import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import io.qameta.allure.Attachment;

public class Helpers {

    //public static final Logger log = Logger.getLogger(Helpers.class.getName());
    private static final Logger log= Logger.getLogger("devpinoyLogger");

    @Attachment
    public static byte[] tackeScreenshot(){
        log.info("Taking screenshot to allure report");
        return ((TakesScreenshot) getWebDriver()).getScreenshotAs(OutputType.BYTES);
 
    }

    @Attachment(value = "Test log")
    public static String attacheText(String text){
        log.info("Taking test log to allure report");
        return text;
    }

    


}
