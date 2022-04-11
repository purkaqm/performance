package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import pages.exception.NotLoggedInException;



import java.time.Duration;
// import java.util.concurrent.TimeUnit;

import static locators.CommonLoc.*;

public class TestPage {


    public WebDriver driver;

    // Инициализация вебдрайвера
    // ChromeDriver
    @Parameters({"context", "visible"})
    @BeforeSuite
    public void setUp(String context, boolean visible) throws NotLoggedInException {

        System.out.println("===============  SETUP is running  ================");

        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");


        // headless driver - browser should not be launched

        driver = new ChromeDriver(new ChromeOptions().setHeadless(!visible));

        // Время ожидания элемента

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();


        // Установка дефолтного контекста
        setMainURL(context);


        System.out.println("===============  SETUP is finishing  ================");



    }

    @AfterSuite
    public void tearDown() {
        driver.close();
    }


    public void pause(int secs) {
        try {
            Thread.sleep(secs * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // SET main URL and open this page

    public void setMainURL(String mainURL) {
        CONTEXT_URL.setLocator(mainURL);
        driver.get(CONTEXT_URL.getLocator());

    }
}
