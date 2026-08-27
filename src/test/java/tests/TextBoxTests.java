package tests;

import base.BaseTest;
import dataproviders.TextBoxDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TextBoxPage;

public class TextBoxTests extends BaseTest {

    @Test(dataProvider = "textBoxData", dataProviderClass = TextBoxDataProvider.class)
    public void verifyTextBox(String name, String email, String currentAddr, String permAddr) {

        TextBoxPage tb = new TextBoxPage();

        tb.enterFullName(name);
        tb.enterEmail(email);
        tb.enterCurrentAddress(currentAddr);
        tb.enterPermanentAddress(permAddr);
        tb.clickSubmit();

        Assert.assertTrue(tb.isOutputDisplayed(), "Output should be displayed");
    }
}
