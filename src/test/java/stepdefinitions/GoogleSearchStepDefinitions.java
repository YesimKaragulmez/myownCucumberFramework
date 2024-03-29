package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.GooglePage;
import utilities.Driver;

public class GoogleSearchStepDefinitions {
    GooglePage googlePage = new GooglePage();

    @Given("user is on the google page")
    public void user_is_on_the_google_page() {
        Driver.getDriver().get("https://www.google.com");
    }

    @Given("user searches for iphone")
    public void user_searches_for_iphone() {
        WebElement searchbox = Driver.getDriver().findElement(By.name("q"));
        searchbox.sendKeys("iphone");
        searchbox.submit();

    }

    @Then("verify the result has iphone")
    public void verify_the_result_has_iphone() {
        Assert.assertTrue(Driver.getDriver().getTitle().toLowerCase().contains("iphone"));
    }

    @Given("user clears the searchbox")
    public void user_clears_the_searchbox() {
        WebElement searchbox = Driver.getDriver().findElement(By.name("q"));
        searchbox.clear();

    }

    @Given("user searches for tea pot")
    public void user_searches_for_tea_pot() {
        WebElement searchbox = Driver.getDriver().findElement(By.name("q"));
        searchbox.sendKeys("tea pot");
        searchbox.submit();
    }

    @Then("verify the result has tea pot")
    public void verify_the_result_has_tea_pot() {
        Assert.assertTrue(Driver.getDriver().getTitle().toLowerCase().contains("tea pot"));

    }

    @Given("user searches for {string}")
    public void user_searches_for(String string) {
        googlePage.searchBox.sendKeys(string + Keys.ENTER);

    }

    @Then("verify the result has {string}")
    public void verify_the_result_has(String string) {
        String title = Driver.getDriver().getTitle().toLowerCase();
        System.out.println("Title : " + title);
        Assert.assertTrue(title.contains(string));

    }


}
