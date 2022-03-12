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
public class Cadena {
    private String frase;
    private int longitud;
    
    public Cadena(String frase){
    
        this.frase=frase.toLowerCase();
        this.longitud=frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud=frase.length();
    }

    public int getLongitud() {
        return longitud;
    }

   public void  mostrarVocales(){
   
       int vocales=0;
       String minusculas=this.frase.toLowerCase();
       for(int i=0;i<longitud;i++){
       
           if(minusculas.charAt(i)=='a'||minusculas.charAt(i)=='e'||minusculas.charAt(i)=='i'||minusculas.charAt(i)=='o'||minusculas.charAt(i)=='u'){
           
               vocales++;
           }
       }
       
       System.out.println("La frase "+frase+" tiene "+vocales+" vocales");
   }
 

public void invertirFrase(){

    char palabra[]=new char[longitud];
    int j=0;
    for(int i=longitud-1;i>=0;i--){
       
       palabra[j]=this.frase.charAt(i);
       j++;
           
       }
    System.out.println(palabra);
}   

public void vecesRepetido(char letra){

    int cantidad=0;
    
    for(int i=0;i<frase.length();i++){
       
           if(frase.charAt(i)==letra){
           
               cantidad++;
           }
       }
    System.out.println("La letra "+letra+ " está repetida "+cantidad+" veces");
    
}
    
public void comparaLongitud(String frase){

    if(this.frase.length()==frase.length()){
    
        System.out.println("Tienen la misma longitud");
    } else {
    
        System.out.println("Tienen distinta longitud");
    }
}

public void unirFrase(String frase){

    System.out.println("La nueva frase es "+this.frase+" "+frase);
}

public void reemplazar(String letra){

    System.out.println("La frase quedó asi "+this.frase.replace("a", letra));
}

public boolean contiene(String letra){

    return this.frase.contains(letra);
}
}
