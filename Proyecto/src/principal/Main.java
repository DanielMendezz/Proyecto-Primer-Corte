/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.util.*;

/**
 *Una clase en la cual va a llevar todo nuestro codigo
 *mediante diferentes clases y metods que crearemos
 *Su funcionalidad es ser un sistema gestor de notas UDEC
 * @version 1 15/03/2018
 * @author Daniel Mendez y Alison Ramos
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Archivos estudiante=new Archivos();//Archivo donde guardaremos los diferentes datos de los estudiantes
        Archivos profesor=new Archivos();//Archivo donde guardaremos los diferentes datos de los profesores
        Scanner leerOpcion=new Scanner(System.in);//varibale para leer la opcion que escoja del menu principal
        Scanner leerEstudiante=new Scanner(System.in);//variable para leer los diferentes datos de los estudiantes
        Scanner leerOpc=new Scanner(System.in);//Variable para leer la opcion que escoja del menu de agregar
        //Scanner leerNotas=new Scanner(System.in);
        Scanner leerProfesor=new Scanner(System.in);//Variable para recibir los distintos datos de los profesores
        int opc=0,opcion=0;
        //int total=0;
        int  n;
        while(opcion!=4){
            /**
             * Menu principal, desde aqui manejaremos las diferentes opciones principales
             */
            System.out.println(" ____________________________ ");
            System.out.println("|            Menu            |");
            System.out.println("|____________________________|");
            System.out.println("|    1.Insertar una persona  |");
            System.out.println("|____________________________|");
            System.out.println("|          4.Salir           |");
            System.out.println("|____________________________|");
            System.out.println("");
            try {
                opcion=leerOpcion.nextInt();
            } catch (Exception e) {
                leerOpcion = new Scanner(System.in);
            }
            switch(opcion){
                case 1:
                    while(opc!=3){
                        /**
                         * Menu agregar, desde aqui manejaremos
                         * si queremos agregar profesores o estudantes
                         */
                        System.out.println(" _________________________");
                        System.out.println("|           Menu          |");
                        System.out.println("|_________________________|");
                        System.out.println("|   1.Agregar Estudiante  |");
                        System.out.println("|_________________________|");
                        System.out.println("|   2.Agregar Docente     |");
                        System.out.println("|_________________________|");
                        System.out.println("|          3.Salir        |");
                        System.out.println("|_________________________|");
                        System.out.println("");
                        try {
                            opc=leerOpc.nextInt();
                        } catch (Exception e) {
                            leerOpc=new Scanner(System.in);
                        }
                        switch(opc){
                            case 1:
                                /**
                                 * Lectura de los diferentes datos
                                 * que se piden para los estudiantes
                                 */
                                System.out.println("Escribe el nombre del estudiante: ");
                                String nombreE=leerEstudiante.nextLine();
                                System.out.println("Escribe el apellido del estudiante: ");
                                String apellidoE=leerEstudiante.nextLine();
                                System.out.println("Ingresa la edad del estudiante: ");
                                String edadE=leerEstudiante.nextLine();
                                System.out.println("Ingresa el numero del estudiante: ");
                                String telefonoE=leerEstudiante.nextLine();
                                System.out.println("Ingresa el correo del estudiante: ");
                                String correoE=leerEstudiante.nextLine();
                                System.out.println("Materia del estudiante: ");
                                String materia=leerEstudiante.nextLine();
                                /**
                                System.out.println("Cuantas notas va a agregar?");
                                n=leerEstudiante.nextInt();
                                for(int i=1;i<=n;i++){
                                    System.out.println("Agregue la nota numero "+i);
                                    String no=leerNotas.nextLine();
                                    total=total+no;
                                }
                                String nota=total/n;
                                String notas=nota;*/
                                Estudiante p= new Estudiante(nombreE, apellidoE, edadE, telefonoE, correoE, materia);
                                estudiante.escribirE(p);
                                break;
                            case 2:
                                /**
                                 * Lectura de los diferentes datos 
                                 * que se piden para el profesor o 
                                 * profesora
                                 */
                                System.out.println("Escribe el nombre del profesor: ");
                                String nombreP=leerProfesor.nextLine();
                                System.out.println("Escribe el apellido del profesor: ");
                                String apellidoP=leerProfesor.nextLine();
                                System.out.println("Ingresa la edad del profesor: ");
                                String edadP=leerProfesor.nextLine();
                                System.out.println("Ingresa el numero del profesor: ");
                                String telefonoP=leerProfesor.nextLine();
                                System.out.println("Ingresa el correo del profesor: ");
                                String correoP=leerProfesor.nextLine();
                                System.out.println("Materia del profesor: ");
                                String materiaP=leerProfesor.nextLine();
                                Profesor e= new Profesor(nombreP, apellidoP, edadP, telefonoP, correoP, materiaP);
                                profesor.escribirP(e);
                                break;
                        }
                    }
                case 2:
                    /*
                    *Muestra de la impresion de los diferentes archivos
                    */
                    estudiante.imprimirE();
                    break;
            }
        }
    }

    
    
}
