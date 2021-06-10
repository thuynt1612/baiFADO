package moreaction.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class FadoHomePage {
    public static Target Login = Target.the("Login button")
            .located(By.xpath("//*[@href='/dang-nhap?redirect=https%3A%2F%2Ffado.vn%2F']"));
    public static Target Popup = Target.the("Popup").located(By.xpath("//*[@id='close-button-1545222288830']/span"));
}
