/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05.correcao;

/**
 *
 * @author Alex
 */
public class Corretora {
    
    public int numero;
    public String agencia;
    public String titular;
    public double saldo;
    
    public void depositar(double valor){
        this.saldo = saldo + valor;
    }
    
    public void sacar(double valor){
        if (this.saldo < valor) {
            System.out.println("Saldo insuficiente");
        }
        else{
            saldo = saldo - valor;
        }               
    }
    
    public void investir()
    {
        this.saldo = saldo * 1.05;
    }
    
    public void imprimir(){
        System.out.println("Agência = " + this.agencia);
        System.out.println("Número = " + this.numero);
        System.out.println("Titular = " + this.titular);
        System.out.println("Saldo = " + this.saldo);
    }
    /*
    número(int), agencia (string), titular (string) e agencia (string) e saldo (double). Implemente os métodos
    */
}
