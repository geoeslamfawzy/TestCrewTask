package stepDefinitions;


import enums.Country;
import enums.Packages;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.SubscriptionHomePage;

public class StcValidationsStepDefs {
    private SubscriptionHomePage subscriptionHomePage = new SubscriptionHomePage();
    private String actualCountryName;
    private String actualPackageDetails;

    @Given("^I am on the Subscription Home Page$")
    public void iAmOnTheSubscriptionHomePage() {
        // Add code if needed to navigate to the subscription home page
    }

    @When("^I select (KSA|Bahrain|Kuwait) as the country$")
    public void iSelectCountry(Country country) {
        subscriptionHomePage.changeCountry(country);
        actualCountryName = country.toString();
    }

    @Then("^the country name should be \"([^\"]*)\"$")
    public void theCountryNameShouldBe(String expectedCountryName) {
        Assert.assertEquals(expectedCountryName, actualCountryName);
    }

    @And("^the package details for \"([^\"]*)\" should be \"([^\"]*) ([^\"]*)\"$")
    public void thePackageDetailsShouldBe(String packageType, String expectedPrice, String expectedCurrency) {
        Packages packages = Packages.valueOf(packageType);
        subscriptionHomePage.validatePackage(packages, packageType, expectedPrice, expectedCurrency);
        actualPackageDetails = String.format("%s %s", expectedPrice, expectedCurrency);
    }
}