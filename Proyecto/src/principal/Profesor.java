/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 * Creacion de la clase Profesor donde creamos 
 * direntes metodos los cuales utilizaremos en la clase Archivos y 
 * en la clase principal
 * @author Alison Ramos y Daniel Mendez 
 */
public class Profesor {
    String nombreP;//Variable de tipo String en la cual recibiremos los nombres del profesor
    String apellidoP;//Variable de tipo String en la cual recibiremos los apellidos del profesor
    String edadP;//Variable de tipo String en la cual recibiremos la edad del profesor
    String telefonoP;//Variable de tipo String en la cual recibiremos el numero telefonico del profesor
    String correoP;//Variable de tipo String en la cual recibiremos el correo del profesor
    String materiaP;//Variable de tipo String en la cual recibiremos la materia que dicta este profesor
    
    public Profesor(){
        System.out.println("");
    }
    /**
     * Creacion del constructor Profesor donde recibimos los datos de cada uno
     * @param nombreP
     * @param apellidoP
     * @param edadP
     * @param telefonoP
     * @param correoP
     * @param materiaP 
     */
    
    public Profesor(String nombreP, String apellidoP, String edadP, String telefonoP, String correoP, String materiaP){
        this.nombreP=nombreP;
        this.apellidoP=apellidoP;
        this.edadP=edadP;
        this.telefonoP=telefonoP;
        this.correoP=correoP;
        this.materiaP=materiaP;
    }
    /*
    *El metodo set de todos los datos
    */
    public void setDatosP(String nombreP, String apellidoP, String edadP, String telefonoP, String correoP, String materiaP){
        this.nombreP=nombreP;
        this.apellidoP=apellidoP;
        this.edadP=edadP;
        this.telefonoP=telefonoP;
        this.correoP=correoP;
        this.materiaP=materiaP;
    }
    /**
     * El metodo get de los datos ya ingresados
     * @return 
     */
    public String getDatos(){
        String respuesta="Nombre del profesor: "+this.nombreP;
        respuesta+="Apellido del profesor: "+this.apellidoP;
        respuesta+="Edad del profesor: "+this.edadP;
        respuesta+="Telefono del profesor: "+this.telefonoP;
        respuesta+="Correo del profesor: "+this.correoP;
        respuesta+="Materia del profesor: "+this.materiaP;
        return respuesta;
    }
    
    @Override
    public String toString(){
        String mensaje="El nombre del profesor es "+nombreP+" "+apellidoP+" con edad de "+edadP+" . Su numero de telefono es "+telefonoP+" y su correo es "+correoP+" director de la materia de "+materiaP;
        return mensaje;
    }
}
