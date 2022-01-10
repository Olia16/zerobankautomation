package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.utils.BrowserUtils;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import javax.xml.ws.WebEndpoint;
import java.util.ArrayList;
import java.util.List;

public class AccountSummaryStepDef {
    @Then("Account summary page should have to following account types:")
    public void account_summary_page_should_have_to_following_account_types(List<String>expectedAccountTypes) {

        List<WebElement>accountElements = new AccountSummaryPage().accounts;
        //need to turn the list of WebElements into list of strings
        List<String>actualAccountTypes = BrowserUtils.getElementsText(accountElements);
        Assert.assertEquals(expectedAccountTypes, actualAccountTypes);


    }
    @Then("Credit Accounts table must have columns")
    public void credit_accounts_table_must_have_columns(List<String> expectedColumns) {
        //for shortcut in Windows ALT+Enter
        List<String> actualColumnNames = BrowserUtils.getElementsText(new AccountSummaryPage().creditColumns);
        Assert.assertEquals("Columns are not as expected", expectedColumns, actualColumnNames);


    }
}
