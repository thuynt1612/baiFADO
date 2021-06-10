package moreaction.features.search;

import moreaction.tasks.*;
import moreaction.ui.LoginPage;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import java.lang.annotation.Target;

@RunWith(SerenityRunner.class)
public class FadoUpdateInformationStory {
    @Managed
    WebDriver driver;
    Actor anna;
    @Before
    public void annaCanBrowseTheWeb() {
        anna = Actor.named("Anna").can(BrowseTheWeb.with(driver));
    }
    @Test
    public void complete_register_form_information() throws InterruptedException {
        anna.attemptsTo(
                LoginHome.Open(),
//                RefreshPage.thePage(),
                LoginForm.withEmail("annhien@gmail.com").andpassword("0983951445")
        );
        //tat thong bao
        anna.attemptsTo(
                ClosePromotional.closePromotional(LoginPage.PROMOTIONAL1)
        );
//        anna.attemptsTo(
//                UpdateInformationForm.withFullName("Trần Diệp Anh").andPhone("0987654321").andEmail("diepanh@gmail.com")
//        );
    }
}
