/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.ej8;

/**
 *
 * @author Luis
 */
public class Main {
    public static void main(String arg[]){
    
        Cadena c=new Cadena("Hola Javier");
        c.invertirFrase();
        c.mostrarVocales();
        c.vecesRepetido('a');
        c.comparaLongitud("Hola Javier");
        c.reemplazar("z");
        if(c.contiene("j")){
        
                System.out.println("Contiene");
        }else {
        
                System.out.println("No contiene");
        }
        
        
    }
}
