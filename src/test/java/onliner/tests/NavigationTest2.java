package onliner.tests;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

/*1. Перейти на кладку Автобарахолка
 * 2. Отфильтровать авто по цене до 100000$
 * 3. Отфильтровать авто по типу кузова: седан
 * 4. Отфильтровать авто по типу коробки передач: автоматическая
 * 5. Проверить работу фильтров */

@CucumberOptions(
        features ={"src/test/java/onliner/pageObject/feature/navigation.feature"},
        glue = "onliner/steps",
        plugin = {"pretty", "html:target/cucumber.json","json:target/cucumber-reports/CucumberTestReport.json"}
)
public class NavigationTest2 extends AbstractTestNGCucumberTests {
}

