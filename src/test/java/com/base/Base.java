package com.base;

import com.commonvariables.CommonVariables;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class Base {

public  WebDriver driver;
public String browserType;


    @BeforeClass
    public void beforeEachClass() {

        try {
            Properties prop = new Properties();
            FileInputStream fls = new FileInputStream(new File(CommonVariables.configPropertyFilePath));
            Reporter.log("Reading config.properties file from the path: " + CommonVariables.configPropertyFilePath);
            prop.load(fls);
            browserType = prop.getProperty("browser");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @AfterClass
    public void afterEachClass() {

    }

    @BeforeMethod
    public void beforeEachMethod() {

        try {
            if (browserType.equalsIgnoreCase("chrome")) {

                chrome();

            } else if (browserType.equalsIgnoreCase("firefox")) {
                System.out.println("Sorry, this crowser is not available");
            } else if (browserType.equalsIgnoreCase("safari")) {
                System.out.println("Sorry, this crowser is not available");
            } else if (browserType.equalsIgnoreCase("InternetExplorer")) {
                System.out.println("Sorry, this crowser is not available");
            } else {
                System.out.println("Sorry, this crowser is not available");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


    @AfterMethod
    public void afterEachMethod() {
        //driver.quit();


    }



    public WebDriver chrome() {

        try {
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
            Reporter.log("Initilizing Chrome browser!!");
            driver = new ChromeDriver();
            driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
            driver.manage().window().maximize();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return driver;
    }








}
