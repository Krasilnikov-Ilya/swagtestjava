package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage {

    public WebDriver driver;

    public MainPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//*[contains(@class, 'title')]")
    private WebElement mainpagetitle;
    public String gettitle() {
        String mainpagetitletext = mainpagetitle.getText();
        return mainpagetitletext; }
}
