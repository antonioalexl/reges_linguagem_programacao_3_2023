/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosrevisaoprova1;

/**
 *
 * @author Alex
 */
public class Diversos {
    
    /*
    Escreva um programa que recebe um número inteiro como entrada e verifica se é positivo, 
    negativo ou zero. Use a estrutura de controle if/else.
    */
    public void positivoNegativo(int valor)
    {
    
        if (valor < 0) {
            System.out.println("O numero: " + valor + " e negativo" );
        }
        else if(valor > 0)
        {
            System.out.println("O numero: " + valor + " e positivo" );
        }
        else
        {
          System.out.println("O numero e 0" );
        }                                  
    }
    
    /*  
        Escreva um programa que recebe dois números inteiros como entrada e
        imprime todos os números inteiros entre eles, inclusive. Use a estrutura de repetição for.        
    */
    
    public void intervaloDoisInteiros(int n1, int n2)
    {
        for (int i = n1; i <= n2; i++) {
            System.out.println("Intervalo entre: " + n1 + " e " + n2 + " e:" + i );
        }
    }
    
    /*Faça uma algoritmo em java que imprima as tabuadas dos números pares de 0 a 100.  */
    public void tabuada0a100()
    {
        for (int i = 0; i < 10; i++) {
            System.out.println("Tabuada do:" + i);
            for (int j = 0; j < 10; j++) {
                System.out.println( i + " x " + j  + " = " + i * j );
            }
        }
    }
}
