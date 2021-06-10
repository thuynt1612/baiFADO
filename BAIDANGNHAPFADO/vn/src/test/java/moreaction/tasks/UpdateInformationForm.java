package moreaction.tasks;

import moreaction.ui.LoginPage;
import moreaction.ui.UpdatePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class UpdateInformationForm implements Task {
    private String fullname;
    private String phone;
    private String email;


    public static UpdateBuider withFullName(String fullname) {
        return new UpdateBuider(fullname);
    }

    public static class UpdateBuider {
        private String fullname;
        private String phone;

        public UpdateBuider(String fullname) {
            this.fullname = fullname;
        }

        public UpdateBuider andPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public Performable andEmail(String email) {
            return instrumented(UpdateInformationForm.class, this.fullname, this.phone,email);
        }
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(UpdatePage.INFORMATION_USER),
                Click.on(UpdatePage.ACCOUNT_INFORMATION),
                Enter.theValue(this.fullname).into(UpdatePage.FULLNAME_FIELD),
                Enter.theValue(this.phone).into(UpdatePage.PHONE_FIELD),
                Enter.theValue(this.email).into(UpdatePage.EMAIL_FIELD),
                Click.on(UpdatePage.CONFIRM_BUTTON)
        );
    }
}
