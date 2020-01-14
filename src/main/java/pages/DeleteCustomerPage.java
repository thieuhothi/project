package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import java.util.List;

import static tests.PageProvider.getOpenAccountPage;

public class DeleteCustomerPage {


    @FindBy(xpath = "//table/tbody/tr[2]/td[5]/button")
    WebElement deleteBtn;

    @FindBy(xpath = "//div[1]/button[3]")
    WebElement openCustomerTab;

    @FindBy(xpath = "//div/div[2]/div/div[2]/div/div/table")
    WebElement table;

    public void clickCustomerTab() {
        openCustomerTab.click();
    }

    public void clickDelete() {
        deleteBtn.click();
    }

    public void verifyAccountNumberUser(String firstName, String lastname, String accountnumber) throws InterruptedException {
        WebElement listTable = table;
        List<WebElement> rows = listTable.findElements(By.tagName("tr"));
        boolean check = false;
        for (int i = 0; i < rows.size(); i++) {
            List<WebElement> tdElement = rows.get(i).findElements(By.tagName("td"));
            if (tdElement.get(0).getText().contains(firstName)
                    && tdElement.get(1).getText().contains(lastname)
                    && tdElement.get(3).getText().contains(accountnumber)) {
                check = true;
            }
        }
        Assert.assertEquals(check, true);
    }

    public void verifyDeleteCustomers(String firstName, String lastName, String postcode,boolean ok){
        WebElement listTable = table;
        List<WebElement> rows = listTable.findElements(By.tagName("tr"));
        boolean check = true;
        for (int i = 1; i < rows.size(); i++) {
            List<WebElement> tdElement = rows.get(i).findElements(By.tagName("td"));
            if (tdElement.get(0).getText().equals(firstName)
                    && tdElement.get(1).getText().equals(lastName)
                    && tdElement.get(2).getText().equals(postcode)) {
                check = false;
            }
        }
        if (ok){
            if (!check) Assert.assertEquals(1, 0);
        }
    }

}
