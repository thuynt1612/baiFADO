package moreaction.tasks;

import moreaction.ui.LoginPage;
import moreaction.ui.UpdatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

public class UpdateInFoMaTiOnPage implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UpdatePage.INFORMATION_USER),
                Click.on(UpdatePage.EDIT_USER)
        );
    }
}
