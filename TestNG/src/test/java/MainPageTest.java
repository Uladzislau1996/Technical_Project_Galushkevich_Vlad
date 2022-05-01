
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
    private Steps steps;


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
        Steps steps = new Steps(driver);
        steps.enterRequsetOnTheSearchFieldTest("football");
    }

    @Test (description = "Проверяю, что на странице присутсвуют 2 поля ввода поиска, и 2 кнопки активации поиска")
    public void pageHasSearchFieldsAndButtonsTest(){
        Steps steps = new Steps(driver);
        steps.hasSearchFieldsAndButtonsSerachTest();
    }

    @Test (description = "Проверяю, что Попа, содержит все элементы, если открыт дефолтный таб MATCHES")
    public void popUPHasAllWebElementsTest(){
        Steps steps = new Steps(driver);
        steps.hasSearchFieldsAndButtonsSerachTest();
        steps.haveAllWebElementsinPopUpTest();
    }

    @Test (description = "Проверяю, что Попап, содержит все элементы, если открыт дефолтный таб League")
    public void popUpTabsHasResultsTest(){
        Steps steps = new Steps(driver);
        steps.hasAllWebElementsInPopUpTabLegauesTest();
    }

    @Test (expectedExceptions = org.openqa.selenium.NoSuchElementException.class, description = "Проверяю, что Попап, " +
            "содержит все элементы, если открыт дефолтный таб League. " +
            "Тест спецом фейлиться так как тут есть проверки что, есть кэфы, когда здесь их не должно быть")
    public void popUpTabLegaueaDoesntHaveIconsOfCoefTest(){
        Steps steps = new Steps(driver);
        steps.notHaveIconsofCoefinPopUpLegauesTest();
    }

    @Test (description = "Проверяю, что Каунтер в поп-апе соответсвует, найденному кол-ву результатов")
    public void checkPopUpCaunterTest(){
        Steps steps = new Steps(driver);
        steps.checkPopUpCaunterTest();
    }

    @Test (description = "Проверяю, что в резултатах по запросу есть совпадение в тексте ТАБ MATCHES>блоке LEGAUE")
    public void checkPopUpResultsInTeamsTest(){
        Steps steps = new Steps(driver);
        steps.checkPopUpResultsInTeamsTest();
    }

    @Test (description = "Проверяю, что в резултатах по запросу есть совпадение в тексте в ТАБ MATCHES>блоке TEAMS")
    public void checkPopUpResultsInLeagueTest(){
        Steps steps = new Steps(driver);
        steps.checkPopUpResultsInLeagueTest();
    }

    @Test (description = "Проверяю, что в резултатах по запросу есть совпадение в тексте ТАБ Legaues > блок LAGAUE")
    public void checkPopUpResultsInTeamTabTest(){
        Steps steps = new Steps(driver);
        steps.checkPopUpResultsInLeguesTest();
    }

    @Test (description = "Проверяю, что отображается заглушка если нет результатов в табах" +
            " LEGAUES/MATCHES и каунтер равено нулю")
    public void textStubTestWithInvalidRequestTest(){
        Steps steps = new Steps(driver);
        steps.checkTextStubTest();
    }

    @Test (description = "Проверяю, что при включенном чекбоксе 'Live' всегда отображается ячейка Live" +
            " напротив результатов")
    public void liveIconTest(){
        Steps steps = new Steps(driver);
        steps.checkLiveIconTest();
    }

    @Test (description = "Проверяю, что подтягиваются результаты поиска если включенны все чекбоксы" +
            " 'Live/Sports/Exact match' всегда отображается ячейка напротив результатов")
    public void checkResultsWithAllCheckBoxesTest(){
        Steps steps = new Steps(driver);
        steps.checkResultsWithAllCheckBoxesTest();
    }

    @Test (description = "Проверяю, что подтягиваются результаты поиска если включенны все чекбоксы Sports/Exact match")
    public void checkResultsWithSportandExactmatchCheckBoxesTest(){
        Steps steps = new Steps(driver);
        steps.checkResultsWithAllCheckBoxesTest();
    }

    @Test (description = "Проверяю, что подтягиваются результаты поиска если включенны все чекбоксы " +
            "'Sports/Exact match в табе MATCHES/legaues")
    public void checkResultsWithoutLiveCheckBoxTest(){
        Steps steps = new Steps(driver);
        steps.checkResultsWithSportandExactCheckBoxesTest();
    }

    @Test (description = "Проверяю, работу кнопки удалить текст в поле поиска в табе MATCHES")
    public void checkDeleteRequestButtonTest(){
        Steps steps = new Steps(driver);
        steps.checkDeleteRequestButtonTest();
    }

    @Test (description = "Проверяю, работу кнопки удалить текст в поле поиска в табе LEGAUES")
    public void checkDeleteRequestButtonLegauesTest(){
        Steps steps = new Steps(driver);
        steps.checkDeleteRequestButtonLegauesTest();
    }

    @Test (description = "Проверяю, работу кнопки поиска в PopUp в табе MATCHES")
    public void checkPopUpSearcButtonTest(){
        Steps steps = new Steps(driver);
        steps.checkPopUpSearcButtonTest();
    }

    @Test (description = "Проверяю, работу кнопки поиска в PopUp в табе LEGAUES")
    public void checkPopUpSearcButtonDeleteLegauesTest(){
        Steps steps = new Steps(driver);
        steps.checkPopUpSearcButtonDeleteLegauesTest();
    }

    @Test (description = "Проверить, что текст результата поиска кликабелен и ведет на соответсвующую страницу" +
            " в табе MATCHES")
    public void checkTextOfSearchResultsisClickable(){
        Steps steps = new Steps(driver);
        steps.checkTextOfSearchResultsHasCorrectLink();
    }

    @Test (description = "Проверить, что коэфиценты кликабельны")
    public void testCheckCoefOfSearchResultsisClickable(){
        Steps steps = new Steps(driver);
        steps.checkCoefOfSearchResultsisClickable();
    }


    @Test (expectedExceptions = org.openqa.selenium.NoAlertPresentException.class, description = "Проверить, работу " +
            "кнопки микрофон")
    public void testCheckMicrophoneButton(){
        Steps steps = new Steps(driver);
        steps.checkMicrophoneButton();
    }

}


