/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula13.exercicios;

/**
 *
 * @author Alex
 */
public class Aula13Exercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Calcular calc1 = new Calcular();
        calc1.Somar(1,4);
        
        Calcular calc = new Calcular(1,2,3,4);
        System.out.println(calc.getResultado());
        
        Gerente gerente = new Gerente("José");
        gerente.setSalario(500);
        gerente.aumentarSalario(10);
        
        
        Supervisor supervisor = new Supervisor("JOão");
        supervisor.setSalario(600);
        supervisor.aumentarSalario(15);
        
        
    }
    
}
