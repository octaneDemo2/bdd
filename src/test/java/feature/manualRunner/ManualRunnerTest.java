package feature.manualRunner;
/**
 * Created by alm_alm_auto on 2/17/2016.
 */

import com.hpe.alm.octane.OctaneCucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(OctaneCucumber.class)
@CucumberOptions(plugin = {"junit:junitResult.xml", "html:output.html"},
                 features = "src/test/resources/feature/manualRunner")
public class ManualRunnerTest {

}