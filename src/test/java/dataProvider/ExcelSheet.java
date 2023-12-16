package dataProvider;
import helpers.ExcelHelper;
import org.testng.annotations.DataProvider;
import java.io.IOException;


public class ExcelSheet {
    @DataProvider(name="KSA")
    public Object[][] getKsaSubscriptionData() throws IOException
    {
        ExcelHelper xl=new ExcelHelper("SubscriptionData");
        return xl.getDataFromExcel("KSA");
    }
    @DataProvider(name="Bahrain")
    public Object[][] getBahrainSubscriptionData() throws IOException
    {
        ExcelHelper xl=new ExcelHelper("SubscriptionData");
        return xl.getDataFromExcel("Bahrain");
    }
    @DataProvider(name="Kuwait")
    public Object[][] getKuwaitSubscriptionData() throws IOException
    {
        ExcelHelper xl=new ExcelHelper("SubscriptionData");
        return xl.getDataFromExcel("Kuwait");
    }
}
