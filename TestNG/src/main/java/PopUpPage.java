
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class PopUpPage {

    WebDriver driver;

    public PopUpPage(WebDriver driver){
        this.driver = driver;
    }


    public By popUpSearch = By.className("v-modal-search");
    public By popUpTitle = By.className("search-popup__title");
    public By popUpCaunetr = By.className("search-popup__text");
    public By popUpSearchField = By.id("search-in-popup");
    public By popUpTabMatches = By.cssSelector(".search-popup-tabs__header>button");
    public By popUpTabLeagues = By.cssSelector(".search-popup-tabs__header>button+button");
    public By popUpSearchButton = By.className("search-popup__button");
    public By popUpClose = By.className("search-popup__close");
    public By popUpClear = By.className("search-popup__clear");
    public By popUpCheckBoxLive = By.id("liveFilter");
    public By popUpCheckBoxLine = By.id("lineFilter");
    public By popUpCheckBoxExactMatch = By.id("accurateFilter");
    public By popUpCheckBoxNameLive = By.xpath("//*[@for='liveFilter']");
    public By popUpCheckBoxNameSport = By.xpath("//*[@for='lineFilter']");
    public By popUpCheckBoxNameExactMatch = By.xpath("//*[@for='accurateFilter']");
    public By popUpSearchResultsText = By.className("search-popup-event");
    public By searchResults = By.className("search-popup-events__item");
    public By searchResultsContent = By.className("search-popup-event__content");
    public By iconLiveinResults = By.className("search-popup-event__live");
    public By searchResultsHeaders = By.className("search-popup-event__header");
    public By searchResultsContentLeague = By.className("search-popup-event__league");
    public By searchResultsContentTeams = By.className("search-popup-event__teams");
    public By coefeOne = By.xpath("//*[@class='search-popup-coef']/div[normalize-space(text())='1']");
    public By coefeX = By.xpath("//*[@class='search-popup-coef']/div[normalize-space(text())='X']");
    public By coefeTwo = By.xpath("//*[@class='search-popup-coef']/div[normalize-space(text())='2']");
    public By valueOfCoef = By.className("search-popup-coef__value");
    public By popUpMicrophoneButton = By.className("fa-microphone");
    public By microphoneAlertIcon = By.cssSelector(".swal2-popup>.swal2-header");
    public By microphoneAlertContent = By.cssSelector(".swal2-popup>.swal2-content");
    public By microphoneAlertButton = By.cssSelector(".swal2-popup>.swal2-actions>.swal2-confirm");
    public By noSurchResults = By.className("search-popup__nothing-find");
    public By coefIcon = By.className("search-popup-coef");
    public By coefIconCheck = By.className("c-bet-box__market");


    public PopUpPage popUpIsVisible(){
        driver.findElement(popUpSearch).isDisplayed();
        return this;
    }

    public boolean isPopUpVisible(){
        return driver.findElement(popUpSearch).isDisplayed();
    }

    public boolean isPopUpTitleIsVisible(){
        return driver.findElement(popUpTitle).isDisplayed();
    }

    public boolean popUpSearcFieldIsVisible(){
        return driver.findElement(popUpSearchField).isDisplayed();
    }

    public boolean popUpTabMatchesIsVisible(){
        return driver.findElement(popUpTabMatches).isDisplayed();
    }

    public boolean popUpTabLeaguesIsVisible(){
        return driver.findElement(popUpTabLeagues).isDisplayed();
    }

    public boolean popUpSearchButtonIsVisible(){
        return driver.findElement(popUpSearchButton).isDisplayed();
    }

    public boolean popUpCloseButtonIsVisible(){
        return driver.findElement(popUpClose).isDisplayed();
    }

    public boolean popUpClearButtonIsVisible(){
        return driver.findElement(popUpClear).isDisplayed();
    }

    public boolean popUpCheckboxLiveIsVisible(){
        return driver.findElement(popUpCheckBoxLive).isDisplayed();
    }

    public boolean popUpCheckboxLinesIsVisible(){
        return driver.findElement(popUpCheckBoxLine).isDisplayed();
    }

    public boolean popUpCheckboxMatcIsVisible(){
        return driver.findElement(popUpCheckBoxExactMatch).isDisplayed();
    }

    public boolean popUpCheckboxNameLiveIsVisible(){
        return driver.findElement(popUpCheckBoxNameLive).isDisplayed();
    }

    public boolean popUpCheckboxNameSportIsVisible(){
        return driver.findElement(popUpCheckBoxNameSport).isDisplayed();
    }

    public boolean popUpCheckboxNameMatchIsVisible(){
        return driver.findElement(popUpCheckBoxNameExactMatch).isDisplayed();
    }

    public boolean popUpMicrophoneButtonIsVisible(){
        return driver.findElement(popUpMicrophoneButton).isDisplayed();
    }

    public PopUpPage clickPopUpMicrophoneButton(){
        driver.findElement(popUpMicrophoneButton).click();
        return this;
    }

    public boolean popUpMicrophoneAlertIconIsVisible(){
        return driver.findElement(microphoneAlertIcon).isDisplayed();
    }

    public boolean popUpMicrophoneAlertContentIsVisible(){
        return driver.findElement(microphoneAlertContent).isDisplayed();
    }

    public boolean popUpMicrophoneAlertButtonIsVisible(){
        return driver.findElement(microphoneAlertButton).isDisplayed();
    }

    public boolean popUpSearchResultsAreVisible(){
        return driver.findElement(searchResults).isDisplayed();
    }

    public boolean popUpSearchResultsContentAreVisible(){
        return driver.findElement(searchResultsContent).isDisplayed();
    }

    public boolean popUpIconLiveinResultsAreVisible(){
        return driver.findElement(iconLiveinResults).isDisplayed();
    }

    public boolean popUpCoefeOneAreVisible(){
        return driver.findElement(coefeOne).isDisplayed();
    }

    public boolean popUpCoefeXAreVisible(){
        return driver.findElement(coefeX).isDisplayed();
    }

    public boolean popUpCoefeTwoAreVisible(){
        return driver.findElement(coefeTwo).isDisplayed();
    }

    public boolean popUpValueOfCoefAreVisible(){
        return driver.findElement(valueOfCoef).isDisplayed();
    }

    public boolean checkNoSurchResultsTextisVisible(){
        return driver.findElement(noSurchResults).isDisplayed();
    }


    //Методы для клика по элементам

    public PopUpPage clickPopUpTabLegues(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement button = driver.findElement(By.cssSelector(".search-popup-tabs__header>button+button"));
        js.executeScript("arguments[0].click();", button);
        return this;
    }

    public PopUpPage clickPopUpTabMatches(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement button = driver.findElement(By.cssSelector(".search-popup-tabs__header>button"));
        js.executeScript("arguments[0].click();", button);
        return this;
    }

    public PopUpPage clickOnCheckBoxLive(){
        driver.findElement(popUpCheckBoxLive).click();
        return this;
    }

    public PopUpPage clickOnCheckBoxSports(){
        driver.findElement(popUpCheckBoxLine).click();
        return this;
    }

    public PopUpPage ClickOnPopUpSearchField(){
        driver.findElement(popUpSearchField).click();
        return this;
    }

    public PopUpPage clickCheckBoxExactMatch(){
        driver.findElement(popUpCheckBoxExactMatch).click();
        return this;
    }

    public PopUpPage ClickOnPopUpClose(){
        driver.findElement(popUpClose).click();
        return this;
    }

    public PopUpPage clickOnPopUpClearButton(){
        driver.findElement(popUpClear).click();
        return this;
    }

    public PopUpPage clickOnPopUpSearchButton(){
        driver.findElement(popUpSearchButton).click();
        return this;
    }

}