/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aula05.correcao;

/**
 *
 * @author Alex
 */
public class Aula05Correcao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Contato contato1 = new Contato();
        contato1.email = "antonio.alex@hotmail.com";
        contato1.endereco = "Rua da Faculdade";
        contato1.nome = "Nome 1";
        contato1.telefone = "16993300758";
        
       /* System.out.println("Contato 1 ");
        System.out.println("Nome:"  + contato1.nome);
        System.out.println("Email:"  + contato1.email);
        System.out.println("Endereco:"  + contato1.endereco);        
        System.out.println("Telefone:"  + contato1.telefone);*/
        
        System.out.println("----------");
        contato1.imprimir();
        
        
        Contato contato2 = new Contato();
        contato2.email = "antonio.alex@hotmail.com";
        contato2.endereco = "Rua da Faculdade";
        contato2.nome = "Nome 2";
        contato2.telefone = "16993300758";
        
       /* System.out.println("Contato 2 ");
        System.out.println("Nome:"  + contato2.nome);
        System.out.println("Email:"  + contato2.email);
        System.out.println("Endereco:"  + contato2.endereco);        
        System.out.println("Telefone:"  + contato2.telefone);*/
        
        System.out.println("----------");
        contato2.imprimir();
        
        
        Contato contato3 = new Contato();
        contato3.email = "antonio.alex@hotmail.com";
        contato3.endereco = "Rua da Faculdade 3";
        contato3.nome = "Nome 3";
        contato3.telefone = "16993300758";
        contato3.imprimir();
        
       /* System.out.println("Contato 3 ");
        System.out.println("Nome:"  + contato3.nome);
        System.out.println("Email:"  + contato3.email);
        System.out.println("Endereco:"  + contato3.endereco);        
        System.out.println("Telefone:"  + contato3.telefone);
        */
        System.out.println("----------");
        
        Contato contato4 = new Contato();
        contato4.email = "antonio.alex@hotmail.com";
        contato4.endereco = "Rua da Faculdade4" ;
        contato4.nome = "Nome 4";
        contato4.telefone = "16993300758";
        
        contato4.imprimir();
        
      /*  System.out.println("Contato 4 ");
        System.out.println("Nome:"  + contato4.nome);
        System.out.println("Email:"  + contato4.email);
        System.out.println("Endereco:"  + contato4.endereco);        
        System.out.println("Telefone:"  + contato4.telefone);*/
      
      
        
        System.out.println("----------");
        
        
        Corretora corretora = new Corretora();
        corretora.saldo = 100;
        corretora.agencia = "123456";
        corretora.titular = "Sr. Reges";
        corretora.numero =  1;
        
        corretora.sacar(5);
        corretora.imprimir();
        
        corretora.depositar(1);
        corretora.imprimir();
        
        corretora.investir();
        corretora.imprimir();
        
    }
    
}
