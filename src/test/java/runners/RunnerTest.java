package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"steps", "hooks"}
        // tags = "@login",
        //  tags = "@addDeleteAllBooks"
        // tags = "@bookStoreSearch"
        // tags = "@addAndDeleteOneBooks"
        // tags = "@bookStoreSort"
        // tags = "@deleteAccount"
        // tags = "@logout"
        //   tags = "@register_bookStoreSort"
        // tags = "@register_bookStoreSearch"
        // tags = "@registration"
        // tags = "@bookStore_readBook"

)

public class RunnerTest {

}
