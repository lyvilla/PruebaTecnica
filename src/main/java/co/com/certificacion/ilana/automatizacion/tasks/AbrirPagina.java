package co.com.certificacion.ilana.automatizacion.tasks;


import co.com.certificacion.ilana.automatizacion.page.DemoQA;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;

import static co.com.certificacion.ilana.automatizacion.page.DemoQA.FORMS;

public class AbrirPagina implements Task {

    private DemoQA IrAForms;

   @Override
    public <T extends Actor> void performAs(T theActor) {
       theActor.attemptsTo(Open.browserOn(IrAForms));
    }

    public static AbrirPagina demoqa(){
        return Tasks.instrumented(AbrirPagina.class);
    }
}
