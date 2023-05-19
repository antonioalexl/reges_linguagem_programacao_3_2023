/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.exercicios;

/**
 *
 * @author Alex
 */
public abstract class Animal {
    private String nome;
    private int idade;
    
    // Construtor
    public Animal(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    
    // Método para emitir som genérico do animal
    public void emitirSom() {
        System.out.println("O animal emite um som.");
    }
}

