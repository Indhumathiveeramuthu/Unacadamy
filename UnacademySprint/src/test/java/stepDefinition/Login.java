package stepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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

public class Login {
	WebDriver driver = DriverFactory.getDriver();
	LoginPage loginPage = new LoginPage(driver);
	FileUtility fileUtility = new FileUtility();
	WebDriverUtility driverUtility = new WebDriverUtility();
	JavaScriptUtility javaScriptUtil = new JavaScriptUtility(driver);
//	ExtentReporter test;

	@Given("Browser is open and url is navigated")
	public void browser_is_open_and_url_is_navigated() throws Exception {
		String actualURL = driver.getCurrentUrl();
		String expectedURL = fileUtility.getDataFromPropertiesFiles("url");
		Assert.assertEquals(actualURL, expectedURL, "URL is not navigated");
	}

	@Given("user is able to click on login button")
	public void user_is_able_to_click_on_login_button() {
		loginPage.clickMethod( loginPage.getLoginButton());

	}

	@When("user enters phone number")
	public void user_enters_phone_number() throws Exception {
		String phoneNumber = fileUtility.getDataFromExcel("Sheet1", 1, 0);
		loginPage.sendKeysMethod(loginPage.getPhoneNumberTextField(),phoneNumber);
	}

	@When("user clicks on login button")
	public void user_clicks_on_login_button() {
		loginPage.clickMethod(loginPage.getOtploginButton());
	}

	@When("user should enter otp")
	public void user_should_enter_otp() throws InterruptedException {
		Thread.sleep(30000);
	}

	@Then("user should be successfully logged in")
	public void user_should_be_successfully_logged_in() {

		Reporter.log("Logged in successfully..", true);
	}

	@Given("Home page is displayed")
	public void home_page_is_displayed() throws InterruptedException {
		Assert.assertEquals(loginPage.getHomePageText().getText(), "Crack UPSC CSE - GS with Unacademy");
		Reporter.log("Home page is displayed..........", true);
		Thread.sleep(2000);
//		test.log(Status.PASS,"Home page is displayed");

	}

	@Given("user is able to click on drop down button")
	public void user_is_able_to_click_on_drop_down_button() throws InterruptedException {
		loginPage.clickMethod(loginPage.getDropDown());
		Reporter.log("User clicked drop down..........", true);
		Thread.sleep(2000);
	}

	@Then("user is able to select IIT-JAM")
	public void user_is_able_to_select_iit_jam() throws InterruptedException {
		loginPage.clickMethod(loginPage.getCourse());
		Reporter.log("User selected IIT-JAM..........", true);
		Thread.sleep(3000);
	}

	@Then("user is able to click on Live classes")
	public void user_is_able_to_click_on_live_classes() throws InterruptedException {
		loginPage.clickMethod(loginPage.getLiveClasses());
		Reporter.log("User clicked Live Classes..........", true);
	}

	@Then("Live class page is displayed")
	public void live_class_page_is_displayed() throws InterruptedException {
		Assert.assertEquals(loginPage.getLiveClassPage().getText(), "Free classes for IIT-JAM");
		Reporter.log("Live Classes page is displayed..........", true);
		Thread.sleep(2000);
	}

	@Then("user clicks on practice")
	public void user_clicks_on_practice() throws InterruptedException {
		loginPage.clickMethod(loginPage.getPracticeLink());
		Reporter.log("User clicked Practice...", true);
		Thread.sleep(2000);

	}

	@Then("practice page is displyed")
	public void practice_page_is_displyed() throws InterruptedException {
		Assert.assertEquals(driver.getCurrentUrl(), "https://unacademy.com/goal/iit-jam/SIFWL/practice/topics");
		Reporter.log("Practice page is displayed..........", true);
		Thread.sleep(2000);

	}

	@Then("scroll down")
	public void scroll_down() throws InterruptedException {
		WebDriverUtility Web = new WebDriverUtility();
		Web.actionScrollTillElement(driver, loginPage.getSequenceSeries());
		Reporter.log("Scrolled to Sequence & series.......", true);
		Thread.sleep(2000);
	}

	@Then("user click on Sequence & Series Number")
	public void user_click_on_sequence_series_number() throws InterruptedException {
		loginPage.clickMethod(loginPage.getSequenceSeriesLink());
		Reporter.log("User clicked Sequence & Series number.......", true);
		Thread.sleep(2000);

	}

	@When("user is able to click on Try learning free button")
	public void user_is_able_to_click_on_try_learning_free_button() throws InterruptedException {
		loginPage.clickMethod(loginPage.getTryLearningFreeButton());
		Reporter.log("User clicked Try learning for free.......", true);
		Thread.sleep(2000);
	}

	@Then("browse page is displayed")
	public void browse_page_is_displayed() {
		Assert.assertEquals(loginPage.getBrowsePageText().getText(), "IIT-JAM");
		Reporter.log("Browse page is displayed..........", true);

	}

	@When("user clicks on see all")
	public void user_clicks_on_see_all() throws InterruptedException {
		loginPage.clickMethod(loginPage.getSeeAllButton());
		Reporter.log("User clicked seeAll button.........", true);
		Thread.sleep(2000);
	}

	@Then("IIT-JAM Batches is displayed")
	public void iit_jam_batches_is_displayed() throws InterruptedException {
		Assert.assertEquals(loginPage.getBatchesPage().getText(), "IIT-JAM Batches");
		Reporter.log("IIT-JAM batch page is displayed..........", true);
		Thread.sleep(2000);
	}

	@Then("user clicks on All dropdown button")
	public void user_clicks_on_all_dropdown_button() {
		loginPage.clickMethod(loginPage.getBatchesDropDown());
		Reporter.log("user clicked dropdown..........", true);

	}

	@When("user select Ongoing")
	public void user_select_ongoing() throws InterruptedException {
		loginPage.clickMethod(loginPage.getOngoingOption());
		Reporter.log("user clicked ongoing..........", true);
		Thread.sleep(2000);
	}

	@Then("Ongoing Batches page is displayed")
	public void ongoing_batches_page_is_displayed() throws InterruptedException {
		Assert.assertEquals(loginPage.getOngoingBatchesPage().getText(),
				"Ultimate Crash Course Batch for IIT-JAM 2025 Maths Stats");
		Reporter.log("Ongoing Batches page is displayed..........", true);
		Thread.sleep(2000);
	}

	@When("user click on view subscription offers")
	public void user_click_on_view_subscription_offers() throws InterruptedException {
		Thread.sleep(2000);
		loginPage.clickMethod(loginPage.getSubscriptionPlan());
		Thread.sleep(2000);
		loginPage.clickMethod(loginPage.getGetStarted());
		Thread.sleep(3000);
		loginPage.clickMethod(loginPage.getViewSubscription());
		Reporter.log("user clicked on view subscription offers..........", true);
		Thread.sleep(2000);

	}

	@When("navigated to offer page")
	public void navigated_to_offer_page() throws InterruptedException {
		Assert.assertEquals(loginPage.getOfferPage().getText(), "GET EXTRA MONTHS WITH");
		Reporter.log(" offer page is displayed..........", true);
		Thread.sleep(2000);
	}

	@Then("user clicks on Three month subscription")
	public void user_clicks_on_three_month_subscription() throws InterruptedException {
		loginPage.clickMethod(loginPage.getThreeMonthSubscription());
		Reporter.log("User clicked Three month subscription..........", true);
		Thread.sleep(3000);

	}

	@Then("user clicks on claim now")
	public void user_clicks_on_claim_now() throws InterruptedException {
		loginPage.clickMethod(loginPage.getClaimButton());
		Reporter.log("user clicked claim now.........", true);
		Thread.sleep(3000);

	}

	@Then("user is able to see payment page")
	public void user_is_able_to_see_payment_page() throws InterruptedException {
		Assert.assertEquals(loginPage.getPaymentPage().getText(), "Pay with UPI QR");
		Reporter.log("Payment page is displayed..........", true);
		Thread.sleep(3000);

	}


@Then("user select {int}")
public void user_select(Integer int1) throws Exception {
Thread.sleep(5000);

JavaScriptUtility javaScriptUtility=new JavaScriptUtility(driver);
javaScriptUtility.jsClick(loginPage.getAllButton());
Thread.sleep(3000);
String option=fileUtility.getDataFromExcel("Sheet2", int1, 0);
switch(option) {
case "Ongoing":
	Thread.sleep(3000);
	loginPage.clickMethod(loginPage.getOngoingOption());
	Thread.sleep(2000);
	break;
case "Upcoming":
	Thread.sleep(3000);
	loginPage.clickMethod(loginPage.getUpcomingOption());
	Thread.sleep(2000);
	break;

case "Completed":
	Thread.sleep(3000);
	loginPage.clickMethod(loginPage.getCompletedOption());
	Thread.sleep(2000);
	break;
}}

}
