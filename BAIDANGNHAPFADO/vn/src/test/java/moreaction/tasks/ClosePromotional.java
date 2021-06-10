package moreaction.tasks;

import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.support.ui.Wait;

import net.serenitybdd.screenplay.targets.Target;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class ClosePromotional implements Task {
    private Target location;
    @Override
    public <T extends Actor> void performAs(T actor) {
       actor.attemptsTo(
               WaitUntil.the(location,isVisible()),
               Click.on(location)
       );
    }
    public static ClosePromotional closePromotional(Target location){
        return instrumented(ClosePromotional.class,location);
    }
}
