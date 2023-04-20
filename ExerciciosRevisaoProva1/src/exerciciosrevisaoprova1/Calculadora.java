/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosrevisaoprova1;

/**
 *
 * @author Alex
 */
public class Calculadora {
    
    public double somar(double num1, double num2) {
        return num1 + num2;
    }
    
    public double subtrair(double num1, double num2) {
        return num1 - num2;
    }
    
    public double multiplicar(double num1, double num2) {
        return num1 * num2;
    }
    
    public double dividir(double num1, double num2) {
        if (num2 == 0) {
            throw new IllegalArgumentException("Nao é possível dividir por zero");
        }
        return num1 / num2;
    }
}
