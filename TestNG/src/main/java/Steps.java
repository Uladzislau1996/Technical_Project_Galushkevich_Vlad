import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class Steps {
    private WebDriver driver;
    private MainPage mainPage;
    private PopUpPage popUpPage;

    public Steps(WebDriver driver){
        this.driver = driver;
    }

    //Метод для проверик появления ПОПАП, после ввода запроса в поле поиска и нажатия на кнопку поиска
    public Steps enterRequsetOnTheSearchFieldTest(String request){
        MainPage mainPage = new MainPage(driver);
        mainPage.enterRequest(request);
        mainPage.clickButtonSearch();
        Steps steps = new Steps(driver);
        steps.getWait();
        PopUpPage popUpPage = new PopUpPage(driver);
        popUpPage.isPopUpVisible();
        return this;
    }

    //Метод для проверики наличия "двух полей поиска" и "двух кнопок поиска" на главной
    public Steps hasSearchFieldsAndButtonsSerachTest(){
        MainPage mainPage = new MainPage(driver);
        mainPage.searchFiealdAreVisible();
        mainPage.searchButtonsAreVisible();
        return this;
    }

    //Метод для проверки, что Попап содержит все элементы, если открыт дефолтный таб "MATCHES"
    public Steps haveAllWebElementsinPopUpTest(){
        Steps steps = new Steps(driver);
        steps.enterRequsetOnTheSearchFieldTest("football");
        PopUpPage popUpPage = new PopUpPage(driver);
        popUpPage.isPopUpVisible();
        popUpPage.isPopUpTitleIsVisible();
        popUpPage.popUpCheckboxLinesIsVisible();
        popUpPage.popUpCheckboxLiveIsVisible();
        popUpPage.popUpCheckboxMatcIsVisible();
        popUpPage.popUpCheckboxNameLiveIsVisible();
        popUpPage.popUpCheckboxNameMatchIsVisible();
        popUpPage.popUpCheckboxNameSportIsVisible();
        popUpPage.popUpClearButtonIsVisible();
        popUpPage.popUpCloseButtonIsVisible();
        popUpPage.popUpMicrophoneButtonIsVisible();
        popUpPage.popUpSearcFieldIsVisible();
        popUpPage.popUpSearchButtonIsVisible();
        popUpPage.popUpTabLeaguesIsVisible();
        popUpPage.popUpTabMatchesIsVisible();
        popUpPage.popUpCoefeOneAreVisible();
        popUpPage.popUpCoefeTwoAreVisible();
        popUpPage.popUpCoefeXAreVisible();
        popUpPage.popUpIconLiveinResultsAreVisible();
        popUpPage.popUpSearchResultsAreVisible();
        popUpPage.popUpSearchResultsContentAreVisible();
        popUpPage.popUpValueOfCoefAreVisible();
        return this;
    }

    ////Метод для проверки, что Попап содержит все элементы, если открыт дефолтный таб "MATCHES"
    public Steps hasAllWebElementsInPopUpTabLegauesTest(){
        Steps steps = new Steps(driver);
        steps.enterRequsetOnTheSearchFieldTest("football");
        steps.getWait();
        PopUpPage popUpPage = new PopUpPage(driver);
        popUpPage.clickPopUpTabLegues();
        popUpPage.isPopUpVisible();
        popUpPage.isPopUpTitleIsVisible();
        popUpPage.popUpCheckboxLinesIsVisible();
        popUpPage.popUpCheckboxLiveIsVisible();
        popUpPage.popUpCheckboxMatcIsVisible();
        popUpPage.popUpCheckboxNameLiveIsVisible();
        popUpPage.popUpCheckboxNameMatchIsVisible();
        popUpPage.popUpCheckboxNameSportIsVisible();
        popUpPage.popUpClearButtonIsVisible();
        popUpPage.popUpCloseButtonIsVisible();
        popUpPage.popUpMicrophoneButtonIsVisible();
        popUpPage.popUpSearcFieldIsVisible();
        popUpPage.popUpSearchButtonIsVisible();
        popUpPage.popUpTabLeaguesIsVisible();
        popUpPage.popUpTabMatchesIsVisible();
        popUpPage.popUpIconLiveinResultsAreVisible();
        popUpPage.popUpSearchResultsAreVisible();
        popUpPage.popUpSearchResultsContentAreVisible();
        return this;
    }

    ////Метод для проверки, что Попап содержит все элементы, НО НЕ СОДЕРЖИТ ИКОНКИ КЭФОФ, если открыт дефолтный таб "Legaues"
    public Steps notHaveIconsofCoefinPopUpLegauesTest(){
        Steps steps = new Steps(driver);
        steps.hasAllWebElementsInPopUpTabLegauesTest();
        PopUpPage popUpPage = new PopUpPage(driver);
        popUpPage.popUpCoefeOneAreVisible();
        popUpPage.popUpCoefeTwoAreVisible();
        popUpPage.popUpCoefeXAreVisible();
        popUpPage.popUpValueOfCoefAreVisible();
        return this;
    }

    //Метод для проверки что каунтер соответсвую количесвту элементов в результате поиска, данные выводяться в консоль
    public Steps checkPopUpCaunterTest(){
        Steps steps = new Steps(driver);
        steps.enterRequsetOnTheSearchFieldTest("football");
        steps.getWait();
        steps.checkCaunterOfSearchResults();
        return this;
    }

    //"Проверяю, что в резултатах по запросу есть совпадение в тексте ТАБ MATCHES>блоке LEGUES")
    public Steps checkPopUpResultsInTeamsTest(){
        Steps steps = new Steps(driver);
        steps.checkPopUpCaunterTest();
        steps.checkValueofResults("football");
        return this;
    }

    //"Проверяю, что в резултатах по запросу есть совпадение в тексте ТАБ MATCHES > блок TEAMS"
    public Steps checkPopUpResultsInLeagueTest(){
        Steps steps = new Steps(driver);
        steps.enterRequsetOnTheSearchFieldTest("arsenal");
        steps.checkValueofResults("arsenal");
        return this;
    }

    //"Проверяю, что в резултатах по запросу есть совпадение в тексте в ТАБ Legues>блоке LAGUES")
    public Steps checkPopUpResultsInLeguesTest(){
        Steps steps = new Steps(driver);
        steps.enterRequsetOnTheSearchFieldTest("Basketball");
        PopUpPage popUpPage = new PopUpPage(driver);
        popUpPage.clickPopUpTabLegues();
        steps.getWait();
        steps.checkValueofResultsInLegaues("basketball");
        return this;
    }

    //"Проверяю, что отображается заглушка если нет результатов в табе LEGUES/MATCHES" и каунтер равено нулю)
    public Steps checkTextStubTest(){
        Steps steps = new Steps(driver);
        steps.enterRequsetOnTheSearchFieldTest("Test123QA");
        steps.getWait();
        steps.checkCaunterOfSearchResultsWithInCorrectRequest();
        PopUpPage popUpPage = new PopUpPage(driver);
        popUpPage.checkNoSurchResultsTextisVisible();
        popUpPage.clickPopUpTabLegues();
        popUpPage.checkNoSurchResultsTextisVisible();
        steps.checkCaunterOfSearchResultsWithInCorrectRequest();
        return this;
    }

    //"Проверяю, что при включенном чекбоксе 'Live' всегда отображается ячейка 'Live' напротив результатов")
    public Steps checkLiveIconTest(){
        Steps steps = new Steps(driver);
        steps.enterRequsetOnTheSearchFieldTest("Football");
        steps.getWait();
        PopUpPage popUpPage = new PopUpPage(driver);
        popUpPage.popUpIconLiveinResultsAreVisible();
        popUpPage.clickPopUpTabLegues();
        steps.getWait();
        popUpPage.popUpIconLiveinResultsAreVisible();
        return this;
    }

    //"Проверяю, что подтягиваются результаты поиска если включенны все чекбоксы 'Live/Sports/Exact match'
    // всегда отображается ячейка напротив результатов в табах MATCHES/LEGUES
    public Steps checkResultsWithAllCheckBoxesTest(){
        Steps steps = new Steps(driver);
        steps.enterRequsetOnTheSearchFieldTest("Football");
        PopUpPage popUpPage = new PopUpPage(driver);
        popUpPage.clickCheckBoxExactMatch();
        steps.checkValueofResults("footbal");
        popUpPage.popUpIconLiveinResultsAreVisible();
        popUpPage.clickPopUpTabLegues();
        steps.checkValueofResultsInLegaues("footbal");
        popUpPage.popUpIconLiveinResultsAreVisible();
        return this;
    }

    //"Проверяю, что подтягиваются результаты поиска если включенны все чекбоксы 'Sports/Exact' в табах MATCHES/LEGUES
    public Steps checkResultsWithSportandExactCheckBoxesTest(){
        Steps steps = new Steps(driver);
        steps.enterRequsetOnTheSearchFieldTest("Football");
        PopUpPage popUpPage = new PopUpPage(driver);
        popUpPage.clickOnCheckBoxLive();
        popUpPage.clickCheckBoxExactMatch();
        steps.getWait();
        steps.checkCaunterOfSearchResults();
        steps.checkValueofResults("football");
        popUpPage.clickPopUpTabLegues();
        steps.getWait();
        steps.checkCaunterOfSearchResults();
        steps.checkValueofResultsInLegaues("footbal");
        return this;
    }

    //"Проверяю, работу кнопки удалить текст в табе MATCHES"
    public Steps checkDeleteRequestButtonTest(){
        Steps steps = new Steps(driver);
        steps.enterRequsetOnTheSearchFieldTest("Football");
        PopUpPage popUpPage = new PopUpPage(driver);
        steps.getWait();
        popUpPage.clickOnPopUpClearButton();
        popUpPage.clickOnPopUpSearchButton();
        steps.getWait();
        steps.checkCaunterOfSearchResultsWithInCorrectRequest();
        popUpPage.checkNoSurchResultsTextisVisible();
        popUpPage.clickPopUpTabLegues();
        steps.getWait();
        steps.checkCaunterOfSearchResultsWithInCorrectRequest();
        popUpPage.checkNoSurchResultsTextisVisible();
        return this;
    }

    //"Проверяю, работу кнопки удалить текст в табе LEGAUES"
    public Steps checkDeleteRequestButtonLegauesTest(){
        Steps steps = new Steps(driver);
        steps.enterRequsetOnTheSearchFieldTest("Football");
        PopUpPage popUpPage = new PopUpPage(driver);
        steps.getWait();
        popUpPage.clickPopUpTabLegues();
        popUpPage.clickOnPopUpClearButton();
        popUpPage.clickOnPopUpSearchButton();
        steps.getWait();
        steps.checkCaunterOfSearchResultsWithInCorrectRequest();
        popUpPage.checkNoSurchResultsTextisVisible();
        return this;
    }

    //"Проверяю, работу кнопки поиска в PopUp в табе LEGAUES"
    public Steps checkPopUpSearcButtonTest(){
        Steps steps = new Steps(driver);
        steps.enterRequsetOnTheSearchFieldTest("Football");
        PopUpPage popUpPage = new PopUpPage(driver);
        steps.getWait();
        popUpPage.clickOnPopUpClearButton();
        steps.getWait();
        popUpPage.ClickOnPopUpSearchField();
        steps.fillPopUpSearcField("Basketball");
        popUpPage.clickOnPopUpSearchButton();
        steps.getWait();
        steps.checkCaunterOfSearchResults();
        steps.checkValueofResults("basketball");
        steps.getWait();
        popUpPage.clickOnPopUpClearButton();
        steps.fillPopUpSearcField("Baseball");
        popUpPage.clickOnPopUpSearchButton();
        steps.getWait();
        steps.checkCaunterOfSearchResults();
        steps.checkValueofResults("baseball");
        return this;
    }

    ////"Проверяю, работу кнопки удалить текст в табе LEGAUES")
    public Steps checkPopUpSearcButtonDeleteLegauesTest(){
        Steps steps = new Steps(driver);
        steps.enterRequsetOnTheSearchFieldTest("Football");
        PopUpPage popUpPage = new PopUpPage(driver);
        popUpPage.clickPopUpTabLegues();
        popUpPage.clickOnPopUpClearButton();
        steps.getWait();
        popUpPage.ClickOnPopUpSearchField();
        steps.fillPopUpSearcField("Basketball");
        popUpPage.clickOnPopUpSearchButton();
        steps.getWait();
        steps.checkCaunterOfSearchResults();
        steps.checkValueofResultsInLegaues("basketball");
        popUpPage.clickOnPopUpClearButton();
        steps.getWait();
        popUpPage.ClickOnPopUpSearchField();
        steps.fillPopUpSearcField("Baseball");
        popUpPage.clickOnPopUpSearchButton();
        steps.getWait();
        steps.checkCaunterOfSearchResults();
        steps.checkValueofResultsInLegaues("baseball");
        return this;
    }

    //Метод проверки, что текст результата поиска кликабелен и ведет на соответсвующую страницу в табе MATCHES")
    public Steps checkTextOfSearchResultsHasCorrectLink(){
        Steps steps = new Steps(driver);
        steps.enterRequsetOnTheSearchFieldTest("Football");
        steps.checkTextofSearchResultHasCorrectLink();
        return this;
    }

    //"Проверить, что коэфе кликабельны)
    public Steps checkCoefOfSearchResultsisClickable(){
        Steps steps = new Steps(driver);
        steps.enterRequsetOnTheSearchFieldTest("Football");
        steps.checkIconsOfCoefisClickable();
        return this;
    }

    public Steps checkMicrophoneButton(){
        PopUpPage popUpPage = new PopUpPage(driver);
        Steps steps = new Steps(driver);
        steps.enterRequsetOnTheSearchFieldTest("Football");
        steps.clickOnPopUpMicrophoneButton();
        steps.alertDismiss();
        return this;
    }

    //Вся логика в степах

    public Steps checkCaunterOfSearchResults(){
        PopUpPage popUpPage = new PopUpPage(driver);
        int SumofResult = driver.findElements(popUpPage.searchResults).size();
        String Caunter = driver.findElement(popUpPage.popUpCaunetr).getText();
        int ResultsSum = Integer.valueOf(Caunter);
        System.out.println(SumofResult);
        System.out.println(ResultsSum);
        Asserts.check(SumofResult == ResultsSum, "incorrect results");
        return this;
    }

    public Steps checkValueofResults(String requset){
        PopUpPage popUpPage = new PopUpPage(driver);
        Asserts.check(driver.findElement(popUpPage.searchResultsContentLeague).getText().toLowerCase()
                        .contains(requset)|
                driver.findElement(popUpPage.searchResultsContentTeams).getText().toLowerCase().contains(requset),
                "incorrect results");
        return this;
    }

    public Steps checkValueofResultsInLegaues(String requset){
        PopUpPage popUpPage = new PopUpPage(driver);
        Asserts.check(driver.findElement(popUpPage.searchResultsContentLeague).getText().toLowerCase().contains(requset),
                "incorrect results");
        return this;
    }

    public Steps checkCaunterOfSearchResultsWithInCorrectRequest(){
        PopUpPage popUpPage = new PopUpPage(driver);
        String Caunter = driver.findElement(popUpPage.popUpCaunetr).getText();
        int ResultsSum = Integer.valueOf(Caunter);
        int DefaultCaunter = 0;
        System.out.println(ResultsSum);
        Asserts.check(DefaultCaunter==ResultsSum, "incorrect caunter");
        return this;
    }

    public Steps getWait(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public Steps fillPopUpSearcField(String request){
        PopUpPage popUpPage = new PopUpPage(driver);
        driver.findElement(popUpPage.popUpSearchField).sendKeys(request);
        return this;
    }

    public Steps checkTextofSearchResultHasCorrectLink(){
        PopUpPage popUpPage = new PopUpPage(driver);
        List<WebElement> Testresults = driver.findElements(popUpPage.popUpSearchResultsText);
        List<WebElement> TextResults = driver.findElements(popUpPage.searchResultsContentTeams);
        double indexOfElement = Math.random() * (Testresults.size() - 1); //(Testresults.size() - 1);
        int indexOfRandomElement = (int) indexOfElement;
        //String TextOfSearchResults = Testresults.get(indexOfRandomElement).getText().toLowerCase();
        String string = TextResults.get(indexOfRandomElement).getText().toLowerCase().
                replaceAll("\\s","");
        String TextofCheckResuts = string.replaceAll("-","").substring(0, 4);;
        String CheckLinkofTextResults = Testresults.get(indexOfRandomElement).getAttribute("href")
                .toLowerCase().replaceAll("-","");
        Testresults.get(indexOfRandomElement).click();
        //System.out.println(TextOfSearchResults);
        System.out.println(CheckLinkofTextResults);
        System.out.println(TextofCheckResuts);
        Asserts.check((CheckLinkofTextResults.contains(TextofCheckResuts)), "incorrect results");
        return this;
    }

    public Steps checkIconsOfCoefisClickable(){
        PopUpPage popUpPage = new PopUpPage(driver);
        List<WebElement> CoefIcons = driver.findElements(popUpPage.coefIcon);
        double index = Math.random() * (CoefIcons.size()-1);
        int indexOfRandomElement = (int) index;
        String TextOfCoefIcons = CoefIcons.get(indexOfRandomElement).getText().toLowerCase();
        char c = TextOfCoefIcons.charAt(0);
        String Text = String.valueOf(c);
        CoefIcons.get(indexOfRandomElement).click();
        String CheckCoefIcons = driver.findElement(popUpPage.coefIconCheck).getText().toLowerCase();
        System.out.println(Text);
        System.out.println(CheckCoefIcons);
        Asserts.check(CheckCoefIcons.contains(Text), "incorrect results");
        return this;
    }

    public Steps clickOnPopUpMicrophoneButton(){
        PopUpPage popUpPage = new PopUpPage(driver);
        driver.findElement(popUpPage.popUpMicrophoneButton).click();
        return this;
    }

    public Steps  alertDismiss(){
        driver.switchTo().alert().dismiss();
        return this;
    }


}
