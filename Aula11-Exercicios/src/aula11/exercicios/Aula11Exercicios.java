/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula11.exercicios;

/**
 *
 * @author Alex
 */
public class Aula11Exercicios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       /*  Conta conta = new Conta();
        conta.setNumero(123);
        conta.setSaldo(1000.0);
        conta.setTitular("João");

        conta.depositar(500.0);
        conta.sacar(200.0);

        System.out.println(conta.getSaldo()); 
        System.out.println(conta.getTitular()); 
        
        
         Circulo circulo = new Circulo();
        circulo.setRaio(5.0);

        System.out.println(circulo.calcularArea()); 
        System.out.println(circulo.calcularPerimetro()); */
        
        
         int[] array = {5, 10, 15, 20, 25};
         
         ArrayManipulator man = new ArrayManipulator();
         
        int maiorValor = man.encontrarMaiorValor(array);
        int menorValor = man.encontrarMenorValor(array);
        double media = man.calcularMedia(array);

        System.out.println("Maior valor: " + maiorValor); 
        System.out.println("Menor valor: " + menorValor); 
        System.out.println("Média: " + media); 
         

       /* Pessoa p = new Pessoa();
        p.setNome("Super Reges");

        System.out.println(p.getNome());

        Pessoa p1 = new Pessoa();
        p1.setNome("Tony Stark");

        System.out.println(p1.getNome());

        Pessoa p2 = new Pessoa();
        p2.setNome("Steve Rogers");

        System.out.println(p2.getNome());

        Pessoa p3 = new Pessoa();
        p3.setNome("Bruce Wayne");

        System.out.println(p3.getNome());
        
        
        Pessoa p4 = new Pessoa();
        p4.setNome("Bruce Banner");
        
        System.out.println(p4.getNome());*/

    }

}
