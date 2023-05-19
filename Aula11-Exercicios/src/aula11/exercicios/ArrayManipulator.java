/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11.exercicios;

/**
 *
 * @author Alex
 */
public class ArrayManipulator {
    
    public  int encontrarMaiorValor(int[] array) {
        int maior = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }

    public  int encontrarMenorValor(int[] array) {
        int menor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }

    public  double calcularMedia(int[] array) {
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        return (double) soma / array.length;
    }
}
