package stepDefinitions;

import dataProvider.ExcelSheet;
import enums.Country;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.SubscriptionHomePage;

import java.io.IOException;

public class SubscriptionsStepDefinitions {

    private SubscriptionHomePage subscriptionHomePage = new SubscriptionHomePage();
    private ExcelSheet excelSheet = new ExcelSheet();


    @Given("I am on the subscription home page")
    public void iAmOnTheSubscriptionHomePage() {
        subscriptionHomePage.validatePageTitle();
    }
    @When("I change the {string} country")
    public void iChangeTheCountry(String countryValue) {
        for (int i=0; i<Country.values().length; i++){
            if (countryValue.equals(Country.values()[i].toString())){
                subscriptionHomePage.changeCountry(Country.values()[i]);
                break;
            }
        }
    }

    @Then("I should see {string} as the selected country")
    public void iShouldSeeAsTheSelectedCountry(String countryValue) {
        for (int i=0; i<Country.values().length; i++){
            if (countryValue.equals(Country.values()[i].toString())){
                subscriptionHomePage.changeCountry(Country.values()[i]);
                break;
            }
        }
    }

    @Then("I should validate all packages from {string} sheet")
    public void i_should_validate_all_packages_from_sheet(String sheetName) throws IOException {
        Object[][] data = excelSheet.getDataFromExcelFile("SubscriptionData", sheetName);
        for (int i = 0; i < data.length; i++) {
            String packageType = (String) data[i][0];
            String price = (String) data[i][1];
            String currency = (String) data[i][2];
            subscriptionHomePage.validatePackage(packageType, price, currency);
        }
    }


}