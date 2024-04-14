package co.com.automation.screenplay.web.tasks;

import co.com.automation.screenplay.web.models.CredentialData;
import co.com.automation.screenplay.web.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Enter;

public class EnterCredentialLogin implements Task {
    private CredentialData table;

    public EnterCredentialLogin(CredentialData table) {
        this.table = table;
    }

    @Override
    public <T extends Actor> void performAs(T t) {
        t.attemptsTo(
                Enter.theValue(table.getUser()).into(HomePage.INP_USERNAME),
                Enter.theValue(table.getPassword()).into(HomePage.INP_PASSWORD)
        );
    }

    public static EnterCredentialLogin enterCredentialLogin(CredentialData table){
        return Tasks.instrumented(EnterCredentialLogin.class, table);
    }
}
