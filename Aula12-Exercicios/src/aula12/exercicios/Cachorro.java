/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula12.exercicios;

/**
 *
 * @author Alex
 */
public class Cachorro extends Animal {
    private String raca;
    
    // Construtor
    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }
    
    // Método para emitir som do cachorro
    @Override
    public void emitirSom() {
        System.out.println("Au au!");
    }
}


