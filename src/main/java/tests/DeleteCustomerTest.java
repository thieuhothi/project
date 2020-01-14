package tests;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import runner.TestRunner;

public class DeleteCustomerTest extends PageProvider{
    @Given("I want to Open the website(.*)$")
    public void user_OpenAcoutPage(String website) throws InterruptedException {
        Thread.sleep(2000);
        TestRunner.driver.get(website);
        Thread.sleep(2000);
        TestRunner.driver.manage().window().maximize();
    }
    @When("^I click delete button$")
    public void clickSubmit() throws InterruptedException {
        getCustomerListPage().clickDelete();
    }

    @Then("^I verify user is already deleted with first name as (.*) and last name as (.*) and post code as (.*)$")
    public void iVerifyUserIsAlreadyDeletedWithFirstNameAsFirstnameAndLastNameAsLastnameAndPostCodeAsPostcode(String firstName, String lastName, String postCode) throws InterruptedException {
        getCustomerListPage().verifyDeleteCustomers(firstName,lastName,postCode, true);
        Thread.sleep(3000);
    }
}
