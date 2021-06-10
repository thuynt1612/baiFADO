package moreaction.tasks;

import moreaction.ui.FadoHomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;


public class LoginHome implements Task {
    public static Performable Open() {
        return new LoginHome();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Open.url("https://fado.vn/dang-nhap?redirect=https%3A%2F%2Ffado.vn%2F")
//                Click.on(FadoHomePage.Login)
//                Click.on(FadoHomePage.Popup)
        );
    }
}
