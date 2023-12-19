package base;

import driver.DriverManager;
import enums.WaitStrategy;
import factories.ExplicitWaitFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;


public class UIActions {
    public void clickOn(By locator, WaitStrategy waitStrategy){
        WebElement element =  ExplicitWaitFactory.performExplicitWait(waitStrategy, locator);
        element.click();
    }

    protected void writeIn(String text, By locator, WaitStrategy waitStrategy){
        WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, locator);
        element.sendKeys(text);
    }

    public String getText(By locator, WaitStrategy waitStrategy){
        WebElement element = ExplicitWaitFactory.performExplicitWait(waitStrategy, locator);
        return element.getText();
    }
    protected String getPageTitle(){
        return DriverManager.getDriver().getTitle();
    }
    public void validateText(String actual, String expected) throws AssertionError {
        if (!actual.equals(expected)) {
            throw new AssertionError("Validation failed! Actual: " + actual + ", Expected: " + expected);
        }
    }
}
