package com.commonfunctions;


import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonFunctions {



    public void inputTextField(WebDriver driver, WebElement inputElem, String inputValue){

        try{
           inputElem.click();
           inputElem.clear();
           inputElem.sendKeys(inputValue);
        }catch (Exception e){
            e.printStackTrace();
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].setAttribute('value','"+inputValue+"')", inputElem);
        }
    }


    public void findButtonClick(WebElement buttonElem){

        try{
            buttonElem.click();
        }catch (Exception e){
            e.printStackTrace();
        }
    }




}
