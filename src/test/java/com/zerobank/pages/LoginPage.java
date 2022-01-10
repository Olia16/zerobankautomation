package com.zerobank.pages;

import com.zerobank.utils.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user_login")
    public WebElement usernameInput;

    @FindBy(id = "user_password")
    public WebElement passwordInput;

    @FindBy(name = "submit")
    public WebElement submitButton;

    @FindBy(xpath = "//div[@class='alert alert-error']")
    public WebElement errorMsg;

    public void login(String u,String p){
        usernameInput.sendKeys(u);
        passwordInput.sendKeys(p);
        submitButton.click();
    }

}
