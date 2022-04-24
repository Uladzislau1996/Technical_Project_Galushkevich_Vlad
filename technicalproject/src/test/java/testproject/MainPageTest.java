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


    @BeforeMethod (description = "Для каждого теста запускаю юраузер и открываю странцу oppabet")
    public void setUp(){
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.oppabet.com/");
        mainPage = new MainPage(driver);
    }

    @AfterMethod (description = "После каждого теста закрываю браузер")
    public void tearDown(){
        driver.quit();
    }

    @Test (description = "Проверяю, что при вводе запроса открывается Попап")       
    public void EnterRequsetOnTheSearchFieldTest(){
        mainPage.enterRequest("footbal");
        mainPage.clickButtonSearch();
        mainPage.isPopUpVisible();
    }
    

    @Test (description = "Проверяю, что на странице присутсвуют 2 поля ввода поиска, и 2 кнопки активации поиска")
    public void PageHasSearchFieldsAndButtonsTest(){
        mainPage.SearchFiealdAreVisible();
        mainPage.SearchButtonsAreVisible();
    }

    @Test (description = "Проверяю, что Попа, содержит все элементы, если открыт дефолтный таб MATCHES")      
    public void PopUPHasAllWebElementsTest(){
        mainPage.enterRequest("football");
        mainPage.clickButtonSearch();
        mainPage.isPopUpVisible();
        mainPage.isPopUpTitleIsVisible();
        mainPage.PopUpCheckboxLinesIsVisible();
        mainPage.PopUpCheckboxLiveIsVisible();
        mainPage.PopUpCheckboxMatcIsVisible();
        mainPage.PopUpCheckboxNameLiveIsVisible();
        mainPage.PopUpCheckboxNameMatchIsVisible();
        mainPage.PopUpCheckboxNameSportIsVisible();
        mainPage.PopUpClearButtonIsVisible();
        mainPage.PopUpCloseButtonIsVisible();
        mainPage.PopUpMicrophoneButtonIsVisible();
        mainPage.PopUpSearcFieldIsVisible();
        mainPage.PopUpSearchButtonIsVisible();
        mainPage.PopUpTabLeaguesIsVisible();
        mainPage.PopUpTabMatchesIsVisible();
        mainPage.PopUpCoefeOneAreVisible();
        mainPage.PopUpCoefeTwoAreVisible();
        mainPage.PopUpCoefeXAreVisible();
        mainPage.PopUpIconLiveinResultsAreVisible();
        mainPage.PopUpSearchResultsAreVisible();
        mainPage.PopUpSearchResultsContentAreVisible();
        mainPage.PopUpValueOfCoefAreVisible();
    }

    @Test (expectedExceptions = org.openqa.selenium.NoSuchElementException.class, description = "Проверяю, что Попа, содержит все элементы, если открыт дефолтный таб League. Тест спецом фейлиться так как тут есть проверки что, есть кэфы, когда здесь их не должно быть")  
    public void PopUpTabsHasResultsTest(){
        mainPage.enterRequest("basketball");
        mainPage.clickButtonSearch();
        mainPage.ClickPopUpTabMatches();
        mainPage.PopUpIconLiveinResultsAreVisible();
        mainPage.PopUpSearchResultsAreVisible();
        mainPage.PopUpSearchResultsContentAreVisible();
        mainPage.PopUpCheckboxLinesIsVisible();
        mainPage.PopUpCheckboxLiveIsVisible();
        mainPage.PopUpCheckboxMatcIsVisible();
        mainPage.PopUpCheckboxNameLiveIsVisible();
        mainPage.PopUpCheckboxNameMatchIsVisible();
        mainPage.PopUpCheckboxNameSportIsVisible();
        mainPage.PopUpClearButtonIsVisible();
        mainPage.PopUpCloseButtonIsVisible();
        mainPage.PopUpMicrophoneButtonIsVisible();
        mainPage.PopUpSearcFieldIsVisible();
        mainPage.PopUpSearchButtonIsVisible();
        mainPage.PopUpTabLeaguesIsVisible();
        mainPage.PopUpTabMatchesIsVisible();
        mainPage.PopUpValueOfCoefAreVisible();
        mainPage.PopUpCoefeOneAreVisible(); 
        mainPage.PopUpCoefeTwoAreVisible();
        mainPage.PopUpCoefeXAreVisible();
    }

    @Test (description = "Проверяю, что Каунтер в поп-апе соответсвует, найденному кол-ву результатов")
    public void CheckPopUpCaunterTest(){
        mainPage.enterRequest("football");
        mainPage.clickButtonSearch();
        mainPage.CheckCaunterOfSearchResults();
    }

    @Test (description = "Проверяю, что в резултатах по запросу есть совпадение в тексте в ТАБ MATCHES>блоке TEAMS")
    public void CheckPopUpResultsInTeamsTest(){
        mainPage.enterRequest("Football");
        mainPage.clickButtonSearch();
        mainPage.CheckCaunterOfSearchResults();
        mainPage.CheckValueofResults("football");
    }

    @Test (description = "Проверяю, что в резултатах по запросу есть совпадение в тексте в ТАБ MATCHES>блоке TEAMS")
    public void CheckPopUpResultsInLeagueTest(){
        mainPage.enterRequest("Arsenal");
        mainPage.clickButtonSearch();
        mainPage.CheckCaunterOfSearchResults();
        mainPage.CheckValueofResults("arsenal");
    }

    @Test (description = "Проверяю, что в резултатах по запросу есть совпадение в тексте в ТАБ Legaues>блоке TEAMS")
    public void CheckPopUpResultsInTeamTabTest(){
        mainPage.enterRequest("Basketball");
        mainPage.clickButtonSearch();
        mainPage.CheckCaunterOfSearchResults();
        mainPage.ClickPopUpTabLeagues();
        mainPage.CheckValueofResults("basketball");
    }

    @Test (description = "Проверяю, что в резултатах по запросу есть совпадение в тексте в ТАБ Legaues>блоке TEAMS")
    public void CheckPopUpResultsInLeagueTabTest(){
        mainPage.enterRequest("League");
        mainPage.clickButtonSearch();
        mainPage.CheckCaunterOfSearchResults();
        mainPage.ClickPopUpTabLeagues();
        mainPage.CheckValueofResults("league");
    }






    




}

