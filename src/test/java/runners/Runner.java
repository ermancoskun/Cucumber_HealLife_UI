package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"pretty","html:target/cucumber-reports1.html",
                "json:target/json-reports/cucumber1.json",
                "junit:target/xml-report/cucumber1.xml"
        },
        features = "src/test/resources",
        glue={"stepdefinitions","hooks"}, //stepdefinitions package icinde hooks yoksa ayrica belirtmeliyiz
        tags= "@azat"












)
public class Runner {
}
