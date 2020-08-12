package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class GLBSignPage {
    @FindBy(linkText = "Join Now")
    public WebElement joinNow;
    @FindBy(id = "email")
    public WebElement email;
    @FindBy(name = "name")
    public WebElement name;
    @FindBy(id = "mobile")
    public WebElement mobile;
    @FindBy(id = "password")
    public WebElement password;
    @FindBy(id = "re_password")
    public WebElement confirm;
    @FindBy(name = "submit")
    public WebElement signUpButton;
    @FindBy(xpath = "//strong[text()='Success!']")
    public WebElement message;

    public GLBSignPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
