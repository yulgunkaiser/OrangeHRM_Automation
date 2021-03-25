package com.objectRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrangeHRM_ObjRepo {


    // Login page
    @FindBy(css = "input#btnLogin")
    public WebElement loginBtn;

    @FindBy(css = "input#txtUsername")
    public WebElement username;

    @FindBy(css = "input#txtPassword")
    public WebElement password;

    public By randomElemName4 = By.xpath("");

    public By randomElemName5 = By.id("");


}
