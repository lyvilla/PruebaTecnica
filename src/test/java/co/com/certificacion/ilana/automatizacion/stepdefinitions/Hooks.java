package co.com.certificacion.ilana.automatizacion.stepdefinitions;
import io.cucumber.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hooks {

    @Before
    public void set_the_stage() {
        OnStage.setTheStage(new OnlineCast());
    }
}
