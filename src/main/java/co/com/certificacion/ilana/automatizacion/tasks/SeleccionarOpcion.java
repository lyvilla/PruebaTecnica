package co.com.certificacion.ilana.automatizacion.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;

import static co.com.certificacion.ilana.automatizacion.page.DemoQA.FORMS;
import static co.com.certificacion.ilana.automatizacion.page.DemoQA.PRACTICE_FORMS;

public class SeleccionarOpcion implements Task {

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Scroll.to(FORMS),
                Click.on(FORMS),
          Click.on(PRACTICE_FORMS));
    }

    public static SeleccionarOpcion  practiceForm(){
        return Tasks.instrumented(SeleccionarOpcion.class);
    }
}
