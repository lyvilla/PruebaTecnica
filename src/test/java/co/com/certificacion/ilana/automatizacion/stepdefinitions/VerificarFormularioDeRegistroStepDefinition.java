package co.com.certificacion.ilana.automatizacion.stepdefinitions;



import co.com.certificacion.ilana.automatizacion.page.DatosBasicos;
import co.com.certificacion.ilana.automatizacion.page.DemoQA;
import co.com.certificacion.ilana.automatizacion.question.Proceso;
import co.com.certificacion.ilana.automatizacion.tasks.AbrirPagina;
import co.com.certificacion.ilana.automatizacion.tasks.Diligenciar;
import co.com.certificacion.ilana.automatizacion.tasks.SeleccionarOpcion;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.GivenWhenThen;
import static org.hamcrest.Matchers.equalTo;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import static org.hamcrest.core.Is.is;
import org.openqa.selenium.WebDriver;
import static co.com.certificacion.ilana.automatizacion.models.builder.BuilderFormulario.conNombre;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;


public class VerificarFormularioDeRegistroStepDefinition {


    WebDriver driver;

    @Dado("que el {string} se encuentra en la pagina principal demoqa")
    public void queElSeEncuentraEnLaPaginaPrincipalDemoqa(String actor) {
        theActorCalled(actor).wasAbleTo(AbrirPagina.demoqa());
    }

    @Cuando("el usuario ingrese a la opcion forms")
    public void elUsuarioIngreseALaOpcionForms() {
        theActorInTheSpotlight().attemptsTo(SeleccionarOpcion.practiceForm());
    }

    @Cuando("diligencie el formulario datos basicos {string} {string}{string} {string} {string}")
    public void diligencie_el_formulario_datos_basicos(String nombre, String apellido, String correo, String celular, String fechaNamiento) {
        theActorInTheSpotlight().attemptsTo(Diligenciar.formulario(conNombre(nombre)
                .apellido(apellido)
                .correo(correo)
                .celular(celular)
                .fechaNacimiento(fechaNamiento)));
    }



    @Entonces("debera ver el {string}")
    public void debera_ver_el(String mensaje) {
        theActorInTheSpotlight().should(GivenWhenThen.seeThat(Proceso.exitoso(), equalTo(mensaje)));
    }
}
