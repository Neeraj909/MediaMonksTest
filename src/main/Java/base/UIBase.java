package base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.CommonUtills;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class UIBase {
    public UIBase(){
        CommonUtills.cleanFolder();
    }
    public static long PAGE_LOAD_TIMEOUT = 20;
    public static long IMPLICIT_WAIT = 20;
    public static WebDriver driver;

    public static WebDriver getDriver() {
        return driver;
    }

    public static void setDriver(WebDriver driver) {
        UIBase.driver = driver;
    }
    public static void browserInitialization() {
        WebDriverManager.chromedriver().setup();
        setDriver(new ChromeDriver());
        getDriver().manage().window().maximize();
        getDriver().manage().deleteAllCookies();
        getDriver().manage().timeouts().pageLoadTimeout(UIBase.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        getDriver().manage().timeouts().implicitlyWait(UIBase.IMPLICIT_WAIT, TimeUnit.SECONDS);
        getDriver().get(CommonUtills.getEnv().getConfig().getEnvironment().getURL());
    }
    public static WebDriverWait webDriverWait;
    public WebDriverWait getWebDriverWait(){
        if(webDriverWait==null){
            webDriverWait=new WebDriverWait(getDriver(),40);
        }
        return webDriverWait;
    }


}
