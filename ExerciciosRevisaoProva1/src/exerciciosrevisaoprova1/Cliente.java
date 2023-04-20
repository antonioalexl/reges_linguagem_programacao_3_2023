/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosrevisaoprova1;

/**
 *
 * @author Alex
 */
public class Cliente {
    public String nome;
    public int idade;
    public String endereco;
    public double saldo;

   

    public void realizarCompra(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Compra realizada com sucesso!");
        } else {
            System.out.println("Saldo insuficiente para realizar a compra.");
        }
    }

    public void imprimirDados() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Endereço: " + endereco);
        System.out.println("Saldo: " + saldo);
    }
}
