package moreaction.ui;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class LoginPage {

    public static final Target PROMOTIONAL1 = Target.the("promotional may pha ca phe")
            .located(By.xpath("//*[@id=\"bner-center-modal\"]/div/div/div/button"));
    public static Target PROMOTIONAL2 = Target.the("promotional khong bo lo")
            .located(By.xpath("//*[@id=\"ins-editable-text-1545222108989\"]/a"));
    public static Target EMAIL_FIELD = Target.the("Email").located(By.xpath("//*[@id='auth-block__form-group__email']"));

    public static Target PASSWORD_FIELD = Target.the("PassWord").located(By.xpath("//*[@type='password']"));
    public static Target LOGIN_BUTTON = Target.the("Login button").located(By.xpath("//*[@class='my-btn -btn-pill auth-block__login-btn mz-btn-primary']"));
}

