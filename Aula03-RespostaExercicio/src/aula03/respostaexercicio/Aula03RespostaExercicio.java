/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula03.respostaexercicio;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class Aula03RespostaExercicio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        /*
       Exercício 01 -  Faça um algoritmo que imprima os valores pares de 0 até 100. 
        Dica: Utilize o operador mod %(resto). Ex:
         */
 /*for (int i = 0; i < 100; i= i + 2) {
            System.out.println("Número é par: " + i);            
        }*/
 /*for (int i = 0; i < 100; i++) {
            if (i%2 == 0) {
                System.out.println("Número é par: " + i);            
            }            
        }*/
        /*int i = 0;
        while (i < 100) {
            if (i % 2 == 0) {
                System.out.println("Número é par: " + i);
            }
            i++;
        }*/
        
        
        //int i = 0;
      /*  do{
            
        if (i % 2 == 0) {
                System.out.println("Número é par: " + i);
            }
            i++;
        }        
        while (i < 100);*/
      
      
      //int t = 0;
      
      /*do{
            
        System.out.println("Número é par: " + t);
            t++;
        }        
        while (t < 10);*/
         //int t = 0;
      /* while(t > 0 && t<10)
            
            System.out.println("Número é par: " + t);
            t++;
        } */       
        
    
      /* int t = 0;      
       do
       {
              System.out.println("Número é par: " + t);
             t++;
       
        }
       while(t > 0 && t<10);*/
            
          
        /*
        Faça um algoritmo para calcular e exibir a média 
         ponderada de 2 notas. As notas devem ser solicitadas ao 
       usuário. O peso para cálculo deve ser o seguinte
        60% para primeira nota
        40% para os trabalhos (segunda nota)
        */
       /* Scanner scann = new Scanner(System.in);
        System.out.println("Informe a nota 1:");
        double n1 = scann.nextDouble();
        
        System.out.println("Informe a nota 2:");
        double n2 = scann.nextDouble();
        double p1 = 0.6;
        double p2 = 0.4;
        
        double mp = (((p1 * n1) + (p2 * n2) ) / (p1 + p2));        
       //  double mp =  p1 * n1 + p2 * n2  / p1 + p2;
        
        System.out.println("A nota final é " +  mp);
            */
       
       /*
       3 Faça um algoritmo que recebe como entrada do 
       usuário o preço da gasolina e do etanol, 
       faça o cálculo e retorne se é mais vantajoso 
       abastecer com etanol ou gasolina. 
       Para a regra de cálculo, considere que é mais vantajoso
       abastecer com etanol quando o preço do litro
       for menor que 70% do valor da gasolina.
       */
        /*Scanner scann = new Scanner(System.in);
        System.out.println("Digite o valor da gasolina");
        double gasolina = scann.nextDouble();
        System.out.println("Digite o valor do etanol");
        double etanol = scann.nextDouble();
        double calculo = etanol / gasolina;
        
        System.out.println("O cálculo é" + calculo);
        if ((calculo) < 0.70 ) {
            System.out.println("Abasteça com etanol");
        }
        else{
         System.out.println("Abasteça com gasolina");
        } */
        
        /*4 - Desenvolva um algoritmo que crie três variáveis do tipo double (altura, peso e total). A altura e peso deverá ser solicitada ao usuário e o total é o cálculo do IMC. Após o cálculo, o valor deverá ser impresso no console.
        Obs.: Fórmula de cálculo do IMC
        IMC = Peso ÷ (Altura × Altura)*/
        
        /*Scanner scann = new Scanner(System.in);
        System.out.println("Digite sua altura:");
        double altura = scann.nextDouble();
        
        System.out.println("Digite seu peso:");
        double peso = scann.nextDouble();
        
        double imc = peso / (altura * altura);
        System.out.println("Seu IMC é :"  + imc);
        
        if (imc <= 18.5) {
            System.out.println("Magreza");
        }
        else if (imc > 18.5 && imc <= 24.9) {
            System.out.println("Normal");
        }
        else if (imc > 25 && imc <= 29.9) {
            System.out.println("Sobrepeso");
        }
        else if (imc > 30 && imc <= 39.9) {
            System.out.println("Obesidade");
        }*/
        
        /*
        6)  Faça um programa em Java que receba como entrada
        um número do usuário e imprima o cálculo da sua tabuada 
        começando no número 0 até o 10. Utilize for ou while. 
         **Desafio, tente fazer o mesmo algoritmo que não
        precise receber a entrada do usuário e imprima a 
        tabuada do 1 até o 10. 


        */
        
       /* Scanner scann = new Scanner(System.in);
        System.out.println("Digite o número que deseja realizar a tabuada:");
        
        int n = scann.nextInt();
        
        System.out.println("Tabuada do: " + n);*/
        
        /*for (int i = 0; i <= 10; i++) {
            System.out.println( n + " x "  + i + "=" + n * i );
        }*/
        
      /*  int i = 0;
        while(i <=10){
              System.out.println( n + " x "  + i + "=" + n * i );
              i = i+1;
        }*/
      
        /*for (int i = 1; i <= 1000000; i++) {
            System.out.println("Tabuada do: " + i);
            for (int j = 0; j <= 10; j++) {
                System.out.println(i + " x " + j + " = " + i * j );
            }
        }*/
        
        /*
        Faça um algoritmo que imprima os valores 
        de 0 a 200 de forma decrescente.
        */
        
        /*for (int i = 200; i >= 0; i--) {
            System.out.println(i);
        }*/
        
        int i = 0;
        
        /*while (i <= 10) {
            System.out.println("Tabuada do: " + i);
            int j = 0;
            while (j <= 10){
                System.out.println(i + " x " + j + " = " + i * j );
                j++;
            }
            
            i++;
        }*/
        
        int j = 0;
        System.out.println(j++);
                System.out.println(j);
        
                System.out.println("----------");
        int t = 0;
        System.out.println(++t);
        System.out.println(t);
    }
        
    

}

