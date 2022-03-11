/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.ej7;

/**
 *
 * @author Luis
 */
public class Principal {
    public static void main(String...arg){
    
        Persona luis=new Persona("Luis",47,"M",82.0,1.73);
        Persona maria=new Persona("Maria",32,"F",73,1.72);
        Persona otra=new Persona();
        otra.crearPersona();
        //Acá una condición para mostrar si tiene sobrepeso, etc.
        //Abrevié
        System.out.println(""+luis.calcularMC());
        System.out.println(""+luis.esMayorDeEdad());
        System.out.println(""+maria.calcularMC());
        System.out.println(""+maria.esMayorDeEdad());
        
    }
}
