/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula12.exercicios;

/**
 *
 * @author Alex
 */
public class Aula12Exercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
         // Criação de um objeto Círculo com raio 5.0 e cor "vermelho"
        Circulo meuCirculo = new Circulo(5.0, "vermelho");
        
        // Cálculo da área e da circunferência do círculo
        double área = meuCirculo.calcularÁrea();
        double circunferência = meuCirculo.calcularCircunferência();
        
        // Exibição dos resultados
        System.out.println("Área do círculo: " + área);
        System.out.println("Circunferência do círculo: " + circunferência);
        
        
        Cachorro cachorro = new Cachorro("Costelinha", 15, "Vira Lato");
        cachorro.emitirSom();
        
        
        Gato gato = new Gato("Felix", 15, "azul");
        gato.emitirSom();
        
        
     /*   Animal animal = new Animal("teste",15);
        animal.emitirSom();*/
    }
    
}
