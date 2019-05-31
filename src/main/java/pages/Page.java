package pages;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.PageFactory;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * Page.java - superclass for all other pages. This class is mainly created to initialize Elements.
 * Also, to pass desired browser for the test
 * PageFactory is used to Initialize Elements of a Page class without having to use ‘FindElement‘ or ‘FindElements‘
 * This class is malinly created
 * @author  Shaibal Mukherjee
 * @version 1.0
 */

public class Page {

    private WebDriver driver;
    private String chromeDriverExePath;
    private String geckoDriverExePath;

    public Page() {
        String desiredBrowser = System.getProperty("Browser");

        switch (desiredBrowser) {
            case "chrome":
                chromeDriverExePath = "src//main//resources//chromedriver";
                System.setProperty("webdriver.chrome.driver", chromeDriverExePath);
                this.driver = new ChromeDriver();
                break;
            case "firefox":
                //TO_DO: Could not find latest geckodriver. Hence tests on firefox are not running. With latest geckodriver tests should work without making any change.
                geckoDriverExePath = "src//main//resources//geckodriver";
                System.setProperty("webdriver.gecko.driver", geckoDriverExePath);
                this.driver = new FirefoxDriver();
                break;
        }

        PageFactory.initElements(driver, this);
    }

    public void launchPage(String URL) {
        driver.get(URL);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().fullscreen();
    }

    public void close() {
        driver.quit();
    }

    public void screenshot() {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File destination = new File(new File("target//output_//") + getDate() + ".png");
        try {
            FileUtils.copyFile(screenshot, destination);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getDate() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }
}
