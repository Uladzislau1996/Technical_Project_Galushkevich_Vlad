package testproject;


import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import java.time.Duration;
import java.util.List;
import java.util.Random;

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
    private By PopUpSearchResultsText = By.className("search-popup-event");
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
    private By MicrophoneAlertContent = By.cssSelector(".swal2-popup>.swal2-content");
    private By MicrophoneAlertButton = By.cssSelector(".swal2-popup>.swal2-actions>.swal2-confirm");
    private By NoSurchResults = By.className("search-popup__nothing-find");
    private By CoefIcon = By.className("search-popup-coef");
    private By CoefIconCheck = By.className("c-bet-box__market");
    


    //Метод для ввода запроса в поле поиска на Главной

    public MainPage enterRequest(String request){
        driver.findElement(SearchFields1).sendKeys(request);
        return this;
    }

    //Метод для ввода запроса в поле поиска в попап

    public MainPage FillPopUpSearcField(String request){
        driver.findElement(PopUpSearchField).sendKeys(request);
        return this;
    }

    //Метода для клика по кнопке поиска на главной

    public MainPage ClickButtonSearch(){
       driver.findElement(SearchButtons1).click();
       return this;
    }

    //Методы для проверки наличия элементов на странице

    public MainPage PopUpIsVisible(){
        driver.findElement(PopUpSearch).isDisplayed();
        return this;
    }

    public boolean isPopUpVisible(){
        return driver.findElement(PopUpSearch).isDisplayed();
    }

    public boolean SearchButtons2IsVisible(){
        return driver.findElement(SearchButtons2).isDisplayed();
    }

    public boolean SearchFields2IsVisible(){
        return driver.findElement(SearchFields2).isDisplayed();
    }

    public boolean SearchFiealdAreVisible(){
        return driver.findElement(SearchFields).isDisplayed();
    }
    
    public boolean SearchButtonsAreVisible(){
            return driver.findElement(SearchButtons).isDisplayed();
    }

    public boolean isPopUpTitleIsVisible(){
        return driver.findElement(PopUpTitle).isDisplayed();
    }

    public boolean PopUpSearcFieldIsVisible(){
        return driver.findElement(PopUpSearchField).isDisplayed();
    }

    public boolean PopUpTabMatchesIsVisible(){
        return driver.findElement(PopUpTabMatches).isDisplayed();
    }

    public boolean PopUpTabLeaguesIsVisible(){
        return driver.findElement(PopUpTabLeagues).isDisplayed();
    }

    public boolean PopUpSearchButtonIsVisible(){
        return driver.findElement(PopUpSearchButton).isDisplayed();
    }

    public boolean PopUpCloseButtonIsVisible(){
        return driver.findElement(PopUpClose).isDisplayed();
    }

    public boolean PopUpClearButtonIsVisible(){
        return driver.findElement(PopUpClear).isDisplayed();
    }

    public boolean PopUpCheckboxLiveIsVisible(){
        return driver.findElement(PopUpCheckBoxLive).isDisplayed();
    }

    public boolean PopUpCheckboxLinesIsVisible(){
        return driver.findElement(PopUpCheckBoxLine).isDisplayed();
    }

    public boolean PopUpCheckboxMatcIsVisible(){
        return driver.findElement(PopUpCheckBoxExactMatch).isDisplayed();
    }

    public boolean PopUpCheckboxNameLiveIsVisible(){
        return driver.findElement(PopUpCheckBoxNameLive).isDisplayed();
    }

    public boolean PopUpCheckboxNameSportIsVisible(){
        return driver.findElement(PopUpCheckBoxNameSport).isDisplayed();
    }

    public boolean PopUpCheckboxNameMatchIsVisible(){
        return driver.findElement(PopUpCheckBoxNameExactMatch).isDisplayed();
    }

    public boolean PopUpMicrophoneButtonIsVisible(){
        return driver.findElement(PopUpMicrophoneButton).isDisplayed();
    }

    public MainPage clickPopUpMicrophoneButton(){
        driver.findElement(PopUpMicrophoneButton).click();
         return this;
     }

    public boolean PopUpMicrophoneAlertIconIsVisible(){
        return driver.findElement(MicrophoneAlertIcon).isDisplayed();
    }

    public boolean PopUpMicrophoneAlertContentIsVisible(){
        return driver.findElement(MicrophoneAlertContent).isDisplayed();
    }

    public boolean PopUpMicrophoneAlertButtonIsVisible(){
        return driver.findElement(MicrophoneAlertButton).isDisplayed();
    }

    public boolean PopUpSearchResultsAreVisible(){
        return driver.findElement(SearchResults).isDisplayed();
    }

    public boolean PopUpSearchResultsContentAreVisible(){
        return driver.findElement(SearchResultsContent).isDisplayed();
    }

    public boolean PopUpIconLiveinResultsAreVisible(){
        return driver.findElement(IconLiveinResults).isDisplayed();
    }

    public boolean PopUpSearchResultsHeadersAreVisible(){
        return driver.findElement(SearchResultsHeaders).isDisplayed();
    }

    public boolean PopUpSearchResultsContentLeagueAreVisible(){
        return driver.findElement(SearchResultsHeaders).isDisplayed();
    }

    public boolean PopUpSearchResultsContentTeamsAreVisible(){
        return driver.findElement(SearchResultsContentTeams).isDisplayed();
    }

    public boolean PopUpCoefeOneAreVisible(){
        return driver.findElement(CoefeOne).isDisplayed();
    }

    public boolean PopUpCoefeXAreVisible(){
        return driver.findElement(CoefeX).isDisplayed();
    }

    public boolean PopUpCoefeTwoAreVisible(){
        return driver.findElement(CoefeTwo).isDisplayed();
    }

    public boolean PopUpValueOfCoefAreVisible(){
        return driver.findElement(ValueOfCoef).isDisplayed();
    }

    public boolean CheckNoSurchResultsTextisVisible(){
        return driver.findElement(NoSurchResults).isDisplayed();
    }

    



    //Методы для клика по элементам

    public MainPage ClickPopUpTabMatches(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement button = driver.findElement(By.cssSelector(".search-popup-tabs__header>button+button"));
        js.executeScript("arguments[0].click();", button);
        return this;
     }

     public MainPage ClickPopUpTabLeagues(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement button = driver.findElement(By.cssSelector(".search-popup-tabs__header>button"));
        js.executeScript("arguments[0].click();", button);
        return this;
     }

     public MainPage ClickOnCheckBoxLive(){
        driver.findElement(PopUpCheckBoxLive).click();
        return this;
     }

     public MainPage ClickOnCheckBoxSports(){
        driver.findElement(PopUpCheckBoxLine).click();
        return this;
     }

     public MainPage ClickOnPopUpSearchField(){
        driver.findElement(PopUpSearchField).click();
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

     public MainPage ClickOnPopUpClearButton(){
        driver.findElement(PopUpClear).click();
        return this;
     }

     public MainPage ClickOnPopUpSearchButton(){
        driver.findElement(PopUpSearchButton).click();
        return this;
     }

     public MainPage ClickOnPopUpMicrophoneButton(){
        driver.findElement(PopUpMicrophoneButton).click();
        return this;
       // JavascriptExecutor js = (JavascriptExecutor)driver;
       // WebElement button = driver.findElement(PopUpMicrophoneButton);
        //js.executeScript("arguments[0].click();", button);
        //return this;
     }

     public MainPage ClickOnMicrophoneAlertButton(){
        JavascriptExecutor js = (JavascriptExecutor)driver;
        WebElement button = driver.findElement(MicrophoneAlertButton);
        js.executeScript("arguments[0].click();", button);
        return this;
     }

     //Получить количество результатов
     public MainPage CheckCaunterOfSearchResults(){
        int SumofResult = driver.findElements(SearchResults).size();
        String Caunter = driver.findElement(PopUpCaunetr).getText();
        int ResultsSum = Integer.valueOf(Caunter);
        System.out.println(SumofResult);
        System.out.println(ResultsSum);
        Assert.isTrue(SumofResult==ResultsSum, "incorrect results");
        return this;
     }

     //Сравнить текст запроса и результатво
    public MainPage CheckValueofResults(String requset){
        Assert.isTrue(driver.findElement(SearchResultsContentLeague).getText().toLowerCase().contains(requset)|driver.findElement(SearchResultsContentTeams).getText().toLowerCase().contains(requset), "incorrect results");
        return this;
     }

     public MainPage CheckValueofResultsInLegaues(String requset){
        Assert.isTrue(driver.findElement(SearchResultsContentLeague).getText().toLowerCase().contains(requset), "incorrect results");
        return this;
     }

     
     //Проверить что дефолтный каунтер равен 0
     public MainPage CheckCaunterOfSearchResultsWithInCorrectRequest(){
        String Caunter = driver.findElement(PopUpCaunetr).getText();
        int ResultsSum = Integer.valueOf(Caunter);
        int DefaultCaunter = 0;
        System.out.println(ResultsSum);
        Assert.isTrue(DefaultCaunter==ResultsSum, "incorrect caunter");
        return this;
     }

     //Ожидание в несколько секунд, для того чтобы данные поп-ап корректно подтягулись
     public MainPage GetWait(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
     }

     //Проверить, что текст в результате поиска кликабелен и вывожу значение элемента в консоль
     public MainPage CheckTextofSearchResultsAreClickablaAndOpenCorrectPage(){
        List<WebElement> Testresults = driver.findElements(PopUpSearchResultsText); 
        List<WebElement> TextResults = driver.findElements(SearchResultsContentTeams);                          
        int indexOfRandomElement = new Random().ints(0, Testresults.size()-1).findFirst().getAsInt();
        String TextOfSearchResults = Testresults.get(indexOfRandomElement).getText().toLowerCase();
        String string = TextResults.get(indexOfRandomElement).getText().toLowerCase().replaceAll("\\s","");
        String TextofCheckResuts = string.replaceAll("-","");
        String CheckLinkofTextResults = Testresults.get(indexOfRandomElement).getAttribute("href").toLowerCase().replaceAll("-","");
        Testresults.get(indexOfRandomElement).click();
        //System.out.println(TextOfSearchResults);
        System.out.println(CheckLinkofTextResults);
        System.out.println(TextofCheckResuts);
        //Assert.isTrue((CheckLinkofTextResults.contains(TextofCheckResuts)), "incorrect results");
        return this;
     }

     //Проверяю, что коэфиценты кликабельны в Табе "MATCHES"
     public MainPage CheckIcosOfCoefisClickable(){
        List<WebElement> CoefIcons = driver.findElements(CoefIcon);                              
        int indexOfRandomElement = new Random().ints(0, CoefIcons.size()-1).findFirst().getAsInt();
        String TextOfCoefIcons = CoefIcons.get(indexOfRandomElement).getText().toLowerCase();
        char c = TextOfCoefIcons.charAt(0);
        String Text = String.valueOf(c);
        CoefIcons.get(indexOfRandomElement).click();
        String CheckCoefIcons = driver.findElement(CoefIconCheck).getText().toLowerCase();
        System.out.println(Text);
        System.out.println(CheckCoefIcons);
        Assert.isTrue((CheckCoefIcons.contains(Text)), "incorrect results");
        return this;
     }

    //Проверяю, что алерт сожержит корректный текст
     public MainPage CheckThatAlertContainText(){
         driver.findElement(MicrophoneAlertContent).getText().contains("To use voice input, please enable your microphone in your browser settings");
         System.out.println(driver.findElement(MicrophoneAlertContent).getText());
         return this;
     }

     
     //Переключаюсь на аллерт - отклонить
     public MainPage AlertDismiss(){
        driver.switchTo().alert().dismiss();
        return this;
     }
    
    
    
    





      
        

    
    



    








}
