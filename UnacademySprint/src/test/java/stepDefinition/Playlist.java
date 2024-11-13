package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentReporter;

import elementRepository.LoginPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import utilPackage.DriverFactory;
import utilityClasses.FileUtility;
import utilityClasses.JavaScriptUtility;
import utilityClasses.WebDriverUtility;
import utilityClasses.JavaUtility;


public class Playlist{
	WebDriver driver=DriverFactory.getDriver();
	LoginPage loginPage=new LoginPage(driver);
	FileUtility fileUtility=new FileUtility();
	WebDriverUtility driverUtility=new WebDriverUtility();
	JavaScriptUtility javaScriptUtil=new JavaScriptUtility(driver);


@When("user is able to click on playlist")
public void user_is_able_to_click_on_playlist() throws InterruptedException {
	loginPage.getPlayListButton().click();
	Reporter.log("user clicked playlist .......",true);
	Thread.sleep(2000);	

}

@When("user is able to click on Biological science")
public void user_is_able_to_click_on_biological_science() throws InterruptedException {
	loginPage.getBiologicalScienceButton().click();
	Reporter.log("user clicked Biological science .......",true);
	Thread.sleep(1000);

}

@When("user is able to click on Preparation & Strategy")
public void user_is_able_to_click_on_preparation_strategy() throws InterruptedException {
	loginPage.getPreparationStrategyButton().click();
	Reporter.log("user clicked Preparation & Strategy .......",true);
	Thread.sleep(1000);
}

@When("user clicks on Capsule Course on Cell Biology for IIT-JAM")
public void user_clicks_on_capsule_course_on_cell_biology_for_iit_jam() throws InterruptedException {
	loginPage.getBioForIIT().click();
	Reporter.log("user clicked on Capsule Course on Cell Biology for IIT-JAM .......",true);
	Thread.sleep(1000);

}

@When("user is able to see Capsule Course on Cell Biology for IIT-JAM")
public void user_is_able_to_see_capsule_course_on_cell_biology_for_iit_jam() throws InterruptedException {
	Assert.assertEquals(loginPage.getCccValidationPage().getText(),"Ended on Aug 31");
	Reporter.log("user is able to see Capsule Course on Cell Biology for IIT-JAM .......",true);
	Thread.sleep(1000);
 
}

}