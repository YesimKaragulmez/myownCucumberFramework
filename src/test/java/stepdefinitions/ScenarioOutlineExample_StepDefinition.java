package stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.DataTablesPage;
import utilities.Driver;

public class ScenarioOutlineExample_StepDefinition {
    DataTablesPage dataTablesPage = new DataTablesPage();

    @Given("user is on the datatables")
    public void user_is_on_the_datatables() {
        Driver.getDriver().get("https://editor.datatables.net/");

    }

    @Given("user clicks on new button")
    public void user_clicks_on_new_button() {
        dataTablesPage.newButton.click();

    }

    @Given("user enters firstname")
    public void user_enters_firstname() {
        dataTablesPage.firstName.sendKeys("Yesim");
    }

    @Given("user enters lastname")
    public void user_enters_lastname() {

        dataTablesPage.lastName.sendKeys("Kara");
    }

    @Given("user enters position")
    public void user_enters_position() {
        dataTablesPage.position.sendKeys("QA");

    }

    @Given("user enters office")
    public void user_enters_office() {
        dataTablesPage.office.sendKeys("Houston");

    }

    @Given("user enters extension")
    public void user_enters_extension() {
        dataTablesPage.extension.sendKeys("123");

    }

    @Given("user enters startdate")
    public void user_enters_startdate() {
        dataTablesPage.startDate.sendKeys("2020-05-06");

    }

    @Given("user enters salary")
    public void user_enters_salary() {
        dataTablesPage.salary.sendKeys("90000");

    }

    @Given("clicks create button")
    public void clicks_create_button() throws InterruptedException {
        Thread.sleep(5000);
        dataTablesPage.createButton.click();

    }

    @Given("user enters firstname to the searchbox")
    public void user_enters_firstname_to_the_searchbox() {
        dataTablesPage.searchBox.sendKeys("yesim");

    }

    @Then("verify that user see the first name in the searchbox")
    public void verify_that_user_see_the_first_name_in_the_searchbox() {
        String name = dataTablesPage.nameField.getText();
        Assert.assertTrue(name.contains("Yesim Kara"));
    }

    @Given("user enters firstname {string}")
    public void user_enters_firstname(String firstname) {
        dataTablesPage.firstName.sendKeys(firstname);

    }

    @Given("user enters lastname {string}")
    public void user_enters_lastname(String lastname) {
        dataTablesPage.lastName.sendKeys(lastname);

    }

    @Given("user enters position {string}")
    public void user_enters_position(String position) {
        dataTablesPage.position.sendKeys(position);
    }

    @Given("user enters office {string}")
    public void user_enters_office(String office) {
        dataTablesPage.office.sendKeys(office);
    }

    @Given("user enters extension {string}")
    public void user_enters_extension(String extension) {
        dataTablesPage.extension.sendKeys(extension);
    }

    @Given("user enters startdate {string}")
    public void user_enters_startdate(String startdate) {
        dataTablesPage.startDate.sendKeys(startdate);
    }

    @Given("user enters salary {string}")
    public void user_enters_salary(String salary) {
        dataTablesPage.salary.sendKeys(salary);
    }

    @Given("user enters firstname {string} to the searchbox")
    public void user_enters_firstname_to_the_searchbox(String firstname) {
        dataTablesPage.searchBox.sendKeys(firstname);
    }

    @Then("verify that user see the first name {string} in the searchbox")
    public void verify_that_user_see_the_first_name_in_the_searchbox(String firstname) throws InterruptedException {
        Thread.sleep(3000);
        String name = dataTablesPage.nameField.getText();//Test First Test Last
        Assert.assertTrue(name.contains(firstname));
        Driver.closeDriver();


    }
}
