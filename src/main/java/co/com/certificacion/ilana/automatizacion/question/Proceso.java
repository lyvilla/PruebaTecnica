package co.com.certificacion.ilana.automatizacion.question;

import co.com.certificacion.ilana.automatizacion.page.DatosBasicos;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class Proceso implements Question<String> {

    @Override
    public String answeredBy(Actor actor) {
      ;
        return DatosBasicos.PROCESO_EXITOSO.resolveFor(actor).getText();

    }

    public static Proceso exitoso(){
        return new Proceso();
    }
}
