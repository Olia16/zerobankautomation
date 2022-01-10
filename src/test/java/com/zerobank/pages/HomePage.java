package com.zerobank.pages;

import com.zerobank.utils.BrowserUtils;
import com.zerobank.utils.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public abstract class HomePage {

    public HomePage(){

        PageFactory.initElements(Driver.getDriver(), this);

    }

    @FindBy(className = "active")
    public WebElement selectedTab;

    public void getTab(String tab){
        Driver.getDriver().findElement(By.linkText(tab)).click();
        BrowserUtils.sleep(1);
    }

}
