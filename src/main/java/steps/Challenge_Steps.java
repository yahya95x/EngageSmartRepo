package steps;


import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import pages.HeroPage;
import utils.Driver;

public class Challenge_Steps {
    WebDriver driver;
    HeroPage heroPage;
    @Before
    public void setDriver(){
        driver = Driver.getDriver();
        heroPage = new HeroPage();
    }

    @After
    public void tearDown(){
        driver.quit();
    }

    @Given("user navigates to {string}")
    public void user_navigates_to(String string) {
        driver.get("https://the-internet.herokuapp.com/add_remove_elements/");
    }
    @Given("the user should see the {string}")
    public void the_user_should_see_the(String string) {
        Assert.assertTrue(heroPage.pageHeader.isDisplayed());
    }
    @When("the user clicks on {string} button")
    public void the_user_clicks_on_button(String string) {
        for (int i = 0; i < 10; i++) {
            heroPage.addElementButton.click();
        }
    }
    @Then("the use should see the {string} button")
    public void the_use_should_see_the_button(String string) {

        for (int i = 0; i < heroPage.elementsAdded.size(); i++) {
            Assert.assertTrue(heroPage.elementsAdded.get(i).isDisplayed());
        }
    }
}
