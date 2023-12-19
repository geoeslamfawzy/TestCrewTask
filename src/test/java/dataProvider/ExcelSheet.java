package dataProvider;
import helpers.ExcelHelper;
import org.testng.annotations.DataProvider;
import java.io.IOException;


public class ExcelSheet {
    private String fileName;
    public ExcelSheet(){
    }
    public ExcelSheet(String fileName){
        this.fileName = fileName;
    }
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
    @DataProvider(name="try")
    public Object[][] getDataFromExcelFile(String sheetName)throws IOException{
        ExcelHelper xl=new ExcelHelper(fileName);
        return xl.getDataFromExcel("Kuwait");
    }
    public Object[][] getDataFromExcelFile(String fileName, String sheetName)throws IOException{
        ExcelHelper xl=new ExcelHelper(fileName);
        return xl.getDataFromExcel(sheetName);
    }
}
