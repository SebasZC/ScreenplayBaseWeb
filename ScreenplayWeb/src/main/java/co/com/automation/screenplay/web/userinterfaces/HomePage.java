package co.com.automation.screenplay.web.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class HomePage {
    public static final Target BTN_LOGIN = Target.the("Button log in").located(By.id("login2"));
    public static final Target INP_USERNAME = Target.the("Input username").located(By.id("loginusername"));
    public static final Target INP_PASSWORD = Target.the("Input password").located(By.id("loginpassword"));
    public static final Target BTN_LOGIN_SEND = Target.the("Button log in form").located(By.cssSelector("[onclick='logIn()']"));
    public static final Target TXT_WELCOME = Target.the("Text welcomer user").located(By.id("nameofuser"));
}
