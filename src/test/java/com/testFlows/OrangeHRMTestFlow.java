package com.testFlows;

import com.base.Base;
import com.pagefunctions.LoginPage;
import org.testng.annotations.Test;

public class OrangeHRMTestFlow extends Base {




  @Test(enabled = true, priority = 0)
    public void loginPage(){

      LoginPage loginPage = new LoginPage(driver);
      loginPage.successfulLogin(driver);

  }





}
