package co.com.automation.screenplay.web.interactions;

import co.com.automation.screenplay.web.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;

public class ClikOnLogIn implements Interaction {
    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(Click.on(HomePage.BTN_LOGIN));
    }
    public static ClikOnLogIn clikOnLogIn(){
        return Tasks.instrumented(ClikOnLogIn.class);
    }
}
