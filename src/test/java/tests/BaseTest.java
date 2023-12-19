package tests;

import driver.DriverActions;
import io.cucumber.java.AfterAll;
import io.cucumber.java.BeforeAll;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.testng.annotations.*;


public class BaseTest extends AbstractTestNGCucumberTests {
    //protected BaseTest(){}

    //@Before
    @BeforeSuite
    protected void setUp() throws Exception {
        System.out.println(Thread.currentThread().getId());
        DriverActions.initDriver();
    }

    @AfterSuite
    protected void tearDown() {
        System.out.println(Thread.currentThread().getId());
        DriverActions.quitDriver();
    }
}

