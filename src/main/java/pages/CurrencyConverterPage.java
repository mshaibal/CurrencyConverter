package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;

public class CurrencyConverterPage extends Page{

    @FindBy(xpath = "//button[@class='privacy-basic-button privacy-basic-button-submit' and @type='submit']")
    private WebElement sayOkToCookie;

    @FindBy(id = "amount")
    private WebElement amount;

    @FindBy(xpath = "//html[1]/body[1]/div[1]/div[2]/div[2]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[1]/div[1]")
    private WebElement fromCurrencyDropdown;

    @FindBy(xpath = "/html[1]/body[1]/div[1]/div[2]/div[2]/main[1]/div[1]/div[2]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/form[1]/div[3]/div[1]/div[1]/div[1]/div[1]")
    private WebElement toCurrencyDropdown;

    @FindBy(xpath = "//button[@aria-label='Convert']")
    private WebElement convertButton;

    @FindBy(css = "#react-select-2-option-0-0 > span > span")
    private WebElement fromCurrencyUSD;

    @FindBy(css = "#react-select-2-option-0-1 > span > span")
    private WebElement fromCurrencyEUR;

    @FindBy(css = "#react-select-2-option-0-2 > span > span")
    private WebElement fromCurrencyGBP;

    @FindBy(css = "#react-select-2-option-0-3 > span > span")
    private WebElement fromCurrencyINR;

    @FindBy(css = "#react-select-2-option-0-4 > span > span")
    private WebElement fromCurrencyAUD;

    @FindBy(css = "#react-select-2-option-0-5 > span > span")
    private WebElement fromCurrencyCAD;

    @FindBy(css = "#react-select-3-option-0-0 > span > span")
    private WebElement toCurrencyUSD;

    @FindBy(css = "#react-select-3-option-0-1 > span > span")
    private WebElement toCurrencyEUR;

    @FindBy(css = "#react-select-3-option-0-2 > span > span")
    private WebElement toCurrencyGBP;

    @FindBy(css = "#react-select-3-option-0-3 > span > span")
    private WebElement toCurrencyINR;

    @FindBy(css = "#react-select-3-option-0-4 > span > span")
    private WebElement toCurrencyAUD;

    @FindBy(css = "#react-select-3-option-0-5 > span > span")
    private WebElement toCurrencyCAD;

    @FindBy(xpath = "//span[@class='converterresult-toAmount']")
    private WebElement conversionAmount;

    @FindBy(xpath = "//span[@class='converterresult-unitConversion sc-bZQynM bnlZsL']")
    private WebElement conversionRate;

    @FindBy(xpath = "//h1[@id='main-heading']")
    private WebElement conversionHeading;


    public void sayOkToCookieMgmt() {
        this.sayOkToCookie.click();
    }

    public void expandFromCurrencyDropdown() {
        this.fromCurrencyDropdown.click();
    }

    public void expandToCurrencyDropdown() {
        this.toCurrencyDropdown.click();
    }

    public void clickCurrecyConvert() {
        this.convertButton.click();
    }

    public void selectFromCurrencyEUR() {
        this.fromCurrencyEUR.click();
    }

    public void selectFromCurrencyUSD() {
        this.fromCurrencyUSD.click();
    }

    public void selectFromCurrencyGBP() {
        this.fromCurrencyGBP.click();
    }

    public void selectFromCurrencyINR() {
        this.fromCurrencyINR.click();
    }

    public void selectFromCurrencyAUD() {
        this.fromCurrencyAUD.click();
    }

    public void selecFromCurrencyCAD() {
        this.fromCurrencyCAD.click();
    }

    public void selectToCurrencyEUR() {
        this.toCurrencyEUR.click();
    }

    public void selectToCurrencyUSD() {
        this.toCurrencyUSD.click();
    }

    public void selectToCurrencyGBP() {
        this.toCurrencyGBP.click();
    }

    public void selectToCurrencyINR() {
        this.toCurrencyINR.click();
    }

    public void selectToCurrencyAUD() {
        this.toCurrencyAUD.click();
    }

    public void selectToCurrencyCAD() {
        this.toCurrencyCAD.click();
    }

    public String conversionAmount() {
        return this.conversionAmount.getText();
    }

    public String conversionRate() {
        return this.conversionRate.getText();
    }

    public String conversionHeading() {
        return this.conversionHeading.getText();
    }

}
