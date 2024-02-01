package co.com.certificacion.ilana.automatizacion.models;

import co.com.certificacion.ilana.automatizacion.models.builder.BuilderFormulario;

public class Formulario {

    private String  nombre;
    private String  apellido;

    private String correo;

    private String celular;

    private String fechaNacimiento;

    public Formulario(BuilderFormulario Builder){
        nombre = Builder.getNombre();
        apellido=Builder.getApellido();
        correo= Builder.getCorreo();
        celular = Builder.getCelular();
        fechaNacimiento=Builder.getFechaNacimiento();

    }
    public String nombre(){
        return  nombre;
    }

    public String apellido(){
        return  apellido;
    }

    public String correo(){
        return  correo;
    }
    public String celular(){
        return  celular;
    }
    public String fechaNacimiento(){
        return  fechaNacimiento;
    }




}
