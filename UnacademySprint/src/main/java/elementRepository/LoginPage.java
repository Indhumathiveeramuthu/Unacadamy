package elementRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	 
	@FindBy(xpath = "//span[text()='Log in']")
	private WebElement loginButton;
	
     @FindBy(xpath = "//input[@type='tel' and @maxlength='15']")
     private WebElement phoneNumberTextField;
     
     @FindBy(xpath = "//button[text()='Login']")
     private WebElement otploginButton;
     
     @FindBy(xpath="//h1[text()='Crack UPSC CSE - GS with Unacademy']")
     private WebElement homePageText;
     
     @FindBy(xpath="//button[@class='css-700ue5-DropDownButton ecnotob0']")
	  private WebElement dropDown;
     
     @FindBy(xpath="//p[text()='IIT-JAM ']")
     private WebElement course;
     
     
	@FindBy(xpath="//p[text()='Watch free online coaching classes by our best educators.']")
     private WebElement liveClasses;
	@FindBy(xpath="//h1[text()='Free classes for IIT-JAM ']")
	private WebElement liveClassPage;
    
	@FindBy(xpath="//a[@data-id='practice']")
      private WebElement practiceLink;
      
      @FindBy(xpath="//p[text()='Sequences & Series-Real Nos.']")
      private WebElement sequenceSeries;
        
      @FindBy(xpath="//p[text()='Sequences & Series-Real Nos.']")
      private WebElement sequenceSeriesLink;
       
      @FindBy(xpath= "//span[text()='Try learning for free']")
      private WebElement tryLearningFreeButton;
      
      
	 @FindBy(xpath="//h2[text()='IIT-JAM ']")
	 private WebElement browsePageText;
	 
	 @FindBy(xpath="//p[@class=\"css-1xttlr0-P1-BoldP1 ejsopzy1\"]")
     private WebElement seeAllButton;
	
	 @FindBy(xpath="//h1[text()='IIT-JAM  Batches']")
     private WebElement batchesPage;
	  
//	 @FindBy(xpath="//button[@class='css-swvbk7-DropDownButton e1v4hctf0']")
//      private WebElement batchesDropDown;
	 
	 @FindBy(xpath="//button[text()='All']")
	 private WebElement batchesDropDown;
	 @FindBy(xpath="//span[text()='Ongoing']")
	 private WebElement ongoingOption;
	 
	 @FindBy(xpath="//span[text()='Upcoming']")
	 private WebElement upcomingOption;
	 
	 @FindBy(xpath="//span[text()='Completed']")
	 private WebElement completedOption;
	 
	 @FindBy(xpath="//button[text()='All']")
	 private WebElement allButton;
	public WebElement getAllButton() {
		return allButton;
	}

		//ongoing option
		public WebElement getOngoingOption() {
			return ongoingOption;
		}
	 
	 public WebElement getUpcomingOption() {
		return upcomingOption;
	}

	public WebElement getCompletedOption() {
		return completedOption;
	}
	public void ClickOnOption(WebDriver driver,String option) {
		driver.findElement(By.linkText(option)).click();
	}
	
	@FindBy(xpath="//h4[text()='Ultimate Crash Course Batch for IIT-JAM 2025 Maths Stats'] ")
      private WebElement ongoingBatchesPage;
	 
	
	
     @FindBy(xpath="(//span[@class='css-1orfikq']//h6[text()='View subscription offers'])[1]")
	  private WebElement viewSubscription;
     //subscription
     @FindBy(xpath="(//div[text()='Subscription plan'])[2]")
     private WebElement subscriptionPlan;
     //GetStarted
     @FindBy(xpath="(//div[text()='Get started'])[2]")
     private WebElement getStarted;
     
     public WebElement getGetStarted() {
		return getStarted;
	}

	public WebElement getSubscriptionPlan() {
		return subscriptionPlan;
	}

	@FindBy(xpath="//p[text()='GET EXTRA MONTHS WITH']")
     private WebElement offerPage;
     
     @FindBy(xpath="//h4[text()='3 months subscription']")
     private WebElement threeMonthSubscription;
     
     @FindBy(xpath="(//button[text()='Claim now'])[3]")
     private WebElement claimButton;
	
     @FindBy(xpath="//h4[text()='Pay with UPI QR']")
     private WebElement paymentPage;
    
     
     @FindBy(xpath="//h4[text()='Take a test for free and win up to 50% scholarship']")
     private WebElement playlistScrollPage;
     
     @FindBy(xpath="//h5[text()='Playlist']")
     private WebElement playListButton;
     
     @FindBy(xpath="//h3[text()='Biological Sc']")
     private WebElement biologicalScienceButton;
     
     @FindBy(xpath="//h3[text()='Preparation & Strategy']")
     private WebElement preparationStrategyButton;
     
     @FindBy(xpath="//h4[text()='Capsule Course on Cell Biology for IIT JAM 2021']")
     private WebElement bioForIIT;
      
     @FindBy(xpath="//h6[text()='Ended on Aug 31']")
     private WebElement cccValidationPage;
     
    
     
     
    
	//constructors
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		}

	//getters()
	public WebElement getLoginButton() {
		return loginButton;
	}

	public WebElement getPhoneNumberTextField() {
		return phoneNumberTextField;
	}

	public WebElement getOtploginButton() {
		return otploginButton;
	}

	public WebElement getHomePageText() {
		return homePageText;
	}
	//dropDown
	public WebElement getDropDown() {
		return dropDown;
	}
	//IIT_JAM
	public WebElement getCourse() {
		return course;
	}
	
	//Live classes
	public WebElement getLiveClasses() {
		return liveClasses;
	} 
	//live class page validation
	 public WebElement getLiveClassPage() {
			return liveClassPage;
		}
	//Practice link
	public WebElement getPracticeLink() {
		return practiceLink;
	}
	
	//Practice page text
	public WebElement getSequenceSeries() {
		return sequenceSeries;
	}
	//Sequence series link
	public WebElement getSequenceSeriesLink() {
		return sequenceSeriesLink;
	}
	
	//Try Learning Free
	public WebElement getTryLearningFreeButton() {
		return tryLearningFreeButton;
	}
	//browse page text
	public WebElement getBrowsePageText() {
		return browsePageText;
	}
	
	//SeeAll button
	public WebElement getSeeAllButton() {
			return seeAllButton;
		}
	//IIT-JAM batches page
	public WebElement getBatchesPage() {
		return batchesPage;
	}
	//Batches page
	public WebElement getBatchesDropDown() {
		return batchesDropDown;
	}
	
	//scenario outline
	
	
	
	
	// ongoing batches page
	public WebElement getOngoingBatchesPage() {
		return ongoingBatchesPage;
	}
	
	
	
	public WebElement getViewSubscription() {
		return viewSubscription;
	}

	public WebElement getOfferPage() {
		return offerPage;
	}

	public WebElement getThreeMonthSubscription() {
		return threeMonthSubscription;
	}

	public WebElement getClaimButton() {
		return claimButton;
	}
	public WebElement getPaymentPage() {
		return paymentPage;
	}

	public WebElement getPlaylistScrollPage() {
		return playlistScrollPage;
	}

	public WebElement getPlayListButton() {
		return playListButton;
	}

	public WebElement getBiologicalScienceButton() {
		return biologicalScienceButton;
	}

	public WebElement getPreparationStrategyButton() {
		return preparationStrategyButton;
	}

	public WebElement getBioForIIT() {
		return bioForIIT;
	}
	public WebElement getCccValidationPage() {
		return cccValidationPage;
	}
	//click method
	public void clickMethod(WebElement element) {
		element.click();
	}
	//sendkeys method
	public void sendKeysMethod(WebElement element,String keys) {
		element.sendKeys(keys);
	}

	
}
