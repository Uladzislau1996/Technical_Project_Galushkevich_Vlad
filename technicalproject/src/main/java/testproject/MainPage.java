package testproject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import net.jodah.failsafe.internal.util.Assert;

import org.openqa.selenium.JavascriptExecutor;



public class MainPage {
    
    WebDriver driver;

    public MainPage(WebDriver driver){
        this.driver = driver;
    }


    private By SearchFields = By.className("searchInput");
    private By SearchFields1 = By.xpath("//*[@id='sports_main_new']/section[1]/div[1]/div[1]/div/div/input");
    private By SearchFields2 = By.xpath("//*[@id='sports_main_new']/section[2]/div[1]/div[1]/div/div/input");
    private By SearchButtons = By.className("b-filters__searchBut");
    private By SearchButtons1 = By.xpath("//*[@id='sports_main_new']/section[1]/div[1]/div[1]/div/div/button");
    private By SearchButtons2 = By.xpath("//*[@id='sports_main_new']/section[2]/div[1]/div[1]/div/div/button");
    private By PopUpSearch = By.className("v-modal-search");
    private By PopUpTitle = By.className("search-popup__title");
    private By PopUpCaunetr= By.className("search-popup__text");
    private By PopUpSearchField = By.id("search-in-popup");
    private By PopUpTabMatches = By.cssSelector(".search-popup-tabs__header>button");
    private By PopUpTabLeagues = By.cssSelector(".search-popup-tabs__header>button+button");
    private By PopUpSearchButton = By.className("search-popup__button");
    private By PopUpClose = By.className("search-popup__close");
    private By PopUpClear = By.className("search-popup__clear");
    private By PopUpCheckBoxLive = By.id("liveFilter");
    private By PopUpCheckBoxLine = By.id("lineFilter");
    private By PopUpCheckBoxExactMatch = By.id("accurateFilter");
    private By PopUpCheckBoxNameLive = By.xpath("//*[@for='liveFilter']");
    private By PopUpCheckBoxNameSport = By.xpath("//*[@for='lineFilter']");
    private By PopUpCheckBoxNameExactMatch = By.xpath("//*[@for='accurateFilter']");
    private By SearchResults = By.className("search-popup-events__item");
    private By SearchResultsContent = By.className("search-popup-event__content");
    private By IconLiveinResults = By.className("search-popup-event__live");
    private By SearchResultsHeaders = By.className("search-popup-event__header");
    private By SearchResultsContentLeague = By.className("search-popup-event__league");
    private By SearchResultsContentTeams = By.className("search-popup-event__teams");
    private By CoefeOne = By.xpath("//*[@class='search-popup-coef']/div[normalize-space(text())='1']");
    private By CoefeX = By.xpath("//*[@class='search-popup-coef']/div[normalize-space(text())='X']");
    private By CoefeTwo = By.xpath("//*[@class='search-popup-coef']/div[normalize-space(text())='2']");
    private By ValueOfCoef = By.className("search-popup-coef__value");
    private By PopUpMicrophoneButton = By.className("fa-microphone");
    private By MicrophoneAlertIcon = By.cssSelector(".swal2-popup>.swal2-header");
    private By MicrophoneAlertContent = By.cssSelector("..swal2-popup>.swal2-content");
    private By MicrophoneAlertButton = By.cssSelector(".swal2-popup>.swal2-actions>.swal2-confirm");


    

    public MainPage enterRequest(String email){
        driver.findElement(SearchFields1).sendKeys(email);
        return this;
    }

    public MainPage clickButtonSearch(){
       driver.findElement(SearchButtons1).click();
       return this;
    }


    //CheckThatWebElemen

    public MainPage PopUpIsVisible(){
        driver.findElement(PopUpSearch).isDisplayed();
        return this;
    }

    public boolean isPopUpPresent() {
        try {
            driver.findElement(PopUpSearch);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }


    public boolean isPopUpVisible(){
        return driver.findElement(PopUpSearch).isDisplayed();
    }

    public boolean SearcFieldsArePresent(){
        try {
            driver.findElements(SearchFields);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean SearchButtons2IsVisible(){
        return driver.findElement(SearchButtons2).isDisplayed();
    }

    public boolean SearchButtons2IsPresent(){
        try {
            driver.findElements(SearchButtons2);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean SearchFields2IsVisible(){
        return driver.findElement(SearchFields2).isDisplayed();
    }

    public boolean SearchFields2IsPresent(){
        try {
            driver.findElements(SearchFields2);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean SearchFiealdAreVisible(){
        return driver.findElement(SearchFields).isDisplayed();
    }
    

    public boolean SearchButtonsArePresent(){
        try {
            driver.findElement(SearchButtons);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean SearchButtonsAreVisible(){
            return driver.findElement(SearchButtons).isDisplayed();
    }

    public boolean IsPopUpTitleIsPresent() {
        try {
            driver.findElement(PopUpTitle);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean isPopUpTitleIsVisible(){
        return driver.findElement(PopUpTitle).isDisplayed();
    }

    public boolean PopUpSearcFieldisPresent() {
        try {
            driver.findElement(PopUpSearchField);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean PopUpSearcFieldIsVisible(){
        return driver.findElement(PopUpSearchField).isDisplayed();
    }

    public boolean PopUpTabMatchesIsPresent() {
        try {
            driver.findElement(PopUpTabMatches);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean PopUpTabMatchesIsVisible(){
        return driver.findElement(PopUpTabMatches).isDisplayed();
    }

    public boolean PopUpTabLeaguesIsPresent() {
        try {
            driver.findElement(PopUpTabLeagues);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean PopUpTabLeaguesIsVisible(){
        return driver.findElement(PopUpTabLeagues).isDisplayed();
    }


    public boolean PopUpSearchButtonIsPresent(){
        try {
            driver.findElement(PopUpSearchButton);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean PopUpSearchButtonIsVisible(){
        return driver.findElement(PopUpSearchButton).isDisplayed();
    }

    public boolean PopUpCloseButtonisPresent(){
        try {
            driver.findElement(PopUpClose);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean PopUpCloseButtonIsVisible(){
        return driver.findElement(PopUpClose).isDisplayed();
    }

    public boolean PopUpClearButtonisPresent(){
        try {
            driver.findElement(PopUpClear);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean PopUpClearButtonIsVisible(){
        return driver.findElement(PopUpClear).isDisplayed();
    }

    public boolean PopUpCheckboxLivesPresent(){
        try {
            driver.findElement(PopUpCheckBoxLive);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean PopUpCheckboxLiveIsVisible(){
        return driver.findElement(PopUpCheckBoxLive).isDisplayed();
    }

    public boolean PopUpCheckboxLinesPresent(){
        try {
            driver.findElement(PopUpCheckBoxLine);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean PopUpCheckboxLinesIsVisible(){
        return driver.findElement(PopUpCheckBoxLine).isDisplayed();
    }

    public boolean PopUpCheckboxMatchIsPresent(){
        try {
            driver.findElement(PopUpCheckBoxExactMatch);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean PopUpCheckboxMatcIsVisible(){
        return driver.findElement(PopUpCheckBoxExactMatch).isDisplayed();
    }

    public boolean PopUpCheckboxNameLiveIsPresent(){
        try {
            driver.findElement(PopUpCheckBoxNameLive);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean PopUpCheckboxNameLiveIsVisible(){
        return driver.findElement(PopUpCheckBoxNameLive).isDisplayed();
    }

    public boolean PopUpCheckboxNameSportIsPresent(){
        try {
            driver.findElement(PopUpCheckBoxNameSport);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean PopUpCheckboxNameSportIsVisible(){
        return driver.findElement(PopUpCheckBoxNameSport).isDisplayed();
    }

    public boolean PopUpCheckboxNameMatchIsPresent(){
        try {
            driver.findElement(PopUpCheckBoxNameExactMatch);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean PopUpCheckboxNameMatchIsVisible(){
        return driver.findElement(PopUpCheckBoxNameExactMatch).isDisplayed();
    }

    public boolean PopUpMicrophoneButtonIsPresent(){
        try {
            driver.findElement(PopUpMicrophoneButton);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }  

    public boolean PopUpMicrophoneButtonIsVisible(){
        return driver.findElement(PopUpMicrophoneButton).isDisplayed();
    }

    public MainPage clickPopUpMicrophoneButton(){
        driver.findElement(PopUpMicrophoneButton).click();
         return this;
     }

    public boolean PopUpMicrophoneAlertIconIsPresent(){
        try {
            driver.findElement(MicrophoneAlertIcon);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean PopUpMicrophoneAlertIconIsVisible(){
        return driver.findElement(MicrophoneAlertIcon).isDisplayed();
    }

    public boolean PopUpMicrophoneAlertContentIsPresent(){
        try {
            driver.findElement(MicrophoneAlertContent);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean PopUpMicrophoneAlertContentIsVisible(){
        return driver.findElement(MicrophoneAlertContent).isDisplayed();
    }

    public boolean PopUpMicrophoneAlertButtomIsPresent(){
        try {
            driver.findElement(MicrophoneAlertButton);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean PopUpMicrophoneAlertButtonIsVisible(){
        return driver.findElement(MicrophoneAlertButton).isDisplayed();
    }

    public boolean PopUpSearchResultsArePresent(){
        try {
            driver.findElement(SearchResults);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean PopUpSearchResultsAreVisible(){
        return driver.findElement(SearchResults).isDisplayed();
    }

    public boolean PopUpSearchResultsContentArePresent(){
        try {
            driver.findElement(SearchResultsContent);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean PopUpSearchResultsContentAreVisible(){
        return driver.findElement(SearchResultsContent).isDisplayed();
    }

    public boolean PopUpIconLiveinResultsArePresent(){
        try {
            driver.findElement(IconLiveinResults);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean PopUpIconLiveinResultsAreVisible(){
        return driver.findElement(IconLiveinResults).isDisplayed();
    }

    public boolean PopUpSearchResultsHeadersArePresent(){
        try {
            driver.findElement(SearchResultsHeaders);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean PopUpSearchResultsHeadersAreVisible(){
        return driver.findElement(SearchResultsHeaders).isDisplayed();
    }

    public boolean PopUpSearchResultsContentLeagueArePresent(){
        try {
            driver.findElement(SearchResultsContentLeague);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean PopUpSearchResultsContentLeagueAreVisible(){
        return driver.findElement(SearchResultsHeaders).isDisplayed();
    }

    public boolean PopUpSearchResultsContentTeamsArePresent(){
        try {
            driver.findElement(SearchResultsContentTeams);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean PopUpSearchResultsContentTeamsAreVisible(){
        return driver.findElement(SearchResultsContentTeams).isDisplayed();
    }

    public boolean PopUpCoefeOneArePresent(){
        try {
            driver.findElement(CoefeOne);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean PopUpCoefeOneAreVisible(){
        return driver.findElement(CoefeOne).isDisplayed();
    }

    public boolean PopUpCoefeXArePresent(){
        try {
            driver.findElement(CoefeX);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean PopUpCoefeXAreVisible(){
        return driver.findElement(CoefeX).isDisplayed();
    }

    public boolean PopUpCoefTwoArePresent(){
        try {
            driver.findElement(CoefeTwo);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean PopUpCoefeTwoAreVisible(){
        return driver.findElement(CoefeTwo).isDisplayed();
    }

    public boolean PopUpValueOfCoefArePresent(){
        try {
            driver.findElement(ValueOfCoef);
            return true;
        } catch (org.openqa.selenium.NoSuchElementException e) {
            return false;
        }
    }

    public boolean PopUpValueOfCoefAreVisible(){
        return driver.findElement(ValueOfCoef).isDisplayed();
    }


    //ClickonTheWebElement

    public MainPage ClickPopUpTabMatches(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement button = driver.findElement(By.cssSelector(".search-popup-tabs__header>button+button"));
        js.executeScript("arguments[0].click();", button);
        return this;
     }

     public MainPage ClickPopUpTabLeagues(){
        driver.findElement(PopUpTabLeagues).click();
        return this;
     }

     public MainPage ClickOnCheckBoxLive(){
        driver.findElement(PopUpCheckBoxLive).click();
        return this;
     }

     public MainPage ClickOnCheckBoxLine(){
        driver.findElement(PopUpCheckBoxLine).click();
        return this;
     }

     public MainPage ClickCheckBoxExactMatch(){
        driver.findElement(PopUpCheckBoxExactMatch).click();
        return this;
     }

     public MainPage ClickOnPopUpClear(){
        driver.findElement(PopUpClear).click();
        return this;
     }

     public MainPage ClickOnPopUpClose(){
        driver.findElement(PopUpClose).click();
        return this;
     }

     //GetSizeResults

     public MainPage CheckCaunterOfSearchResults(){
        int SumofResult = driver.findElements(SearchResults).size();
        String Caunter = driver.findElement(PopUpCaunetr).getText();
        int ResultsSum = Integer.valueOf(Caunter);
        System.out.println(SumofResult);
        System.out.println(ResultsSum);
        Assert.isTrue(SumofResult==ResultsSum, "incorrect results");
        return this;
     }

     public MainPage CheckValueofResults(String requset){
        Assert.isTrue(driver.findElement(SearchResultsContentLeague).getText().toLowerCase().contains(requset)|driver.findElement(SearchResultsContentTeams).getText().toLowerCase().contains(requset), "incorrect results");
        return this;
     }
     
   



      
        

    
    



    








}
