package tests;

import dataProvider.ExcelSheet;
import org.testng.annotations.DataProvider;

import java.io.IOException;

public class StcSubscriptionsInfo {

    @DataProvider(name = "KSA")
    public Object[][] getKsaSubscriptionData() throws IOException{
        ExcelSheet excelSheet = new ExcelSheet("SubscriptionData");
        return excelSheet.getKsaSubscriptionData();
    }

    @DataProvider(name = "Bahrain")
    public Object[][] getBahrainSubscriptionData() throws IOException{
        return new ExcelSheet("SubscriptionData").getDataFromExcelFile("Bahrain");
    }

    @DataProvider(name = "Kuwait")
    public Object[][] getKuwaitSubscriptionData() throws IOException {
        return new ExcelSheet("SubscriptionData").getDataFromExcelFile("Kuwait");
    }
}