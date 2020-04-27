package tempsolve2;

import static com.codeborne.selenide.Selenide.open;

import org.apache.log4j.BasicConfigurator;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.testng.BrowserPerClass;
import com.codeborne.selenide.testng.ScreenShooter;

import MyLis.TextReportAllure;
import io.github.bonigarcia.wdm.WebDriverManager;
import io.qameta.allure.Description;

//TextReport.class,
@Listeners({ ScreenShooter.class, BrowserPerClass.class, TextReportAllure.class })
public class TestCase {

	@BeforeSuite
	@BeforeSuite
	public void setUp() {
		BasicConfigurator.configure();
		System.setProperty("log4j.configurationFile", "Log4j.properties");

                WebDriverManager.chromedriver().setup();
                System.setProperty("webdriver.chrome.driver", WebDriverManager.chromedriver().getBinaryPath());
                
                Configuration.baseUrl = "http://mail.yandex.ru";
                //System.setProperty("webdriver.chrome.silentOutput", "true"); // THIS will surpress all logs expect INFO

		ChromeOptions options = new ChromeOptions();
		options.addArguments("--log-level=0");
		WebDriverRunner.setWebDriver(new ChromeDriver(options));
		// WebDriverRunner.addListener(new EventListener());
	}

	@Test(description = "описание", priority = 1)
	public void TestCaseTest() {
		open(Configuration.baseUrl);
	}

	@AfterSuite
	public void tearDown() {
		WebDriverRunner.closeWebDriver();
	}

}
