package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import com.zerobank.utils.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

import java.util.Collection;
import java.util.List;
import java.util.Set;

public class AccountActivityStepDef {

    AccountActivityPage accountActivityPage = new AccountActivityPage();

    @Given("the user navigates to {string} tab")
    public void the_user_navigates_to_tab(String tab) {
        accountActivityPage.getTab(tab);
    }
    @Then("Account drop down should have {string} selected")
    public void account_drop_down_should_have_selected(String expectedAccountType) {
        String actualAccountType = accountActivityPage.selectedOption();
        Assert.assertEquals(expectedAccountType,actualAccountType);
    }
    @Then("Account drop down should have the following options")
    public void account_drop_down_should_have_the_following_options(List<String> expectedAccountList) {
        Set<String> actualAccountList = accountActivityPage.accountOptionsList();

        Assert.assertTrue(expectedAccountList.containsAll(actualAccountList));
    }
    @Then("Transactions table should have column names")
    public void transactions_table_should_have_column_names(io.cucumber.datatable.DataTable dataTable) {

    }

}
