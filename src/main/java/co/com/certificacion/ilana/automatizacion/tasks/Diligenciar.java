package co.com.certificacion.ilana.automatizacion.tasks;

import co.com.certificacion.ilana.automatizacion.models.Formulario;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.Scroll;


import static co.com.certificacion.ilana.automatizacion.page.DatosBasicos.*;


public class Diligenciar implements Task {

    private final Formulario formulario;

    public Diligenciar(Formulario formulario){
        this.formulario = formulario;
    }

    @Override
    public <T extends Actor> void performAs(T theactor) {



       theactor.attemptsTo(Enter.theValue(formulario.nombre()).into(NOMBRE),
                Enter.theValue(formulario.apellido()).into(APELLIDO),
                Enter.theValue(formulario.correo()).into(CORREO),
                Click.on(GENERO),
                Enter.theValue(formulario.celular()).into(CELULAR),
                Click.on(FECHANACIMIENTO),
                Click.on(MES.of("November")),
                Click.on(ANIO.of("1996")),
                Click.on(DIA.of("10")),
                Scroll.to(GUARDAR),
                Click.on(GUARDAR));


    }

    public static Diligenciar formulario(Formulario formulario){
        return Tasks.instrumented(Diligenciar.class, formulario);
    }
}
