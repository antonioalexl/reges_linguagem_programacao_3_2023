/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosrevisaoprova1;

/**
 *
 * @author Alex
 */
public class Funcionario {
  String nome;
  double salario;
  
  void reajustarSalario(double percentual) {
    salario = salario + (salario * percentual / 100);
  }
  
  void exibirDados() {
    System.out.println("Nome: " + nome);
    System.out.println("Salario: " + salario);
  }
}

