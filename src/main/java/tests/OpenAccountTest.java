package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.TestRunner;

import java.util.List;

public class OpenAccountTest extends PageProvider {
    String accountnumber="null";

//    @Given("Open the website(.*)$")
//    public void user_OpenAccountPage(String website) throws InterruptedException {
//        Thread.sleep(2000);
//        TestRunner.driver.get(website);
//        Thread.sleep(2000);
//        TestRunner.driver.manage().window().maximize();
//        Thread.sleep(2000);
//    }

    @When("^I choose account as (.*) and currency as (.*)$")
    public void openAccount(String fullname, String currency) throws InterruptedException {
        Thread.sleep(2000);
        getOpenAccountPage().clickOpenuserSelect();
        Thread.sleep(2000);
        getOpenAccountPage().getUserInformation(fullname);
        Thread.sleep(2000);
        getOpenAccountPage().getCurrency(currency);
    }

    @And("^I click process button")
    public void click_process_button() throws InterruptedException {
        Thread.sleep(2000);
        getOpenAccountPage().clickProcessButton();
        Thread.sleep(2000);
        accountnumber=getOpenAccountPage().getTextAccountNumberPopup();
        Thread.sleep(2000);

    }
    @Then("^I verify that user is already opened with first name as (.*) and last name as (.*)$")
    public void verifyOpenAccountSuccessfully(String firstName,String lastName) throws InterruptedException {
        Thread.sleep(2000);
        getCommonPage().closeAlertPopup();
        Thread.sleep(2000);
        getCustomerListPage().clickCustomerTab();
       Thread.sleep(2000);
        getCustomerListPage().verifyAccountNumberUser(firstName,lastName,accountnumber);
        Thread.sleep(2000);
    }

//    @Then("^I verify that user is already opened with first name as (.*) and last name as (.*)$")
//    public void verifyOpenAccountUnsuccessfully(String firstName,String lastName) throws InterruptedException {
//        System.out.println(getOpenAccountPage().getTextAccountNumberPopup());
//        Thread.sleep(2000);
//        getOpenAccountPage().getTextAccountNumberPopup();
//        Thread.sleep(2000);
//        System.out.println(getOpenAccountPage().getTextAccountNumberPopup());
//        Thread.sleep(2000);
//        getCommonPage().closeAlertPopup();
//        Thread.sleep(2000);
//        getCustomerListPage().clickCustomerTab();
//        Thread.sleep(2000);
//        getCustomerListPage().verifyAccountNumberUser(firstName,lastName,accountnumber);
//        Thread.sleep(2000);
//    }

}
