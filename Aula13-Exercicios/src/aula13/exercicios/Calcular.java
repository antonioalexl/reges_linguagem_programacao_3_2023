/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13.exercicios;

/**
 *
 * @author Alex
 */
public class Calcular {
    
    private int resultado;

      public Calcular() {
    
    }
    
    public Calcular(int p1, int p2) {
        this.resultado = p1 + p2;
    }
    
    public Calcular(int p1, int p2, int p3) {
        this.resultado = p1 + p2 + p3;
    }
    
     public Calcular(int p1, int p2, int p3, int p4) {
        this.resultado = p1 + p2 + p3 + p4;
    }
    
       public Calcular(int p1, int p2, int p3, int p4, int p5) {
        this.resultado = p1 + p2 + p3 + p4 + p5;
    }

       
    public int getResultado() {
        return resultado;
    }
    

    public int Somar(int p1, int p2) {

        return p1 + p2;
    }

    public int Somar(int p1, int p2, int p3) {

        return p1 + p2 + p3;
    }

    public int Somar(int p1, int p2, int p3, int p4) {

        return p1 + p2 + p3 + p4;
    }

    public int Somar(int p1, int p2, int p3, int p4, int p5) {

        return p1 + p2 + p3 + p4 + p5;
    }

}
