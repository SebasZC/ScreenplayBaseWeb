package co.com.automation.screenplay.web.tasks;

import co.com.automation.screenplay.web.utils.constants.AutomationConstants;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Browser;
import net.serenitybdd.screenplay.actions.Open;

public class OpenPage implements Task {
    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(Open.url(AutomationConstants.URL_DEMO_BLAZE), Browser.maximize());
    }
    public static OpenPage openPage(){
        return Tasks.instrumented(OpenPage.class);
    }
}
