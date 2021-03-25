package com.base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

public class Base {

    public WebDriver driver;

    public Base(WebDriver driver) {
        this.driver = driver;
    }

//All browser set up should be created in this class for example :


    @BeforeClass
    public void beforeEachClass(){

    }

    @AfterClass
    public void afterEachClass(){

    }

    @BeforeMethod
    public void beforeEachMethod(){
        System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/drivers/chromedriver");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }


    @AfterMethod
    public void afterEachMethod(){
    driver.quit();




    }











}
