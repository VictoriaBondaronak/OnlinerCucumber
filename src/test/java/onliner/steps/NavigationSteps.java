package onliner.steps;

import framework.BaseTest;
import framework.PropertyReader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import onliner.pageObject.pages.CatalogPage;
import onliner.pageObject.pages.MainPage;

public class NavigationSteps extends BaseTest {

    @When("Navigate to the {string} page")
    public void navigateToThePage(String headerItem) {
        MainPage mainPage = new MainPage();
        mainPage.navigateHeaderMenu(headerItem);
    }
    @And("Select {string} from the navigation menu")
    public void selectFromTheNavigationMenu(String headerMenuItem) {
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.navigateToMainMenuItem(headerMenuItem);
    }

    @And("In the submenu navigate to {string}")
    public void inTheSubmenuNavigateTo(String submenuItem) {
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.navigateToSubMenuItems(submenuItem);
    }

    @And("Go to the {string}")
    public void goToThe(String submenuCategory) {
        CatalogPage catalogPage = new CatalogPage();
        catalogPage.navigateToSubMenuCategory(submenuCategory);
    }
}
