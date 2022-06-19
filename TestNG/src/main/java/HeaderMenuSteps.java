import org.openqa.selenium.WebDriver;

public class HeaderMenuSteps {

    private WebDriver driver;
    private MainPage mainPage;
    private HeaderMenu headerMenu;

    public HeaderMenuSteps(WebDriver driver){
        this.driver = driver;
    }

    public HeaderMenuSteps elementsArePresent(){
        HeaderMenu headerMenu = new HeaderMenu(driver);
        headerMenu.headerMenuIsVisible();
        headerMenu.liveButtonIsVisible();
        headerMenu.moreButtonIsVisible();
        headerMenu.liveCasinoButtonIsVisible();
        headerMenu.promoButtonIsVisible();
        headerMenu.sportsButtonIsVisible();
        headerMenu.virtualSportsButtonsVisible();
        return this;
    }

}
