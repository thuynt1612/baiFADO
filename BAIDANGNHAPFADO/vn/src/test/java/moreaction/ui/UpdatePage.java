package moreaction.ui;


import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class UpdatePage {
    public static final Target INFORMATION_USER = Target.the("information user")
            .located(By.xpath("//*[@id=\"user-info__dropdown\"]/div[1]/span[1]"));
    public static final Target EDIT_USER = Target.the("edit user")
            .located(By.xpath("//a[@href='/thong-tin-ca-nhan' and @class='mz-btn mz-btn-sm mz-btn-bdr-circle user-edit-profile-icon-shape']"));
    public static final Target FULLNAME_FIELD = Target.the("fullname field")
            .located(By.xpath("//input[@name='fullname']"));
    public static final Target PHONE_FIELD = Target.the("phone field")
            .located(By.xpath("//input[@name='phone']"));
    public static final Target EMAIL_FIELD = Target.the("email field")
            .located(By.xpath("//div[text()='Email *']/following-sibling::div"));
    public static final Target CONFIRM_BUTTON = Target.the("cofrm button")
            .located(By.xpath("//button[@class='my-btn -btn-pill -btn-md -btn-grd-bg']"));
    public static final Target ACCOUNT_INFORMATION = Target.the("account information")
            .located(By.xpath("//li[@class='info-item']/a[@href='/thong-tin-ca-nhan']"));
}
