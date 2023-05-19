/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.exercicios;

/**
 *
 * @author Alex
 */
public class Circulo {
    private double raio;
    private String cor;
    
    // Construtor
    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }
    
    // Método para calcular a área do círculo
    public double calcularÁrea() {
        return Math.PI * Math.pow(raio, 2);
    }
    
    // Método para calcular a circunferência do círculo
    public double calcularCircunferência() {
        return 2 * Math.PI * raio;
    }
}