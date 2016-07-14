package feature.manualRunner;
/**
 * Created by alm_alm_auto on 2/17/2016.
 */

import cucumber.api.CucumberOptions;
import org.junit.runner.RunWith;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"junit:junitResult.xml", "html:output.html", "json", "feature.manualRunner.support.GherkinNGAFormatter"},
                 features = "src/test/resources/feature/manualRunner")
public class ManualRunnerTest {

}