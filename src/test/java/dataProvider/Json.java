package dataProvider;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import helpers.JsonHelper;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class Json {
    @DataProvider(name = "loginDataFromJson")
    public Object[][] getData() throws IOException {
        JsonHelper jsonHelper = new JsonHelper("loginData");
        return jsonHelper.getJsonArrayData("userLogins");
    }

}
