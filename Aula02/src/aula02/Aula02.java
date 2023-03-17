/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula02;

import java.util.Scanner;
/**
 *
 * @author Alex
 */
public class Aula02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
       /* System.out.println(" Exercício 01 ");
        int faturamentoJaneiro = 1500;
        int faturamentoFevereiro = 4500;
        int faturamentoMarco = 9800;
        
        int faturamentoTrimestral = faturamentoJaneiro  + faturamentoFevereiro +  faturamentoMarco;
        
        System.out.println("Faturamento Total: " +  faturamentoTrimestral);*/
       
       
       Scanner abacaxi = new Scanner(System.in);
       
         System.out.println(" Exercício 02 ");
         System.out.println(" Digite o faturamento do mes  01 ");
         int faturamentoJaneiro = abacaxi.nextInt();
         System.out.println(" Digite o faturamento do mes  02 ");         
         int faturamentoFevereiro = abacaxi.nextInt();;
         System.out.println(" Digite o faturamento do mes  03 ");                         
        int faturamentoMarco = abacaxi.nextInt();;
        
        int faturamentoTrimestral = faturamentoJaneiro  + faturamentoFevereiro +  faturamentoMarco;
        
        System.out.println("Faturamento Total: " +  faturamentoTrimestral);
        
        
        
    }
    
}
