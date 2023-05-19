/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula13.exercicios;

/**
 *
 * @author Alex
 */
public class Funcionario {

    private String nome;
    private String endereco;
    private double salario;
    private String email;

    public Funcionario(String nome) {
        this.nome = nome;
    }

    public Funcionario(String nome, String endereco, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
    }

    public Funcionario(String nome, String endereco, double salario) {
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
    }

    public Funcionario(String nome, String endereco, double salario, String email) {
        this.nome = nome;
        this.endereco = endereco;
        this.salario = salario;
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void aumentarSalario(double pAumento) {

        this.salario = salario + pAumento;
        System.out.println("O salário após o aumento é:" + this.salario);
    }

    
   
    /*
    atributos: nome (string), endereco (string), salario (double), email (string) e todos os sets e gets. 
     */
}
