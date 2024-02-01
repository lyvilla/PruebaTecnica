package co.com.certificacion.ilana.automatizacion.page;

import net.serenitybdd.screenplay.targets.Target;
import net.serenitybdd.screenplay.ui.RadioButton;
import org.openqa.selenium.By;

public class DatosBasicos {

    public static final Target NOMBRE= Target.the("Ingresa el nombre")
            .located(By.id("firstName"));

    public static final Target APELLIDO= Target.the("Ingresa el apellido")
            .located(By.id("lastName"));

    public static final Target CORREO= Target.the("Ingresa el correo")
            .located(By.id("userEmail"));

    public static final Target CELULAR = Target.the("Ingresa el celular")
            .located(By.id("userNumber"));


    public static final Target GENERO= RadioButton.locatedBy("//*[@id='genterWrapper']/div[2]/div[2]/label");

    public static final Target FECHANACIMIENTO= Target.the("Selecciona la fecha de nacimiento")
            .located(By.id("dateOfBirthInput"));

    public static final Target MES= Target.the("Selecciona el mes")
            .locatedBy("//select[@class='react-datepicker__month-select']/option[contains (text(), '{0}')]");


    public static final Target ANIO= Target.the("Selecciona el anio")
            .locatedBy("//select[@class='react-datepicker__year-select']/option[contains (text(), '{0}')]");

    public static final Target DIA= Target.the("Selecciona el dia")
            .locatedBy("//div[@class='react-datepicker__week']/div[contains (text(), '{0}')]");

    public static final Target GUARDAR= Target.the("Selecciona la fecha de nacimiento")
            .locatedBy("//button[@id='submit']");

    public static final Target PROCESO_EXITOSO= Target.the("Selecciona el dia")
            .locatedBy("//div[@id='example-modal-sizes-title-lg']");




}
