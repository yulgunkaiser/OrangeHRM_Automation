package com.pagefunctions;


import com.commonfunctions.CommonFunctions;
import com.commonvariables.CommonVariables;
import com.objectRepo.OrangeHRM_ObjRepo;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class LoginPage extends CommonFunctions {

    OrangeHRM_ObjRepo objRepo;

    public LoginPage(WebDriver driver){
        PageFactory.initElements(driver, OrangeHRM_ObjRepo.class);
    }




    public void successfulLogin(WebDriver driver) {

        Reporter.log("Initilizing Chrome browser!!");

        driver.get(CommonVariables.orangeHRM_Url);

        inputTextField(driver, objRepo.username, CommonVariables.orangeHRM_Username);
        inputTextField(driver, objRepo.password, CommonVariables.orangeHRM_Password);
        findButtonClick(objRepo.loginBtn);
    }


}
