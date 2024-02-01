package co.com.certificacion.ilana.automatizacion.models.builder;

import co.com.certificacion.ilana.automatizacion.interfaz.Builder;
import co.com.certificacion.ilana.automatizacion.models.Formulario;

public class BuilderFormulario implements Builder<Formulario> {
    private String  nombre;
    private String  apellido;

    private String correo;

    private String celular;

    private String fechaNacimiento;


    public BuilderFormulario(String nombre){
        this.nombre = nombre;
    }

    public static BuilderFormulario conNombre(String nombre){
        return new BuilderFormulario(nombre);
    }

    public BuilderFormulario apellido(String apellido){
        this.apellido = apellido;
        return this;
    }

    public BuilderFormulario correo(String correo){
        this.correo = correo;
        return this;
    }
    public BuilderFormulario celular(String celular){
        this.celular = celular;
        return this;
    }
    public Formulario fechaNacimiento(String fechaNacimiento){
        this.fechaNacimiento = fechaNacimiento;
        return this.build();
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getCorreo() {
        return correo;
    }

    public String getCelular() {
        return celular;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }


    @Override
    public Formulario build() {
        return new Formulario(this);
    }
}
