/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

/**
 * Creacion de la clase Estudiante donde creamos 
 * direntes metodos los cuales utilizaremos en la clase Archivos y 
 * en la clase principal
 * @author Alison Ramos y Daniel Mendez
 */
public class Estudiante {
    String nombreE;//Variable de tipo String en la cual recibiremos los nombres del estudiante
    String apellidoE;//Variable de tipo String en la cual recibiremos los apellidos del estudiante
    String edadE;//Variable de tipo String en la cual recibiremos la edad del estudiante
    String telefonoE;//Variable de tipo String en la cual recibiremos el numero telefonico del estudiante
    String correoE;//Variable de tipo String en la cual recibiremos el correo del estudiante
    String materia;//Variable de tipo String en la cual recibiremos la materia que ve este estudiante
    
    /**
     * Creacion del constructor Profesor donde recibimos los datos de cada uno
     * @param nombreE
     * @param apellidoE
     * @param edadE
     * @param telefonoE
     * @param correoE
     * @param materia 
     */
    public Estudiante(String nombreE, String apellidoE, String edadE, String telefonoE, String correoE, String materia){
        this.nombreE=nombreE;
        this.apellidoE=apellidoE;
        this.edadE=edadE;
        this.telefonoE=telefonoE;
        this.correoE=correoE;
        this.materia=materia;
    }
    /*
    *El metodo set de todos los datos
    */
    public void setDatos(String nombreE, String apellidoE, String edadE, String telefonoE, String correoE, String materia){
        this.nombreE=nombreE;
        this.apellidoE=apellidoE;
        this.edadE=edadE;
        this.telefonoE=telefonoE;
        this.correoE=correoE;
        this.materia=materia;
    }
    /**
     * El metodo get de los datos ya ingresados
     * @return 
     */
    public String getDatos(){
        String respuesta="Nombre del estudiante: "+nombreE;
        respuesta+="Apellido del estudiante: "+apellidoE;
        respuesta+="Edad del estudiante: "+edadE;
        respuesta+="Telefono del estudiante: "+telefonoE;
        respuesta+="Correo del estudiante: "+correoE;
        respuesta+="Materia del estudiante: "+materia;
        return respuesta;
    }
    public void desplegar(){
        System.out.println("Hola: "+nombreE);
    }
    @Override
    public String toString(){
        String mensaje="El nombre del estudiante es "+nombreE+" "+apellidoE+" con edad de "+edadE+" . Su numero de telefono es "+telefonoE+" y su correo es "+correoE+" inscrito en la materia de "+materia;
        return mensaje;
    }
}
