/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package principal;

import java.io.*;

/**
 * Creacion de la clase Archivos donde se manejan los distintos archivos
 * asi sea estudiante o profesores, en la cual creamos diferentes metodos
 * que estaremos utilizando en la clase principal
 * @author Alison Ramos y Daniel Mendez
 */
public class Archivos {
    /**
     * Metodo en el que crearemos el archivo de estudiante
     * y hacemos la logica de que si existe agregue los datos y
     * si no que cree el archivo 
     * @param nueva 
     */
    public void escribirE(Estudiante nueva){
        try {
            File estudiante=new File("UdeCEstudiante.txt");
            FileWriter estudiantew;
            BufferedWriter studentw;
            if(estudiante.exists()){
                estudiantew=new FileWriter(estudiante,true);
                studentw=new BufferedWriter(estudiantew);
                studentw.newLine();
                studentw.write(nueva.nombreE+"%"+nueva.apellidoE+"%"+nueva.edadE+"%"+nueva.telefonoE+"%"+nueva.correoE);
            }else{
                estudiantew=new FileWriter(estudiante,true);
                studentw=new BufferedWriter(estudiantew);
                studentw.write(nueva.nombreE+"%"+nueva.apellidoE+"%"+nueva.edadE+"%"+nueva.telefonoE+"%"+nueva.correoE);
            }
            studentw.close();
            estudiantew.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    /**
     * Metodo en el que crearemos el archivo de profesores
     * y hacemos la logica de que si existe agregue los datos y
     * si no que cree el archivo 
     * @param nueva 
     */
    public void escribirP(Profesor nueva){
        try {
            File profesor=new File("UdeCProfesor.txt");
            FileWriter profesorw;
            BufferedWriter teacherw;
            if(profesor.exists()){
                profesorw=new FileWriter(profesor,true);
                teacherw=new BufferedWriter(profesorw);
                teacherw.newLine();
                teacherw.write(nueva.nombreP+"%"+nueva.apellidoP+"%"+nueva.edadP+"%"+nueva.telefonoP+"%"+nueva.correoP+"%"+nueva.materiaP);
            }else{
                profesorw=new FileWriter(profesor,true);
                teacherw=new BufferedWriter(profesorw);
                teacherw.write(nueva.nombreP+"%"+nueva.apellidoP+"%"+nueva.edadP+"%"+nueva.telefonoP+"%"+nueva.correoP+"%"+nueva.materiaP);
            }
            teacherw.close();
            profesorw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
    /**
     * Creacion del metodo imprimir, en el cual 
     * analizamos si existe el archivo empiece linea por linea
     * y valla imprimiendo cada linea que va encontrando en el
     * archivo
     */
    public void imprimirE(){
        try {
            File estudiante=new File("UdecEstudiante.txt");
            if(estudiante.exists()){
                FileReader estudianter=new FileReader(estudiante);
                BufferedReader studentr=new BufferedReader(estudianter);
                String linea;
                while((linea=studentr.readLine())!=null){
                    String [] estu=linea.split("%");
                    Estudiante p=new Estudiante(estu[0], estu[1], estu[2], estu[3], estu[4], estu[5]);
                    p.desplegar();
                    System.out.println("***************************");
                    
                }
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    
}
