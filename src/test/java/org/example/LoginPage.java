package org.example;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
        this.driver = driver; }

    @FindBy(xpath = "//*[contains(@id, 'user-name')]")
    private  WebElement loginFld;
    @FindBy(xpath = "//*[contains(@id, 'password')]")
    private  WebElement passwordFld;
    @FindBy(xpath = "//*[contains(@id, 'login-button')]")
    private  WebElement loginBtn;
    public void inputLogin(String login) {
        login = ConfProperties.getProperty("goodlogin");
        WebElement loginfield = loginFld;
        loginfield.sendKeys(login); }

    public void inputPasswd(String password) {
        password = ConfProperties.getProperty("rightpassword");
        WebElement passwordfield = passwordFld;
        passwordfield.sendKeys(password); }

    public void clickLoginBtn() {
        WebElement loginbutton = loginBtn;
        loginbutton.click(); }
}
