import org.apache.http.util.Asserts;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class
PopUpSteps {
    private WebDriver driver;
    private MainPage mainPage;
    private PopUpPage popUpPage;

    public PopUpSteps(WebDriver driver){
        this.driver = driver;
    }

    //Метод для проверик появления ПОПАП, после ввода запроса в поле поиска и нажатия на кнопку поиска
    public PopUpSteps enterRequsetOnTheSearchFieldTest(String request){
        MainPage mainPage = new MainPage(driver);
        mainPage.enterRequest(request);
        mainPage.clickButtonSearch();
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.getWait();
        PopUpPage popUpPage = new PopUpPage(driver);
        popUpPage.isPopUpVisible();
        return this;
    }

    //Метод для проверики наличия "двух полей поиска" и "двух кнопок поиска" на главной
    public PopUpSteps hasSearchFieldsAndButtonsSerachTest(){
        MainPage mainPage = new MainPage(driver);
        mainPage.searchFiealdAreVisible();
        mainPage.searchButtonsAreVisible();
        return this;
    }

    //Метод для проверки, что Попап содержит все элементы, если открыт дефолтный таб "MATCHES"
    public PopUpSteps haveAllWebElementsinPopUpTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.enterRequsetOnTheSearchFieldTest("football");
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
    public PopUpSteps hasAllWebElementsInPopUpTabLegauesTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.enterRequsetOnTheSearchFieldTest("football");
        popUpSteps.getWait();
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
    public PopUpSteps notHaveIconsofCoefinPopUpLegauesTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.hasAllWebElementsInPopUpTabLegauesTest();
        PopUpPage popUpPage = new PopUpPage(driver);
        popUpPage.popUpCoefeOneAreVisible();
        popUpPage.popUpCoefeTwoAreVisible();
        popUpPage.popUpCoefeXAreVisible();
        popUpPage.popUpValueOfCoefAreVisible();
        return this;
    }

    //Метод для проверки что каунтер соответсвую количесвту элементов в результате поиска, данные выводяться в консоль
    public PopUpSteps checkPopUpCaunterTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.enterRequsetOnTheSearchFieldTest("football");
        popUpSteps.getWait();
        popUpSteps.checkCaunterOfSearchResults();
        return this;
    }

    //"Проверяю, что в резултатах по запросу есть совпадение в тексте ТАБ MATCHES>блоке LEGUES")
    public PopUpSteps checkPopUpResultsInTeamsTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.checkPopUpCaunterTest();
        popUpSteps.checkValueofResults("football");
        return this;
    }

    //"Проверяю, что в резултатах по запросу есть совпадение в тексте ТАБ MATCHES > блок TEAMS"
    public PopUpSteps checkPopUpResultsInLeagueTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.enterRequsetOnTheSearchFieldTest("arsenal");
        popUpSteps.checkValueofResults("arsenal");
        return this;
    }

    //"Проверяю, что в резултатах по запросу есть совпадение в тексте в ТАБ Legues>блоке LAGUES")
    public PopUpSteps checkPopUpResultsInLeguesTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.enterRequsetOnTheSearchFieldTest("Basketball");
        PopUpPage popUpPage = new PopUpPage(driver);
        popUpPage.clickPopUpTabLegues();
        popUpSteps.getWait();
        popUpSteps.checkValueofResultsInLegaues("basketball");
        return this;
    }

    //"Проверяю, что отображается заглушка если нет результатов в табе LEGUES/MATCHES" и каунтер равено нулю)
    public PopUpSteps checkTextStubTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.enterRequsetOnTheSearchFieldTest("Test123QA");
        popUpSteps.getWait();
        popUpSteps.checkCaunterOfSearchResultsWithInCorrectRequest();
        PopUpPage popUpPage = new PopUpPage(driver);
        popUpPage.checkNoSurchResultsTextisVisible();
        popUpPage.clickPopUpTabLegues();
        popUpPage.checkNoSurchResultsTextisVisible();
        popUpSteps.checkCaunterOfSearchResultsWithInCorrectRequest();
        return this;
    }

    //"Проверяю, что при включенном чекбоксе 'Live' всегда отображается ячейка 'Live' напротив результатов")
    public PopUpSteps checkLiveIconTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.enterRequsetOnTheSearchFieldTest("Football");
        popUpSteps.getWait();
        PopUpPage popUpPage = new PopUpPage(driver);
        popUpPage.popUpIconLiveinResultsAreVisible();
        popUpPage.clickPopUpTabLegues();
        popUpSteps.getWait();
        popUpPage.popUpIconLiveinResultsAreVisible();
        return this;
    }

    //"Проверяю, что подтягиваются результаты поиска если включенны все чекбоксы 'Live/Sports/Exact match'
    // всегда отображается ячейка напротив результатов в табах MATCHES/LEGUES
    public PopUpSteps checkResultsWithAllCheckBoxesTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.enterRequsetOnTheSearchFieldTest("Football");
        PopUpPage popUpPage = new PopUpPage(driver);
        popUpPage.clickCheckBoxExactMatch();
        popUpSteps.checkValueofResults("footbal");
        popUpPage.popUpIconLiveinResultsAreVisible();
        popUpPage.clickPopUpTabLegues();
        popUpSteps.checkValueofResultsInLegaues("footbal");
        popUpPage.popUpIconLiveinResultsAreVisible();
        return this;
    }

    //"Проверяю, что подтягиваются результаты поиска если включенны все чекбоксы 'Sports/Exact' в табах MATCHES/LEGUES
    public PopUpSteps checkResultsWithSportandExactCheckBoxesTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.enterRequsetOnTheSearchFieldTest("Football");
        PopUpPage popUpPage = new PopUpPage(driver);
        popUpPage.clickOnCheckBoxLive();
        popUpPage.clickCheckBoxExactMatch();
        popUpSteps.getWait();
        popUpSteps.checkCaunterOfSearchResults();
        popUpSteps.checkValueofResults("football");
        popUpPage.clickPopUpTabLegues();
        popUpSteps.getWait();
        popUpSteps.checkCaunterOfSearchResults();
        popUpSteps.checkValueofResultsInLegaues("footbal");
        return this;
    }

    //"Проверяю, работу кнопки удалить текст в табе MATCHES"
    public PopUpSteps checkDeleteRequestButtonTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.enterRequsetOnTheSearchFieldTest("Football");
        PopUpPage popUpPage = new PopUpPage(driver);
        popUpSteps.getWait();
        popUpPage.clickOnPopUpClearButton();
        popUpPage.clickOnPopUpSearchButton();
        popUpSteps.getWait();
        popUpSteps.checkCaunterOfSearchResultsWithInCorrectRequest();
        popUpPage.checkNoSurchResultsTextisVisible();
        popUpPage.clickPopUpTabLegues();
        popUpSteps.getWait();
        popUpSteps.checkCaunterOfSearchResultsWithInCorrectRequest();
        popUpPage.checkNoSurchResultsTextisVisible();
        return this;
    }

    //"Проверяю, работу кнопки удалить текст в табе LEGAUES"
    public PopUpSteps checkDeleteRequestButtonLegauesTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.enterRequsetOnTheSearchFieldTest("Football");
        PopUpPage popUpPage = new PopUpPage(driver);
        popUpSteps.getWait();
        popUpPage.clickPopUpTabLegues();
        popUpPage.clickOnPopUpClearButton();
        popUpPage.clickOnPopUpSearchButton();
        popUpSteps.getWait();
        popUpSteps.checkCaunterOfSearchResultsWithInCorrectRequest();
        popUpPage.checkNoSurchResultsTextisVisible();
        return this;
    }

    //"Проверяю, работу кнопки поиска в PopUp в табе LEGAUES"
    public PopUpSteps checkPopUpSearcButtonTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.enterRequsetOnTheSearchFieldTest("Football");
        PopUpPage popUpPage = new PopUpPage(driver);
        popUpSteps.getWait();
        popUpPage.clickOnPopUpClearButton();
        popUpSteps.getWait();
        popUpPage.ClickOnPopUpSearchField();
        popUpSteps.fillPopUpSearcField("Basketball");
        popUpPage.clickOnPopUpSearchButton();
        popUpSteps.getWait();
        popUpSteps.checkCaunterOfSearchResults();
        popUpSteps.checkValueofResults("basketball");
        popUpSteps.getWait();
        popUpPage.clickOnPopUpClearButton();
        popUpSteps.fillPopUpSearcField("Baseball");
        popUpPage.clickOnPopUpSearchButton();
        popUpSteps.getWait();
        popUpSteps.checkCaunterOfSearchResults();
        popUpSteps.checkValueofResults("baseball");
        return this;
    }

    ////"Проверяю, работу кнопки удалить текст в табе LEGAUES")
    public PopUpSteps checkPopUpSearcButtonDeleteLegauesTest(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.enterRequsetOnTheSearchFieldTest("Football");
        PopUpPage popUpPage = new PopUpPage(driver);
        popUpPage.clickPopUpTabLegues();
        popUpPage.clickOnPopUpClearButton();
        popUpSteps.getWait();
        popUpPage.ClickOnPopUpSearchField();
        popUpSteps.fillPopUpSearcField("Basketball");
        popUpPage.clickOnPopUpSearchButton();
        popUpSteps.getWait();
        popUpSteps.checkCaunterOfSearchResults();
        popUpSteps.checkValueofResultsInLegaues("basketball");
        popUpPage.clickOnPopUpClearButton();
        popUpSteps.getWait();
        popUpPage.ClickOnPopUpSearchField();
        popUpSteps.fillPopUpSearcField("Baseball");
        popUpPage.clickOnPopUpSearchButton();
        popUpSteps.getWait();
        popUpSteps.checkCaunterOfSearchResults();
        popUpSteps.checkValueofResultsInLegaues("baseball");
        return this;
    }

    //Метод проверки, что текст результата поиска кликабелен и ведет на соответсвующую страницу в табе MATCHES")
    public PopUpSteps checkTextOfSearchResultsHasCorrectLink(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.enterRequsetOnTheSearchFieldTest("Football");
        popUpSteps.checkTextofSearchResultHasCorrectLink();
        return this;
    }

    //"Проверить, что коэфе кликабельны)
    public PopUpSteps checkCoefOfSearchResultsisClickable(){
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.enterRequsetOnTheSearchFieldTest("Football");
        popUpSteps.checkIconsOfCoefisClickable();
        return this;
    }

    public PopUpSteps checkMicrophoneButton(){
        PopUpPage popUpPage = new PopUpPage(driver);
        PopUpSteps popUpSteps = new PopUpSteps(driver);
        popUpSteps.enterRequsetOnTheSearchFieldTest("Football");
        popUpSteps.clickOnPopUpMicrophoneButton();
        popUpSteps.alertDismiss();
        return this;
    }

    //Вся логика в степах

    public PopUpSteps checkCaunterOfSearchResults(){
        PopUpPage popUpPage = new PopUpPage(driver);
        int SumofResult = driver.findElements(popUpPage.searchResults).size();
        String Caunter = driver.findElement(popUpPage.popUpCaunetr).getText();
        int ResultsSum = Integer.valueOf(Caunter);
        System.out.println(SumofResult);
        System.out.println(ResultsSum);
        Asserts.check(SumofResult == ResultsSum, "incorrect results");
        return this;
    }

    public PopUpSteps checkValueofResults(String requset){
        PopUpPage popUpPage = new PopUpPage(driver);
        Asserts.check(driver.findElement(popUpPage.searchResultsContentLeague).getText().toLowerCase()
                        .contains(requset)|
                driver.findElement(popUpPage.searchResultsContentTeams).getText().toLowerCase().contains(requset),
                "incorrect results");
        return this;
    }

    public PopUpSteps checkValueofResultsInLegaues(String requset){
        PopUpPage popUpPage = new PopUpPage(driver);
        Asserts.check(driver.findElement(popUpPage.searchResultsContentLeague).getText().toLowerCase().contains(requset),
                "incorrect results");
        return this;
    }

    public PopUpSteps checkCaunterOfSearchResultsWithInCorrectRequest(){
        PopUpPage popUpPage = new PopUpPage(driver);
        String Caunter = driver.findElement(popUpPage.popUpCaunetr).getText();
        int ResultsSum = Integer.valueOf(Caunter);
        int DefaultCaunter = 0;
        System.out.println(ResultsSum);
        Asserts.check(DefaultCaunter==ResultsSum, "incorrect caunter");
        return this;
    }

    public PopUpSteps getWait(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return this;
    }

    public PopUpSteps fillPopUpSearcField(String request){
        PopUpPage popUpPage = new PopUpPage(driver);
        driver.findElement(popUpPage.popUpSearchField).sendKeys(request);
        return this;
    }

    public PopUpSteps checkTextofSearchResultHasCorrectLink(){
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

    public PopUpSteps checkIconsOfCoefisClickable(){
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

    public PopUpSteps clickOnPopUpMicrophoneButton(){
        PopUpPage popUpPage = new PopUpPage(driver);
        driver.findElement(popUpPage.popUpMicrophoneButton).click();
        return this;
    }

    public PopUpSteps alertDismiss(){
        driver.switchTo().alert().dismiss();
        return this;
    }


}
