/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

/**
 *
 * @author Alex
 */
public class Produto {

    public Produto(String nome, double quantidade, String codigoBarra, double valorCusto, double valorVenda, String marca, String ncm, Fornecedor fornecedor) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.codigoBarra = codigoBarra;
        this.valorCusto = valorCusto;
        this.valorVenda = valorVenda;
        this.marca = marca;
        this.ncm = ncm;
        this.fornecedor = fornecedor;
    }
    
    private String nome;
    private double quantidade;
    private String codigoBarra;
    private double valorCusto;
    private double valorVenda;
    private String marca;
    private String ncm;
    
    private Fornecedor fornecedor;
    
}
