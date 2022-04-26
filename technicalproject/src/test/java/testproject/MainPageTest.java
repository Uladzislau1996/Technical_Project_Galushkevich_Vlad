package testproject;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPageTest {
    
    private WebDriver driver;
    private MainPage mainPage;
    private ChromeOptions options;


    @BeforeMethod (description = "Для каждого теста запускаю юраузер и открываю странцу oppabet")
    public void setUp(){
        options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
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
        mainPage.ClickButtonSearch();
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
        mainPage.ClickButtonSearch();
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
        mainPage.ClickButtonSearch();
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
        mainPage.ClickButtonSearch();
        mainPage.CheckCaunterOfSearchResults();
    }

    @Test (description = "Проверяю, что в резултатах по запросу есть совпадение в тексте в ТАБ MATCHES>блоке LEGAUE")
    public void CheckPopUpResultsInTeamsTest(){
        mainPage.enterRequest("Football");
        mainPage.ClickButtonSearch();
        mainPage.CheckCaunterOfSearchResults();
        mainPage.CheckValueofResults("football");
    }

    @Test (description = "Проверяю, что в резултатах по запросу есть совпадение в тексте в ТАБ MATCHES>блоке TEAMS")
    public void CheckPopUpResultsInLeagueTest(){
        mainPage.enterRequest("Arsenal");
        mainPage.ClickButtonSearch();
        mainPage.CheckCaunterOfSearchResults();
        mainPage.CheckValueofResults("arsenal");
    }

    @Test (description = "Проверяю, что в резултатах по запросу есть совпадение в тексте в ТАБ Legaues>блоке LAGAUE")
    public void CheckPopUpResultsInTeamTabTest(){
        mainPage.enterRequest("Basketball");
        mainPage.ClickButtonSearch();
        mainPage.CheckCaunterOfSearchResults();
        mainPage.ClickPopUpTabLeagues();
        mainPage.CheckValueofResultsInLegaues("basketball");
    }

    @Test (description = "Проверяю, что в резултатах по запросу есть совпадение в тексте в ТАБ Legaues>блоке LAGAUE")
    public void CheckPopUpResultsInLeagueTabTest(){
        mainPage.enterRequest("League");
        mainPage.ClickButtonSearch();
        mainPage.CheckCaunterOfSearchResults();
        mainPage.ClickPopUpTabLeagues();
        mainPage.CheckValueofResultsInLegaues("league");
    }

    @Test (description = "Проверяю, что отображается заглушка если нет результатов в табе LEGAUES/MATCHES")
    public void CheckTextStubTestWithInvalidRequestTest(){
        mainPage.enterRequest("Test123QA");
        mainPage.ClickButtonSearch();
        mainPage.CheckCaunterOfSearchResultsWithInCorrectRequest();
        mainPage.CheckNoSurchResultsTextisVisible();
        mainPage.ClickPopUpTabLeagues();
        mainPage.CheckNoSurchResultsTextisVisible();
        mainPage.CheckCaunterOfSearchResultsWithInCorrectRequest();
    }

    @Test (description = "Проверяю, что при включенном чекбоксе 'Live' всегда отображается ячейка напротив результатов")
    public void LiveCheckBoxTEst(){
        mainPage.enterRequest("Footbal");
        mainPage.ClickButtonSearch();
        mainPage.PopUpIconLiveinResultsAreVisible();
        mainPage.ClickPopUpTabLeagues();
        mainPage.GetWait();
        mainPage.PopUpIconLiveinResultsAreVisible();
    }    

    @Test (description = "Проверяю, что подтягиваются результаты поиска если включенны все чекбоксы 'Live/Sports/Exact match' всегда отображается ячейка напротив результатов")
    public void CheckResultsWithAllCheckBoxesTest(){
        mainPage.enterRequest("Footbal");
        mainPage.ClickButtonSearch();
        mainPage.GetWait();
        mainPage.ClickCheckBoxExactMatch();
        mainPage.CheckCaunterOfSearchResults();
        mainPage.PopUpValueOfCoefAreVisible();
        mainPage.PopUpCoefeOneAreVisible(); 
        mainPage.PopUpCoefeTwoAreVisible();
        mainPage.PopUpCoefeXAreVisible();
        mainPage.CheckValueofResults("football");
        mainPage.ClickPopUpTabLeagues();
        mainPage.GetWait();
        mainPage.CheckCaunterOfSearchResults();
        mainPage.CheckValueofResultsInLegaues("footbal");
    }    

    @Test (description = "Проверяю, что подтягиваются результаты поиска если включенны все чекбоксы 'Sports/Exact match' всегда отображается ячейка напротив результатов")
    public void CheckResultsWithSportandExactmatchCheckBoxesTest(){
        mainPage.enterRequest("Footbal");
        mainPage.ClickButtonSearch();
        mainPage.GetWait();
        mainPage.ClickCheckBoxExactMatch();
        mainPage.ClickOnCheckBoxLive();
        mainPage.GetWait();
        mainPage.CheckCaunterOfSearchResults();
        mainPage.PopUpValueOfCoefAreVisible();
        mainPage.PopUpCoefeOneAreVisible(); 
        mainPage.PopUpCoefeTwoAreVisible();
        mainPage.PopUpCoefeXAreVisible();
        mainPage.CheckValueofResults("football");
        mainPage.ClickPopUpTabLeagues();
        mainPage.GetWait();
        mainPage.CheckCaunterOfSearchResults();
        mainPage.CheckValueofResultsInLegaues("footbal");
        
    } 

    @Test (expectedExceptions = org.openqa.selenium.NoSuchElementException.class, description = "Проверяю, что подтягиваются результаты поиска если включенны все чекбоксы 'Sports/Exact match' и что нет текстовки Live в табе MATCHES")
    public void CheckResultsWithoutLiveCheckBoxTest(){
        mainPage.enterRequest("Footbal");
        mainPage.ClickButtonSearch();
        mainPage.GetWait();
        mainPage.ClickCheckBoxExactMatch();
        mainPage.ClickOnCheckBoxLive();
        mainPage.CheckCaunterOfSearchResults();
        mainPage.PopUpValueOfCoefAreVisible();
        mainPage.PopUpCoefeOneAreVisible(); 
        mainPage.PopUpCoefeTwoAreVisible();
        mainPage.PopUpCoefeXAreVisible();
        mainPage.CheckValueofResults("football");
        mainPage.GetWait();
        mainPage.PopUpIconLiveinResultsAreVisible();
    }

    @Test (expectedExceptions = org.openqa.selenium.NoSuchElementException.class, description = "Проверяю, что подтягиваются результаты поиска если включенны все чекбоксы 'Sports/Exact match' и что нет текстовки Live в табе LEGAUES")
    public void CheckResultsWithoutLiveCheckBoxLegauesTest(){
        mainPage.enterRequest("Footbal");
        mainPage.ClickButtonSearch();
        mainPage.GetWait();
        mainPage.ClickCheckBoxExactMatch();
        mainPage.ClickOnCheckBoxLive();
        mainPage.ClickPopUpTabLeagues();
        mainPage.GetWait();
        mainPage.CheckValueofResults("football");
        mainPage.PopUpIconLiveinResultsAreVisible();
    }

    @Test (description = "Проверяю, работу кнопки удалить текст в табе MATCHES")
    public void CheckDeleteRequestButtonTest(){
        mainPage.enterRequest("Footbal");
        mainPage.ClickButtonSearch();
        mainPage.GetWait();
        mainPage.ClickOnPopUpClearButton();
        mainPage.ClickOnPopUpSearchButton();
        mainPage.GetWait();
        mainPage.CheckCaunterOfSearchResultsWithInCorrectRequest();
        mainPage.CheckNoSurchResultsTextisVisible();
        mainPage.ClickPopUpTabLeagues();
        mainPage.GetWait();
        mainPage.CheckCaunterOfSearchResultsWithInCorrectRequest();
        mainPage.CheckNoSurchResultsTextisVisible();
    }

    @Test (description = "Проверяю, работу кнопки удалить текст в табе LEGAUES")
    public void CheckDeleteRequestButtonLegauesTest(){
        mainPage.enterRequest("Footbal");
        mainPage.ClickButtonSearch();
        mainPage.ClickPopUpTabLeagues();
        mainPage.ClickOnPopUpClearButton();
        mainPage.ClickOnPopUpSearchButton();
        mainPage.GetWait();
        mainPage.CheckCaunterOfSearchResultsWithInCorrectRequest();
        mainPage.CheckNoSurchResultsTextisVisible();
    }

    @Test (description = "Проверяю, работу кнопки поиска в PopUp текст в табе MATCHES")
    public void CheckPopUpSearcButtonTest(){
        mainPage.enterRequest("Footbal");
        mainPage.ClickButtonSearch();
        mainPage.GetWait();
        mainPage.ClickOnPopUpClearButton();
        mainPage.GetWait();
        mainPage.ClickOnPopUpSearchField();
        mainPage.FillPopUpSearcField("Basketball");
        mainPage.ClickOnPopUpSearchButton();
        mainPage.GetWait();
        mainPage.CheckCaunterOfSearchResults();
        mainPage.CheckValueofResults("basketball");
        mainPage.GetWait();
        mainPage.ClickOnPopUpClearButton();
        mainPage.FillPopUpSearcField("Baseball");
        mainPage.ClickOnPopUpSearchButton();
        mainPage.GetWait();
        mainPage.CheckCaunterOfSearchResults();
        mainPage.CheckValueofResults("baseball");
    }

    @Test (description = "Проверяю, работу кнопки удалить текст в табе LEGAUES")
    public void CheckPopUpSearcButtonLegauesTest(){
        mainPage.enterRequest("Footbal");
        mainPage.ClickButtonSearch();
        mainPage.ClickPopUpTabLeagues();
        mainPage.ClickOnPopUpClearButton();
        mainPage.GetWait();
        mainPage.ClickOnPopUpSearchField();
        mainPage.FillPopUpSearcField("Basketball");
        mainPage.ClickOnPopUpSearchButton();
        mainPage.GetWait();
        mainPage.CheckCaunterOfSearchResults();
        mainPage.CheckValueofResultsInLegaues("basketball");
        mainPage.ClickOnPopUpClearButton();
        mainPage.GetWait();
        mainPage.ClickOnPopUpSearchField();
        mainPage.FillPopUpSearcField("Baseball");
        mainPage.ClickOnPopUpSearchButton();
        mainPage.GetWait();
        mainPage.CheckCaunterOfSearchResults();
        mainPage.CheckValueofResultsInLegaues("baseball");
    }

    @Test (description = "Проверить, что текст результата поиска кликабелен и ведет на соответсвующую страницу в табе MATCHES")
    public void CheckTextOfSearchResultsisClickable(){
        mainPage.enterRequest("Footbal");
        mainPage.ClickButtonSearch();
        mainPage.CheckTextofSearchResultsAreClickablaAndOpenCorrectPage();
    }

    @Test (description = "Проверить, что текст результата поиска кликабелен и ведет на соответсвующую страницу в табе MATCHES")
    public void CheckCoefOfSearchResultsisClickable(){
        mainPage.enterRequest("Footbal");
        mainPage.ClickButtonSearch();
        mainPage.CheckIcosOfCoefisClickable();
    }

    @Test (expectedExceptions = org.openqa.selenium.NoAlertPresentException.class, description = "Проверить, работу кнопки микрофон")
    public void CheckMicrophoneButton(){
        mainPage.enterRequest("Footbal");
        mainPage.ClickButtonSearch();
        mainPage.ClickOnPopUpMicrophoneButton();
        mainPage.AlertDismiss();
    }




    




}

