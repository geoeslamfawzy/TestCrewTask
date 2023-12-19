package runners;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import tests.BaseTest;

@CucumberOptions(
        features = {"src/test/java/features/subscription.feature"},
        glue = {"stepDefinitions"},
        plugin = {"html:test-output/cucumber_reports/data.html"}
)
public class TestRunner extends BaseTest {
}

