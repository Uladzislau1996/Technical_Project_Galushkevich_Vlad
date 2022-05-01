import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class MainPage {
    WebDriver driver;
    public MainPage(WebDriver driver){
        this.driver = driver;
    }

    private By searchFields = By.className("searchInput");
    private By searchFields1 = By.cssSelector(".dashboard>section:first-child>div:first-child>div:first-child>div>div>input");
    private By searchButtons = By.className("b-filters__searchBut");
    private By searchButtons1 = By.xpath("//*[@id='sports_main_new']/section[1]/div[1]/div[1]/div/div/button");

    //Метод для ввода запроса в поле поиска на Главной
    public MainPage enterRequest(String request){
        driver.findElement(searchFields1).sendKeys(request);
        return this;
    }

    //Метод для клика по кнопке поиска на главной
    public MainPage clickButtonSearch(){
        driver.findElement(searchButtons1).click();
        return this;
    }

    //Методы для проверки наличия элементов
    public boolean searchFiealdAreVisible(){
        return driver.findElement(searchFields).isDisplayed();
    }

    public boolean searchButtonsAreVisible(){
        return driver.findElement(searchButtons).isDisplayed();
    }


}
