package pages;

import base.DriverFactory;
import org.openqa.selenium.By;

public class TextBoxPage {

    private By fullName = By.id("userName");
    private By email = By.id("userEmail");
    private By currentAddress = By.id("currentAddress");
    private By permanentAddress = By.id("permanentAddress");
    private By submitBtn = By.id("submit");
    private By outputBox = By.id("output");

    public void enterFullName(String name) {
        DriverFactory.getDriver().findElement(fullName).sendKeys(name);
    }

    public void enterEmail(String mail) {
        DriverFactory.getDriver().findElement(email).sendKeys(mail);
    }

    public void enterCurrentAddress(String addr) {
        DriverFactory.getDriver().findElement(currentAddress).sendKeys(addr);
    }

    public void enterPermanentAddress(String addr) {
        DriverFactory.getDriver().findElement(permanentAddress).sendKeys(addr);
    }

    public void clickSubmit() {
        DriverFactory.getDriver().findElement(submitBtn).click();
    }

    public boolean isOutputDisplayed() {
        return DriverFactory.getDriver().findElement(outputBox).isDisplayed();
    }
}
