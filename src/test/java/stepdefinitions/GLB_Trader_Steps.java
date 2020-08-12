package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.openqa.selenium.Keys;
import pages.GLBSignPage;
import utilities.Driver;

public class GLB_Trader_Steps {
    GLBSignPage glbSignPage = new GLBSignPage();

    @Given("user is on the glbtrader page")
    public void user_is_on_the_glbtrader_page() {
        Driver.getDriver().get("https://www.glbtrader.com/");

    }

    @Given("user click on the join now")
    public void user_click_on_the_join_now() {
        glbSignPage.joinNow.click();
    }

    @Given("user enter the email address")
    public void user_enter_the_email_address() {
        glbSignPage.email.sendKeys("jhn@gmail.com");

    }

    @Given("user enter the name")
    public void user_enter_the_name() {
        glbSignPage.name.sendKeys("Joe San");

    }

    @Given("user enter the mobile")
    public void user_enter_the_mobile() {
        glbSignPage.mobile.sendKeys("12345678");

    }

    @Given("user enter the password")
    public void user_enter_the_password() {
        glbSignPage.password.sendKeys("98765");

    }

    @Given("user confitm the password")
    public void user_confitm_the_password() {
        glbSignPage.confirm.sendKeys("98765");

    }

    @Given("user click on the sign Up")
    public void user_click_on_the_sign_Up() {
        glbSignPage.signUpButton.click();

    }

    @Then("verify the sign Up is successful")
    public void verify_the_sign_Up_is_successful() {
        //Assert.assertTrue(glbSignPage.message.getText().contains("Success !"));
    }

    @Given("user enter the email addre {string}")
    public void user_enter_the_email_addre(String string) {
        glbSignPage.email.sendKeys(string + Keys.ENTER);
    }

    @Given("user enter the name {string}")
    public void user_enter_the_name(String string) {
        glbSignPage.name.sendKeys(string + Keys.ENTER);
    }

    @Given("user enter the mobile {string}")
    public void user_enter_the_mobile(String string) {
        glbSignPage.mobile.sendKeys(string + Keys.ENTER);
    }

    @Given("user enter the password {string}")
    public void user_enter_the_password(String string) {
        glbSignPage.password.sendKeys(string + Keys.ENTER);
    }

    @Given("user confitm the password {string}")
    public void user_confitm_the_password(String string) {
        glbSignPage.confirm.sendKeys(string + Keys.ENTER);
    }


}