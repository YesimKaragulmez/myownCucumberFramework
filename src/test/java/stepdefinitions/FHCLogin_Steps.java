package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.FHCLoginPage;
import utilities.Driver;

public class FHCLogin_Steps {
    FHCLoginPage fhcLoginPage = new FHCLoginPage();

    @Given("user is on the fhctriplogin page")
    public void user_is_on_the_fhctriplogin_page() {
        Driver.getDriver().get("http://www.fhctrip.com/Account/Logon");

    }

    @Given("user enter valid manager username")
    public void user_enter_valid_manager_username() {
        fhcLoginPage.userName.sendKeys("manager2");

    }

    @Given("user enter valid manager password")
    public void user_enter_valid_manager_password() {
        fhcLoginPage.password.sendKeys("Man1ager2!");

    }

    @Given("user clicks on login button")
    public void user_clicks_on_login_button() {
        fhcLoginPage.signInButton.click();

    }

    @Then("verify the manager login is successful")
    public void verify_the_manager_login_is_successful() {
        //  WebElement text=Driver.getDriver().findElement(By.xpath("//span[@class='caption-subject font-green-sharp bold uppercase']"));
        //   Assert.assertTrue(text.isDisplayed());
        String title = Driver.getDriver().getTitle();
        Assert.assertTrue(title.contains("Admin"));
        Driver.closeDriver();

    }

    @Given("user enter valid manager username {string}")
    public void user_enter_valid_manager_username(String string) {
        fhcLoginPage.userName.sendKeys(string);

    }

    @Given("user enter valid manager password {string}")
    public void user_enter_valid_manager_password(String string) {
        fhcLoginPage.password.sendKeys(string);

    }


}
