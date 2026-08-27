package dataproviders;

import org.testng.annotations.DataProvider;
import utils.ExcelUtils;

public class TextBoxDataProvider {

    @DataProvider(name = "textBoxData")
    public Object[][] getData() {
        return ExcelUtils.getSheetData("TestData.xlsx", "Sheet1");
    }
}
