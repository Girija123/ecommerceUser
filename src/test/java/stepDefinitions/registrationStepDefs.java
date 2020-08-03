package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import functionLibrary.CommonFunctions;
import pageObjects.RegistrationPage;

public class registrationStepDefs extends CommonFunctions {

    RegistrationPage registrationPage = new RegistrationPage(driver);
    CommonFunctions commonFunctions = new CommonFunctions();

    @Given("^I'm on Home Page$")
    public void i_m_on_Home_Page() throws Throwable {
        commonFunctions.openHome();
    }

    @When("^I enter firstName$")
    public void i_enter_firstName() throws Throwable {
        registrationPage.enterFirstname();
    }

    @When("^I enter surName$")
    public void i_enter_surName() throws Throwable {
        registrationPage.enterSurname();
    }

    @When("^I enter mobileNumber$")
    public void i_enter_mobileNumber() throws Throwable {
        registrationPage.enteremail();
    }

    @When("^I enter password$")
    public void i_enter_password() throws Throwable {
        registrationPage.chooseGender();
    }

    @When("^I select  birthDate$")
    public void i_select_birthDate() throws Throwable {
        registrationPage.chooseBirthDate();
    }

    @When("^I choose gender$")
    public void i_choose_gender() throws Throwable {
        registrationPage.chooseGender();
    }

    @When("^I click signUp$")
    public void i_click_signUp() throws Throwable {
        registrationPage.clickSignUp();
    }

    @Then("^I should get registered$")
    public void i_should_get_registered() throws Throwable {
        registrationPage.validateRegistration();
    }



}
