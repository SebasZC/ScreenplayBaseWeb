package co.com.automation.screenplay.web.questions;

import co.com.automation.screenplay.web.userinterfaces.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;

public class ValidateUserName implements Question<String> {
    @Override
    public String answeredBy(Actor actor) {
        return Text.of(HomePage.TXT_WELCOME).answeredBy(actor);
    }
    public static ValidateUserName name(){
        return new ValidateUserName();
    }
}
