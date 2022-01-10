package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import com.zerobank.pages.HomePage;
import com.zerobank.pages.LoginPage;
import com.zerobank.utils.ConfigurationReader;
import com.zerobank.utils.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.Locale;

public class LoginStepDef {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("url"));
        Driver.getDriver().findElement(By.id("signin_button")).click();
    }
    @Given("User logins with username {string} and password {string}")
    public void user_logins_with_username_and_password(String u, String p) {
        loginPage.login(u,p);
    }
    @Then("the {string} page should be displayed")
    public void the_page_should_be_displayed(String pageName) {
        String currentTitle = Driver.getDriver().getTitle();
        Assert.assertTrue("Title is not matching", currentTitle.toLowerCase().contains(pageName.toLowerCase()));

        //second way to verify which tab I am at
        String selectedTab = new AccountSummaryPage().selectedTab.getText();
        Assert.assertEquals( pageName, selectedTab);


    }

    @Then("Error message {string} should be displayed")
    public void errorMessageShouldBeDisplayed(String expectedText) {
       Assert.assertEquals(expectedText,loginPage.errorMsg.getText());
    }
}
