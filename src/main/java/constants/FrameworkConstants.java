package constants;

public final class FrameworkConstants {
    private static final String CHROMEDRIVERPATH = getProjectDirectory() + "drivers\\chromedriver.exe";
    private static final String CONFIGFILEPATH = getProjectDirectory() + "src\\test\\java\\config\\config.properties";
    private static final int EXPLICITWAIT = 10;
    private static final String RESOURCESPATH = getProjectDirectory() +"src\\test\\java\\data\\";


    public static String getChromePath(){
        return CHROMEDRIVERPATH;
    }
    public static String getProjectDirectory(){
        return System.getProperty("user.dir") + "\\";
    }
    public static String getConfigFilePath(){
        return CONFIGFILEPATH;
    }
    public static int getExplicitwait(){
        return EXPLICITWAIT;
    }
    public static String readDataFile(String fileName){
        System.out.println(RESOURCESPATH + fileName);
        return RESOURCESPATH + fileName;
    }




}
