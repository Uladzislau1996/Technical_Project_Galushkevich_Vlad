
//import org.apache.logging.log4j.core.appender.rolling.action.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.time.Duration;


public class MainPageTest {

    private WebDriver driver;
    private MainPage mainPage;
    private PopUpPage popUpPage;
    private PopUpSteps popUpSteps;


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
    public void enterRequsetOnTheSearchFieldTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.enterRequsetOnTheSearchFieldTest("football");
    }

    @Test (description = "Проверяю, что на странице присутсвуют 2 поля ввода поиска, и 2 кнопки активации поиска")
    public void pageHasSearchFieldsAndButtonsTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.hasSearchFieldsAndButtonsSerachTest();
    }

    @Test (description = "Проверяю, что Попап, содержит все элементы, если открыт дефолтный таб MATCHES")
    public void popUPHasAllWebElementsTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.hasSearchFieldsAndButtonsSerachTest();
        popUpSteps.haveAllWebElementsinPopUpTest();
    }

    @Test (description = "Проверяю, что Попап, содержит все элементы, если открыт дефолтный таб League")
    public void popUpTabsHasResultsTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.hasAllWebElementsInPopUpTabLegauesTest();
    }

    @Test (expectedExceptions = org.openqa.selenium.NoSuchElementException.class, description = "Проверяю, что Попап, " +
            "содержит все элементы, если открыт дефолтный таб League. " +
            "Тест спецом фейлиться так как тут есть проверки что, есть кэфы, когда здесь их не должно быть")
    public void popUpTabLegaueaDoesntHaveIconsOfCoefTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.notHaveIconsofCoefinPopUpLegauesTest();
    }

    @Test (description = "Проверяю, что Каунтер в поп-апе соответсвует, найденному кол-ву результатов")
    public void checkPopUpCaunterTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.checkPopUpCaunterTest();
    }

    @Test (description = "Проверяю, что в резултатах по запросу есть совпадение в тексте ТАБ MATCHES>блоке LEGAUE")
    public void checkPopUpResultsInTeamsTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.checkPopUpResultsInTeamsTest();
    }

    @Test (description = "Проверяю, что в резултатах по запросу есть совпадение в тексте в ТАБ MATCHES>блоке TEAMS")
    public void checkPopUpResultsInLeagueTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.checkPopUpResultsInLeagueTest();
    }

    @Test (description = "Проверяю, что в резултатах по запросу есть совпадение в тексте ТАБ Legaues > блок LAGAUE")
    public void checkPopUpResultsInTeamTabTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.checkPopUpResultsInLeguesTest();
    }

    @Test (description = "Проверяю, что отображается заглушка если нет результатов в табах" +
            " LEGAUES/MATCHES и каунтер равено нулю")
    public void textStubTestWithInvalidRequestTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.checkTextStubTest();
    }

    @Test (description = "Проверяю, что при включенном чекбоксе 'Live' всегда отображается ячейка Live" +
            " напротив результатов")
    public void liveIconTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.checkLiveIconTest();
    }

    @Test (description = "Проверяю, что подтягиваются результаты поиска если включенны все чекбоксы" +
            " 'Live/Sports/Exact match' всегда отображается ячейка напротив результатов")
    public void checkResultsWithAllCheckBoxesTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.checkResultsWithAllCheckBoxesTest();
    }

    @Test (description = "Проверяю, что подтягиваются результаты поиска если включенны все чекбоксы Sports/Exact match")
    public void checkResultsWithSportandExactmatchCheckBoxesTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.checkResultsWithAllCheckBoxesTest();
    }

    @Test (description = "Проверяю, что подтягиваются результаты поиска если включенны все чекбоксы " +
            "'Sports/Exact match в табе MATCHES/legaues")
    public void checkResultsWithoutLiveCheckBoxTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.checkResultsWithSportandExactCheckBoxesTest();
    }

    @Test (description = "Проверяю, работу кнопки удалить текст в поле поиска в табе MATCHES")
    public void checkDeleteRequestButtonTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.checkDeleteRequestButtonTest();
    }

    @Test (description = "Проверяю, работу кнопки удалить текст в поле поиска в табе LEGAUES")
    public void checkDeleteRequestButtonLegauesTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.checkDeleteRequestButtonLegauesTest();
    }

    @Test (description = "Проверяю, работу кнопки поиска в PopUp в табе MATCHES")
    public void checkPopUpSearcButtonTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.checkPopUpSearcButtonTest();
    }

    @Test (description = "Проверяю, работу кнопки поиска в PopUp в табе LEGAUES")
    public void checkPopUpSearcButtonDeleteLegauesTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.checkPopUpSearcButtonDeleteLegauesTest();
    }

    @Test (description = "Проверить, что текст результата поиска кликабелен и ведет на соответсвующую страницу" +
            " в табе MATCHES")
    public void checkTextOfSearchResultsisClickable(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.checkTextOfSearchResultsHasCorrectLink();
    }

    @Test (description = "Проверить, что коэфиценты кликабельны")
    public void testCheckCoefOfSearchResultsisClickable(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.checkCoefOfSearchResultsisClickable();
    }


    @Test (expectedExceptions = org.openqa.selenium.NoAlertPresentException.class, description = "Проверить, работу " +
            "кнопки микрофон")
    public void testCheckMicrophoneButton(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.checkMicrophoneButton();
    }

    //Проверик для хедера
    @Test (description = "Проверить, что есть меню в Хедере")
    public void testHeaderMenuIsVisible(){
        HeaderMenuSteps headermenu = new HeaderMenuSteps(driver);
        headermenu.elementsArePresent();
    }

}


