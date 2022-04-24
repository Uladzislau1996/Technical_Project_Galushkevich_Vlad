package testproject;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPageTest {
    
    private WebDriver driver;
    private MainPage mainPage;


    @BeforeMethod
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.oppabet.com/");
        mainPage = new MainPage(driver);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    @Test        
    public void EnterRequsetOnTheSearchField(){
        mainPage.enterRequest("footbal");
        mainPage.clickButtonSearch();
        mainPage.isPopUpPresent();
        mainPage.isPopUpVisible();
    }
    

    @Test
    public void PageHasSearchFieldsAndButtons(){
        mainPage.SearcFieldsArePresent();
        mainPage.SearchFiealdAreVisible();
        mainPage.SearchButtonsArePresent();
        mainPage.SearchButtonsAreVisible();
    }

    @Test
    public void PopUPHasAllWebElements(){
        mainPage.enterRequest("football");
        mainPage.clickButtonSearch();
        mainPage.isPopUpPresent();
        mainPage.isPopUpVisible();
        mainPage.IsPopUpTitleIsPresent();
        mainPage.isPopUpTitleIsVisible();
        mainPage.PopUpCheckboxLinesPresent();
        mainPage.PopUpCheckboxLinesIsVisible();
        mainPage.PopUpCheckboxLivesPresent();
        mainPage.PopUpCheckboxLiveIsVisible();
        mainPage.PopUpCheckboxMatchIsPresent();
        mainPage.PopUpCheckboxMatcIsVisible();
        mainPage.PopUpCheckboxNameLiveIsPresent();
        mainPage.PopUpCheckboxNameLiveIsVisible();
        mainPage.PopUpCheckboxNameMatchIsPresent();
        mainPage.PopUpCheckboxNameMatchIsVisible();
        mainPage.PopUpCheckboxNameSportIsPresent();
        mainPage.PopUpCheckboxNameSportIsVisible();
        mainPage.PopUpClearButtonisPresent();
        mainPage.PopUpClearButtonIsVisible();
        mainPage.PopUpCloseButtonisPresent();
        mainPage.PopUpCloseButtonIsVisible();
        mainPage.PopUpMicrophoneButtonIsPresent();
        mainPage.PopUpMicrophoneButtonIsVisible();
        mainPage.PopUpSearcFieldisPresent();
        mainPage.PopUpSearcFieldIsVisible();
        mainPage.PopUpSearchButtonIsPresent();
        mainPage.PopUpSearchButtonIsVisible();
        mainPage.PopUpTabLeaguesIsPresent();
        mainPage.PopUpTabLeaguesIsVisible();
        mainPage.PopUpTabMatchesIsPresent();
        mainPage.PopUpTabMatchesIsVisible();
        mainPage.PopUpCoefeOneArePresent();
        mainPage.PopUpCoefeOneAreVisible();
        mainPage.PopUpCoefeTwoAreVisible();
        mainPage.PopUpCoefTwoArePresent();
        mainPage.PopUpCoefeXArePresent();
        mainPage.PopUpCoefeXAreVisible();
        mainPage.PopUpIconLiveinResultsArePresent();
        mainPage.PopUpIconLiveinResultsAreVisible();
        mainPage.PopUpSearchResultsArePresent();
        mainPage.PopUpSearchResultsAreVisible();
        mainPage.PopUpSearchResultsContentArePresent();
        mainPage.PopUpSearchResultsContentAreVisible();
        mainPage.PopUpValueOfCoefArePresent();
        mainPage.PopUpValueOfCoefAreVisible();
    }

    @Test //Тут тест зафелийтся, так как там нет кэфоф в табе лиги, надо сделать проверку что элементов нет
    public void PopUpTabsHasResults(){
        mainPage.enterRequest("basketball");
        mainPage.clickButtonSearch();
        mainPage.ClickPopUpTabMatches();
        mainPage.PopUpCoefeOneArePresent();
        mainPage.PopUpCoefeOneAreVisible();
        mainPage.PopUpCoefeTwoAreVisible();
        mainPage.PopUpCoefTwoArePresent();
        mainPage.PopUpCoefeXArePresent();
        mainPage.PopUpCoefeXAreVisible();
        mainPage.PopUpIconLiveinResultsArePresent();
        mainPage.PopUpIconLiveinResultsAreVisible();
        mainPage.PopUpSearchResultsArePresent();
        mainPage.PopUpSearchResultsAreVisible();
        mainPage.PopUpSearchResultsContentArePresent();
        mainPage.PopUpSearchResultsContentAreVisible();
        mainPage.PopUpValueOfCoefArePresent();
        mainPage.PopUpValueOfCoefAreVisible();
    }

    @Test
    public void PopUpClickPopUpTabMatches(){
        mainPage.enterRequest("football");
        mainPage.clickButtonSearch();
        mainPage.ClickPopUpTabMatches();
        mainPage.PopUpCheckboxLinesPresent();
        mainPage.PopUpCheckboxLinesIsVisible();
        mainPage.PopUpCheckboxLivesPresent();
        mainPage.PopUpCheckboxLiveIsVisible();
        mainPage.PopUpCheckboxMatchIsPresent();
        mainPage.PopUpCheckboxMatcIsVisible();
        mainPage.PopUpCheckboxNameLiveIsPresent();
        mainPage.PopUpCheckboxNameLiveIsVisible();
        mainPage.PopUpCheckboxNameMatchIsPresent();
        mainPage.PopUpCheckboxNameMatchIsVisible();
        mainPage.PopUpCheckboxNameSportIsPresent();
        mainPage.PopUpCheckboxNameSportIsVisible();
        mainPage.PopUpClearButtonisPresent();
        mainPage.PopUpClearButtonIsVisible();
        mainPage.PopUpCloseButtonisPresent();
        mainPage.PopUpCloseButtonIsVisible();
        mainPage.PopUpMicrophoneButtonIsPresent();
        mainPage.PopUpMicrophoneButtonIsVisible();
        mainPage.PopUpSearcFieldisPresent();
        mainPage.PopUpSearcFieldIsVisible();
        mainPage.PopUpSearchButtonIsPresent();
        mainPage.PopUpSearchButtonIsVisible();
        mainPage.PopUpTabLeaguesIsPresent();
        mainPage.PopUpTabLeaguesIsVisible();
        mainPage.PopUpTabMatchesIsPresent();
        mainPage.PopUpTabMatchesIsVisible();
        mainPage.PopUpIconLiveinResultsArePresent();
        mainPage.PopUpIconLiveinResultsAreVisible();
        mainPage.PopUpSearchResultsArePresent();
        mainPage.PopUpSearchResultsAreVisible();
        mainPage.PopUpSearchResultsContentArePresent();
        mainPage.PopUpSearchResultsContentAreVisible();
    }



    




}

