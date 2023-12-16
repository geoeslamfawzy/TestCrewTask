package tests;

import dataProvider.ExcelSheet;
import enums.Country;
import org.testng.annotations.Test;
import pages.SubscriptionHomePage;

public class StcSubscriptionsInfo extends BaseTest{
    SubscriptionHomePage subscriptionHomePage = new SubscriptionHomePage();
   @Test(dataProviderClass = ExcelSheet.class, dataProvider = "KSA")
    public void testKsaSubscriptions(String packageType, String price, String currency) {
       subscriptionHomePage.changeCountry(Country.KSA);
       subscriptionHomePage.ValidateCountryName(Country.KSA);
       subscriptionHomePage.validatePackage(packageType, price, currency);
    }
    @Test(dataProviderClass = ExcelSheet.class, dataProvider = "Bahrain")
    public void testBahrainSubscriptions(String packageType, String price, String currency) {
        subscriptionHomePage.changeCountry(Country.Bahrain);
        subscriptionHomePage.ValidateCountryName(Country.Bahrain);
        subscriptionHomePage.validatePackage(packageType, price, currency);
    }
    @Test(dataProviderClass = ExcelSheet.class, dataProvider = "Kuwait")
    public void testKuwaitSubscriptions(String packageType, String price, String currency) {
        subscriptionHomePage.changeCountry(Country.Kuwait);
        subscriptionHomePage.ValidateCountryName(Country.Kuwait);
        subscriptionHomePage.validatePackage(packageType, price, currency);
    }
}
