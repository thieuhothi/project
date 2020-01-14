package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage {
    @FindBy(xpath = "//div[1]/input")
    WebElement firtsname;
    @FindBy(xpath = "//div[2]/input")
    WebElement lastname;
    @FindBy(xpath = "//div[3]/input")
    WebElement postcode;
    @FindBy(xpath = "//form/button")
    WebElement addCustomerBtn;

    public void setInformation(String fistnameinput, String lastnameinput, String postcodeinput) {
        this.firtsname.clear();
        if (!fistnameinput.equals("")) {
            this.firtsname.sendKeys(fistnameinput);
        }
        this.lastname.clear();
        if (!lastnameinput.equals("")) {
            this.lastname.sendKeys(lastnameinput);
        }
        this.postcode.clear();
        if (!postcodeinput.equals("")) {
            this.postcode.sendKeys(postcodeinput);
        }
    }
     public void clickSubmit(){
        addCustomerBtn.click();
     }

}
