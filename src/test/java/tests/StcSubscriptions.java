package tests;

import dataProvider.ExcelSheet;
import enums.Country;
import org.testng.annotations.Test;
import pages.SubscriptionHomePage;

public class StcSubscriptions extends BaseTest{
    SubscriptionHomePage subscriptionHomePage = new SubscriptionHomePage();
    @Test(priority = 1)
    public void validateKsaCountry(){
        subscriptionHomePage.changeCountry(Country.KSA);
        subscriptionHomePage.validateCountryName(Country.KSA);
    }
   @Test(dataProviderClass = ExcelSheet.class, dataProvider = "KSA", priority = 2)
    public void testKsaSubscriptions(String packageType, String price, String currency) {
       subscriptionHomePage.validatePackage(packageType, price, currency);
    }
    @Test(priority = 3)
    public void validateBahrainCountry(){
        subscriptionHomePage.changeCountry(Country.Bahrain);
        subscriptionHomePage.validateCountryName(Country.Bahrain);
    }
    @Test(dataProviderClass = ExcelSheet.class, dataProvider = "Bahrain", priority = 4)
    public void testBahrainSubscriptions(String packageType, String price, String currency) {
        subscriptionHomePage.validatePackage(packageType, price, currency);
    }
    @Test(priority = 5)
    public void validateKuwaitCountry(){
        subscriptionHomePage.changeCountry(Country.Kuwait);
        subscriptionHomePage.validateCountryName(Country.Kuwait);
    }
    @Test(dataProviderClass = ExcelSheet.class, dataProvider = "Kuwait", priority = 6)
    public void testKuwaitSubscriptions(String packageType, String price, String currency) {
        subscriptionHomePage.validatePackage(packageType, price, currency);
    }
}
