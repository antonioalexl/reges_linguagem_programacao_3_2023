/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula05.correcao;

/**
 *
 * @author Alex
 */
public class Contato {
    
    public String nome;
    
    public String telefone;
    
    public String email;
    
    public String endereco;
    
    
    public void imprimir(){
    
     
        System.out.println("Nome:"  + nome);
        System.out.println("Email:"  + email);
        System.out.println("Endereco:"  + endereco);        
        System.out.println("Telefone:"  + telefone);
    }
    /*
    Crie o projeto Aula05 e crie uma classe Contato com os seguinte atributos: nome, telefone, email e endereco (string) e faça os itens abaixo: 

a) Crie uma classe chamada Principal e dentro dela faça o método main para usar seus objetos. Ex.: public static void main(String[] args) {   //SEU CÓDIGO AQUI       }

b) No método main, crie 4 objetos do tipo Contato, onde cada objeto deve guardar os dados de 4 contatos seu.

c)Também no método main, exiba todos os dados de todos os 4 contatos criados no console.
    */
}
