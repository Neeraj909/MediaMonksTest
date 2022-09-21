package runner;

import base.UIBase;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/Java/featurefile"},
        format = {"pretty", "html:test-output","json:json_output/cucumber.json"},
        glue = {"steps"},
        tags = "@MediaMock")
public class RunCubeTest {


}
