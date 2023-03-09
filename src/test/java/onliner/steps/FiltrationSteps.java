package onliner.steps;

import framework.BaseTest;
import framework.PropertyReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import onliner.pageObject.pages.AutobarakholkaPage;
import onliner.pageObject.pages.MainPage;

public class FiltrationSteps extends BaseTest {



    @Given("Go to {string}")
    public void goTo(String url) {
        driver.navigate(PropertyReader.getProperty(url));
    }

    @When("I navigate to the {string} page")
    public void iNavigateToThePage(String headerMenuItem) {
        MainPage mainPage = new MainPage();
        mainPage.navigateHeaderMenu("Автобарахолка");
    }

    @And("In filters choose {string} as currency")
    public void inFiltersChooseAsCurrency(String currency) {
        AutobarakholkaPage autobarakholkaPage = new AutobarakholkaPage();
        autobarakholkaPage.chooseCurrency(currency);
    }

    @And("In filter {int} input from {string} to {string}")
    public void inFilterInputFromTo(int formIndex, String startPrice, String endPrice) throws InterruptedException {
        AutobarakholkaPage autobarakholkaPage = new AutobarakholkaPage();
        autobarakholkaPage.filterByRange(startPrice,endPrice,formIndex);

    }

    @And("Click the menu of filter with text {string}")
    public void clickTheMenuOfFilter(String filterButtonText) {
        AutobarakholkaPage autobarakholkaPage = new AutobarakholkaPage();
        autobarakholkaPage.filterClick(filterButtonText);

    }

    @And("In submenu choose item {string}")
    public void inSubmenuChooseItem(String item) {
        AutobarakholkaPage autobarakholkaPage = new AutobarakholkaPage();
        autobarakholkaPage.filterSubmenuClick(item);
    }

    @And("In filter {string} choose {string}")
    public void inFilterChoose(String arg0, String item) {
        AutobarakholkaPage autobarakholkaPage = new AutobarakholkaPage();
        autobarakholkaPage.checkBoxChoose(item);
    }

    @And("Check results")
    public void checkResults() {
        AutobarakholkaPage autobarakholkaPage = new AutobarakholkaPage();
        autobarakholkaPage.checkResults("Автоматическая", "Седан", 0,100000);
    }
}
