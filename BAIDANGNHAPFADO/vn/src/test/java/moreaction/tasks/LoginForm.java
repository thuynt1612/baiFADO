package moreaction.tasks;

import moreaction.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class LoginForm implements Task {
    private String email;
    private String password;
    public LoginForm(String email, String password){
        this.email = email;
        this.password = password;
    }
    public static LoginBuilder withEmail(String email) {
        return new LoginBuilder(email);
    }

    public static class LoginBuilder{
        private String email;
        public LoginBuilder(String email){
            this.email = email;
        }
        public LoginForm andpassword(String password) {
            return instrumented (LoginForm.class,this.email,password);
        }
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(this.email).into(LoginPage.EMAIL_FIELD),
                Enter.theValue(this.password).into(LoginPage.PASSWORD_FIELD),
                Click.on(LoginPage.LOGIN_BUTTON)
        );
    }
}
