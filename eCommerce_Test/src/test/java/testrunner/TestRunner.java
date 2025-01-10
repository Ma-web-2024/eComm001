package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "C:\\Users\\mboudhiba\\git\\eComm001\\eCommerce_Test\\src\\test\\resources\\Features\\Adduser.feature" , glue= {"steps"}, monochrome=true,dryRun=false ,plugin={"pretty","json:target/cucumber.json","html:target/report.html"})
public class TestRunner {

}
