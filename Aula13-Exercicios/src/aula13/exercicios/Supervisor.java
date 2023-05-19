/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13.exercicios;

/**
 *
 * @author Alex
 */
public class Supervisor extends Funcionario {
    
     private String turno;   
    
     public Supervisor(String nome) {
        super(nome);
    }

    public Supervisor(String nome, String endereco, String email) {
        super(nome, endereco, email);
    }

    public Supervisor(String nome, String endereco, double salario) {
        super(nome, endereco, salario);
    }

    public Supervisor(String nome, String endereco, double salario, String email) {
        super(nome, endereco, salario, email);
    }

    public Supervisor(String nome, String endereco, double salario, String email, String turno) {
        super(nome, endereco, salario, email);
        this.turno = turno;
    }
    
      @Override
    public void aumentarSalario(double pAumento) {

        double valor = (this.getSalario() + pAumento) * 1.30;
        this.setSalario(valor);
        System.out.println("O salário após o aumento é:" + this.getSalario());
    }
}
