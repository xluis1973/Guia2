/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia2.ej7;

import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class Persona {
    private String nombre;
    private int edad;
    private String sexo;
    private double peso;
    private double altura;

    public Persona() {
    }

    public Persona(String nombre, int edad, String sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void crearPersona(){
    
        Scanner lector =new Scanner(System.in);
        System.out.println("Ingrese nombre");
        this.nombre=lector.next();
        System.out.println("Ingrese Edad");
        this.edad=lector.nextInt();
        int i=0;
        do{
            if(i>0){
                System.out.println("Dato ingresado Incorrectamente");
            }
            System.out.println("Ingrese Sexo");
            sexo=lector.next();
            i++;
            
        }while(!(sexo.equals("H")||sexo.equals("M")||sexo.equals("O")));
        System.out.println("Ingrese Altura");
        this.altura=lector.nextDouble();
        System.out.println("Ingrese Peso");
        this.peso=lector.nextDouble();
    }
    
    public int calcularMC(){
    
        double pesoIdeal=this.peso/(this.altura*this.altura);
        if(pesoIdeal<20){
        
            return -1;
        }else if(pesoIdeal>=20 && pesoIdeal<=25){
        
            return 0;
        } else {
        
            return 1;
        }
    }
    
    public boolean esMayorDeEdad(){
    
        return this.edad>18;
    }
}
