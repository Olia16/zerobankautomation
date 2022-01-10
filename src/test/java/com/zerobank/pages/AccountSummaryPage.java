package com.zerobank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AccountSummaryPage extends HomePage{


    @FindBy(tagName = "h2")
    public List<WebElement> accounts;


    @FindBy(xpath = "(//thead)[3]//tr/th")
    public List<WebElement>creditColumns;
}
