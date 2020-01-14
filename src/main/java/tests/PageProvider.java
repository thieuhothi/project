package tests;

import org.openqa.selenium.support.PageFactory;
import pages.AddCustomerPage;
import pages.CommonPage;
import pages.DeleteCustomerPage;
import pages.OpenAccountPage;
import runner.TestRunner;

public class PageProvider {

    private static OpenAccountPage openAccountPage;
    public static AddCustomerPage addCustomerPage;
    public static CommonPage commonPage;
    private static DeleteCustomerPage deleteCustomerPage;

    public static AddCustomerPage getAddCustomerPage() {
//        if (addCustomerPage == null) {
            addCustomerPage = PageFactory.initElements(TestRunner.driver, AddCustomerPage.class);
//        }
        return addCustomerPage;
    }

    public static CommonPage getCommonPage() {
//        if (commonPage == null) {
            commonPage = PageFactory.initElements(TestRunner.driver, CommonPage.class);
//        }
        return commonPage;
    }

    public static OpenAccountPage getOpenAccountPage() {
//        if (openAccountPage == null) {
            openAccountPage = PageFactory.initElements(TestRunner.driver, OpenAccountPage.class);
//        }
        return openAccountPage;
    }
    public static DeleteCustomerPage getCustomerListPage() {
//        if (deleteCustomerPage == null) {
            deleteCustomerPage = PageFactory.initElements(TestRunner.driver, DeleteCustomerPage.class);
//        }
        return deleteCustomerPage;
    }

}
