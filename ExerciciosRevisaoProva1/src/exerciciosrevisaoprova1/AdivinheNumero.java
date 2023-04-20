/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosrevisaoprova1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class AdivinheNumero {    
    
    
    public  void tentar() {
        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int numeroAleatorio = random.nextInt(100) + 1; // Gera um número aleatório entre 1 e 100
        int tentativas = 10;
        
        System.out.println("Tente adivinhar um número entre 1 e 100. Você tem " + tentativas + " tentativas.");
        
        while (tentativas > 0) {
            System.out.print("Tentativa #" + (11 - tentativas) + ": ");
            int numeroEscolhido = scanner.nextInt();
            
            if (numeroEscolhido == numeroAleatorio) {
                System.out.println("Parabéns! Você acertou o número " + numeroAleatorio + " em " + (11 - tentativas) + " tentativas.");
                break;
            } else if (numeroEscolhido < numeroAleatorio) {
                System.out.println("O número é maior que " + numeroEscolhido + ".");
            } else {
                System.out.println("O número é menor que " + numeroEscolhido + ".");
            }
            
            tentativas--;
        }
        
        if (tentativas == 0) {
            System.out.println("Suas tentativas acabaram. O número era " + numeroAleatorio + ".");
        }
        
        scanner.close();
    }
    
}
