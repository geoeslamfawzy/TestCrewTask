package pages;

import base.UIActions;
import enums.Country;
import enums.Packages;
import enums.WaitStrategy;
import org.openqa.selenium.By;

public class SubscriptionHomePage {
    UIActions ui = new UIActions();
    private final By countryName = By.id("country-name");
    public final By pageTitle = By.xpath("//h2[@class ='mobile-hidden']");
    private final By saudiChoice = By.xpath("//a[@id='sa']");
    private final By bahrainChoice = By.xpath("//a[@id='bh']");
    private final By kuwaitChoice = By.xpath("//a[@id='kw']");

    private final By litePackage = By.id("name-lite");
    private final By litePrice = By.xpath("//div[@id='currency-lite']/b");
    private final By liteCurrency = By.xpath("//div[@id='currency-lite']/i");

    private final By classicPackage = By.id("name-classic");
    private final By classicPrice = By.xpath("//div[@id='currency-classic']/b");
    private final By classicCurrency = By.xpath("//div[@id='currency-classic']/i");

    private final By premiumPackage = By.id("name-premium");
    private final By premiumPrice = By.xpath("//div[@id='currency-premium']/b");
    private final By premiumCurrency = By.xpath("//div[@id='currency-premium']/i");
    public String getCountryName(){
        return ui.getText(countryName, WaitStrategy.VISIBLE);
    }
    public String getLitePackage() {
        return ui.getText(litePackage, WaitStrategy.PRESENCE);
    }

    public String getLitePrice() {
        return ui.getText(litePrice, WaitStrategy.PRESENCE);
    }

    public String getLiteCurrency() {
        return ui.getText(liteCurrency, WaitStrategy.PRESENCE);
    }

    public String getClassicPackage() {
        return ui.getText(classicPackage, WaitStrategy.PRESENCE);
    }

    public String getClassicPrice() {
        return ui.getText(classicPrice, WaitStrategy.PRESENCE);
    }

    public String getClassicCurrency() {
        return ui.getText(classicCurrency, WaitStrategy.PRESENCE);
    }

    public String getPremiumPackage() {
        return ui.getText(premiumPackage, WaitStrategy.PRESENCE);
    }

    public String getPremiumPrice() {
        return ui.getText(premiumPrice, WaitStrategy.PRESENCE);
    }

    public String getPremiumCurrency() {
        return ui.getText(premiumCurrency, WaitStrategy.PRESENCE);
    }
   public void validatePackage(Packages packages, String packageType, String price, String currency) {
        switch (packages) {
            case LITE:
                validatePackageDetails(getLitePackage(), packageType, getLitePrice(), price, getLiteCurrency(), currency);
                break;
            case Classic:
                validatePackageDetails(getClassicPackage(), packageType, getClassicPrice(), price, getClassicCurrency(), currency);
                break;
            case Premium:
                validatePackageDetails(getPremiumPackage(), packageType, getPremiumPrice(), price, getPremiumCurrency(), currency);
                break;
            default:
        }
    }

    private void validatePackageDetails(String actualPackage, String expectedPackage,
                                        String actualPrice, String expectedPrice,
                                        String actualCurrency, String expectedCurrency) {
        ui.validateText(actualPackage.toLowerCase(), expectedPackage.toLowerCase());
        ui.validateText(actualPrice.toLowerCase(), String.valueOf(expectedPrice).toLowerCase());
        ui.validateText(actualCurrency.toLowerCase(), expectedCurrency.toLowerCase());
    }

    public void validatePackage(String packageType, String price, String currency){
        Packages packages = Packages.valueOf(packageType);

        switch (packages){
            case LITE  :
                ui.validateText(getLitePackage().toLowerCase(), packageType.toLowerCase());
                ui.validateText(getLitePrice().toLowerCase(), String.valueOf(price).toLowerCase());
                ui.validateText(getLiteCurrency().toLowerCase(), currency.toLowerCase());
                break;
            case Classic:
                ui.validateText(getClassicPackage().toLowerCase(), packageType.toLowerCase());
                ui.validateText(getClassicPrice().toLowerCase(), String.valueOf(price).toLowerCase());
                ui.validateText(getClassicCurrency().toLowerCase(), currency.toLowerCase());
                break;
            case Premium:
                ui.validateText(getPremiumPackage().toLowerCase(), packageType.toLowerCase());
                ui.validateText(getPremiumPrice().toLowerCase(), String.valueOf(price).toLowerCase());
                ui.validateText(getPremiumCurrency().toLowerCase(), currency.toLowerCase());
                break;
            default:
        }
    }
    public void validateCountryName(Country country){
        ui.validateText(ui.getText(countryName, WaitStrategy.VISIBLE).toLowerCase(), country.toString().toLowerCase());
    }
    public void changeCountry(Country country){
        ui.clickOn(countryName, WaitStrategy.ClICKABLE);
        switch(country){
            case KSA:
            ui.clickOn(saudiChoice, WaitStrategy.ClICKABLE);
            break;
            case Bahrain:
                ui.clickOn(bahrainChoice, WaitStrategy.ClICKABLE);
                break;
            case Kuwait:
                ui.clickOn(kuwaitChoice, WaitStrategy.ClICKABLE);
                break;
        }
    }
    public void validatePageTitle(){
        ui.validateText(ui.getText(this.pageTitle, WaitStrategy.VISIBLE), "Choose Your Plan");
    }


}
