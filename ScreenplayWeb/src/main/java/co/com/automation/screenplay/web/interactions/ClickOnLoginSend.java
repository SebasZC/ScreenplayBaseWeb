package co.com.automation.screenplay.web.interactions;

import co.com.automation.screenplay.web.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClickOnLoginSend implements Interaction {
    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(Click.on(HomePage.BTN_LOGIN_SEND));
    }
    public static ClickOnLoginSend loginSend(){
        return Tasks.instrumented(ClickOnLoginSend.class);
    }
}
