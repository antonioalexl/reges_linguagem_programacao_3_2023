/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13.exercicios;

/**
 *
 * @author Alex
 */
public class Gerente extends Funcionario {

    private String senha;

    public Gerente(String nome) {
        super(nome);
    }

    public Gerente(String nome, String endereco, String email) {
        super(nome, endereco, email);
    }

    public Gerente(String nome, String endereco, double salario) {
        super(nome, endereco, salario);
    }

    public Gerente(String nome, String endereco, double salario, String email) {
        super(nome, endereco, salario, email);
    }

    public Gerente(String nome, String endereco, double salario, String email, String senha) {
        super(nome, endereco, salario, email);
        this.senha = senha;
    }

    @Override
    public void aumentarSalario(double pAumento) {

        double valor = (this.getSalario() + pAumento) * 1.50;
        this.setSalario(valor);
        System.out.println("O salário após o aumento é:" + this.getSalario());
    }

}
