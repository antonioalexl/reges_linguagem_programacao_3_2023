/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11.exercicios;

/**
 *
 * @author Alex
 */
public class Circulo {
    
    private double raio;
    public final double pi = 3.14159265359; //constante
       

    public double getRaio() {
        
        return raio;
        
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double calcularArea() {
        return pi * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * pi * raio;
    }
}
