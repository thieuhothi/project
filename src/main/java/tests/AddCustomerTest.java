package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddCustomerTest extends PageProvider {

    @When("^I type first name as (.*), last name as (.*), post code as (.*)$")
    public void inputUserInformation(String firstname, String lastname, String postcode) throws InterruptedException {
        Thread.sleep(3000);
        getAddCustomerPage().setInformation(firstname, lastname, postcode);
    }


    @And("^I click submit$")
    public void clickSubmit() throws InterruptedException {
        getAddCustomerPage().clickSubmit();
    }

    @Then("^I verify that system is already added customer as (.*) successfully$")
    public void verifyCustomerAddSuccessfully(String fullname) throws InterruptedException {
        Thread.sleep(2000);
        getCommonPage().closeAlertPopup();
        Thread.sleep(2000);
        getOpenAccountPage().clickOpenAccountTab();
        Thread.sleep(2000);
        getOpenAccountPage().clickOpenuserSelect();
        Thread.sleep(2000);
        getOpenAccountPage().checkUserInformation(fullname, true);
        Thread.sleep(2000);
        getOpenAccountPage().getUserInformation(fullname);
    }


    @Then("^I verify that system is already added customer as (.*) unsuccessfully")
    public void verifyCustomerAddUnSuccessfully(String fullname) throws InterruptedException {
        Thread.sleep(2000);
        getOpenAccountPage().clickOpenAccountTab();
        Thread.sleep(2000);
        getOpenAccountPage().clickOpenuserSelect();
        Thread.sleep(2000);
        getOpenAccountPage().checkUserInformation(fullname, false);
        Thread.sleep(2000);
    }
}
