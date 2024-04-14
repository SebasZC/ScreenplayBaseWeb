package co.com.automation.screenplay.web.stepdefinitions;

import co.com.automation.screenplay.web.interactions.ClickOnLoginSend;
import co.com.automation.screenplay.web.interactions.ClikOnLogIn;
import co.com.automation.screenplay.web.models.CredentialData;
import co.com.automation.screenplay.web.questions.ValidateUserName;
import co.com.automation.screenplay.web.tasks.EnterCredentialLogin;
import co.com.automation.screenplay.web.tasks.OpenPage;
import co.com.automation.screenplay.web.utils.constants.AutomationConstants;
import co.com.automation.screenplay.web.utils.constants.KillBrowser;
import com.openhtmltopdf.util.Constants;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.DataTableType;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.GivenWhenThen;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matcher;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;

import java.io.IOException;
import java.util.List;
import java.util.Map;

public class LoginStepDefinitions {

    @Before
    public void setUp(){
        OnStage.setTheStage(new OnlineCast());
    }

    @DataTableType
    public CredentialData data(Map<String, String> entry){
        return new CredentialData(
                entry.get("user"),
                entry.get("password")
        );
    }

    @Given("^the user is on the main page$")
    public void theUserIsOnTheMainPage(){
        OnStage.theActorCalled(AutomationConstants.ACTOR).wasAbleTo(OpenPage.openPage());
    }

    @And("^the user cliks on login button$")
    public void theUserClicksOnLoginButton(){
        OnStage.theActorInTheSpotlight().attemptsTo(ClikOnLogIn.clikOnLogIn());
    }

    @When("the user login with credentials")
    public void theUserLoginWithCredentials(List<CredentialData> data) {
        OnStage.theActorInTheSpotlight().attemptsTo(EnterCredentialLogin.enterCredentialLogin(data.get(0)));
    }

    @And("^the user cliks on login send button$")
    public void theUserClickOnLoginButton(){
        OnStage.theActorInTheSpotlight().attemptsTo(ClickOnLoginSend.loginSend());
    }

    @Then("^the user can see the message (.*)$")
    public void theUserCanSeeTheMessageWelcomeUser(String user) {
        OnStage.theActorInTheSpotlight().should(GivenWhenThen.seeThat(ValidateUserName.name(), Matchers.equalTo(user)));
    }

    @After
    public void closeBrowser() throws IOException, InterruptedException {
        KillBrowser.processes("chrome");
    }

}
