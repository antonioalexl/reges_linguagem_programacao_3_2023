/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosrevisaoprova1;

/**
 *
 * @author Alex
 */
public class Banco {
    private double saldo;

    public Banco(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor invalido para deposito.");
        } else {
            saldo += valor;
            System.out.println("Deposito realizado com sucesso. Saldo atual: R$ " + saldo);
        }
    }

    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Valor inválido para saque.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar o saque. Saldo atual: R$ " + saldo);
        } else {
            saldo -= valor;
            System.out.println("Saque realizado com sucesso. Saldo atual: R$ " + saldo);
        }
    }

    public void transferir(double valor, Banco destino) {
        if (valor <= 0) {
            System.out.println("Valor invalido para transferência.");
        } else if (valor > saldo) {
            System.out.println("Saldo insuficiente para realizar a transferencia. Saldo atual: R$ " + saldo);
        } else {
            saldo -= valor;
            destino.depositar(valor);
            System.out.println("Transferencia realizada com sucesso. Saldo atual: R$ " + saldo);
        }
    }

    public void exibirSaldo() {
        System.out.println("Saldo atual: R$ " + saldo);
    }
}