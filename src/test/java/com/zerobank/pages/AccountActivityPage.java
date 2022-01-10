package com.zerobank.pages;

import com.zerobank.utils.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.Set;

public class AccountActivityPage extends HomePage{

    @FindBy(id = "aa_accountId")
    public WebElement accountDropDown;

    public String selectedOption(){
        Select accountOptions = new Select(accountDropDown);
        return accountOptions.getFirstSelectedOption().getText();
    }

    public Set<String> accountOptionsList(){
        Select accountOptionsDropDown = new Select(accountDropDown);
        return BrowserUtils.getElementsTextWithoutDouble(accountOptionsDropDown.getOptions());
    }

}
