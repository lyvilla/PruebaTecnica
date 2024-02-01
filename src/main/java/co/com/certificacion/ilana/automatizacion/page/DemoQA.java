package co.com.certificacion.ilana.automatizacion.page;

import net.serenitybdd.annotations.DefaultUrl;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://demoqa.com/")
public class DemoQA extends PageObject {

    public static final Target FORMS= Target.the("Click en la opción forms")
            .locatedBy("//*[@id='app']/div/div/div/div/div[2]");

    public static final Target PRACTICE_FORMS= Target.the("Click en la opción forms")
            .locatedBy("/html/body/div[2]/div/div/div[2]/div[1]/div/div/div[2]/div/ul/li");


}
