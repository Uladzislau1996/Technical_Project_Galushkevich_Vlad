import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HeaderMenu {
    WebDriver driver;

    public HeaderMenu(WebDriver driver){
        this.driver = driver;
    }

    private By headerMenu = By.id("headF");
    private By promoButton = By.id("bonus");
    private By sportsButton = By.id("line_href");
    private By liveButton = By.id("live_href");
    private By virtualSportsButton = By.cssSelector("#games_top_menu>ul>li:nth-child(4)");
    private By liveCasinoButton = By.cssSelector("#games_top_menu>ul>li:nth-child(5)");
    private By moreButton = By.cssSelector("#games_top_menu>ul>li:nth-child(6)");

    public boolean headerMenuIsVisible(){
        return driver.findElement(headerMenu).isDisplayed();
    }

    public boolean promoButtonIsVisible(){
        return driver.findElement(promoButton).isDisplayed();
    }

    public boolean sportsButtonIsVisible(){
        return driver.findElement(sportsButton).isDisplayed();
    }

    public boolean liveButtonIsVisible(){
        return driver.findElement(liveButton).isDisplayed();
    }

    public boolean virtualSportsButtonsVisible(){
        return driver.findElement(virtualSportsButton).isDisplayed();
    }

    public boolean liveCasinoButtonIsVisible(){
        return driver.findElement(liveCasinoButton).isDisplayed();
    }

    public boolean moreButtonIsVisible(){
        return driver.findElement(moreButton).isDisplayed();
    }


}


