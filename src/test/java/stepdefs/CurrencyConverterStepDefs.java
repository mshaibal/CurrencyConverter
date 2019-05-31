package stepdefs;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.junit.Assert;
import pages.CurrencyConverterPage;

public class CurrencyConverterStepDefs {

    CurrencyConverterPage currencyConverterPage;
    private final String URL = "https://www.xe.com/currencyconverter/";

    public CurrencyConverterStepDefs() {
        currencyConverterPage = new CurrencyConverterPage();
    }

    @Given("^user has launched XE Currency Converter website$")
    public void user_has_launched_XE_Currency_Converter_website() {
        currencyConverterPage.launchPage(URL);
        currencyConverterPage.sayOkToCookieMgmt();
    }

    @When("^user selects the From currency as USD$")
    public void user_selects_from_currency_as_USD() {
        currencyConverterPage.expandFromCurrencyDropdown();
        currencyConverterPage.selectFromCurrencyUSD();
    }

    @When("^user selects the To currency as GBP$")
    public void user_selects_to_currency_as_GBP() {
        currencyConverterPage.expandToCurrencyDropdown();
        currencyConverterPage.selectToCurrencyGBP();
    }

    @When("^user submits the selected currencies for conversion$")
    public void user_submits_the_selected_currencies_for_conversion() {
        currencyConverterPage.clickCurrecyConvert();
    }

    @When("^user selects the From currency as GBP$")
    public void user_selects_the_From_currency_as_GBP() {
        currencyConverterPage.expandFromCurrencyDropdown();
        currencyConverterPage.selectFromCurrencyGBP();
    }

    @When("^user selects the To currency as USD$")
    public void user_selects_the_To_currency_as_USD() {
        currencyConverterPage.expandToCurrencyDropdown();
        currencyConverterPage.selectToCurrencyUSD();
    }

    @When("^user selects the From currency as AUD$")
    public void user_selects_the_From_currency_as_AUD() {
        currencyConverterPage.expandFromCurrencyDropdown();
        currencyConverterPage.selectFromCurrencyAUD();
    }

    @When("^user selects the To currency as CAD$")
    public void user_selects_the_To_currency_as_CAD() {
        currencyConverterPage.expandToCurrencyDropdown();
        currencyConverterPage.selectToCurrencyCAD();
    }

    @When("^user selects the To currency as INR$")
    public void user_selects_the_To_currency_as_INR() {
        currencyConverterPage.expandToCurrencyDropdown();
        currencyConverterPage.selectToCurrencyINR();
    }

    @When("^user selects the From currency as EUR$")
    public void user_selects_the_From_currency_as_EUR() {
        currencyConverterPage.expandFromCurrencyDropdown();
        currencyConverterPage.selectFromCurrencyEUR();
    }

    @Then("^user is displayed with the currency conversion rate on the proceeding page$")
    public void user_is_displayed_with_the_currency_conversion_rate_on_the_proceeding_page() {
        currencyConverterPage.screenshot();
        Assert.assertFalse(currencyConverterPage.conversionAmount().equals(null));
        Assert.assertFalse(currencyConverterPage.conversionRate().equals(null));
        Assert.assertFalse(currencyConverterPage.conversionHeading().equals(null));
        currencyConverterPage.close();
    }

}
