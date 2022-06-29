package com.runner;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Tags;
import org.junit.runner.RunWith;
import org.openqa.selenium.By.ByTagName;
import org.openqa.selenium.WebDriver;

import com.Baseclas.BaseClass;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;





@RunWith(Cucumber.class)
@CucumberOptions(features = "src\\test\\java\\com\\feature", glue = "com\\stepDefenition",monochrome = true,dryRun = false,publish = true,
plugin = {"html:target/cucumber/report.html",
		"pretty",
		"json:target/jsonreport.json",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		,tags = "@smoketest")
	//	"com.cucumber.listener.ExtentCucumberFormatter:target/extentreport/ExtentReport.html"} )
    


//plugin = {"html:report","pretty","json:report/cucumber.json","com.cucumber.listener.ExtentCucumberFormatter:report/ExtentReport.html"}
public class TestRunner {
	public static WebDriver driver;

	@BeforeClass

	public static void setup() {

		driver = BaseClass.launchBrowser("chrome");
		
	}
	@AfterClass
	public static void tearDown() {

		driver.close();

	}

}
