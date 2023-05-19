/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula11.exercicios;

/**
 *
 * @author Alex
 */
public class Pessoa {
 
    private String nome;
    private String documento;
    
    
    public void setNome(String value){
        
        this.nome = value.toUpperCase();
    }
    
     public String getNome(){
        //String retorno = "Nome do Heroi " +  this.nome;
        
        return this.nome;
    }
}
