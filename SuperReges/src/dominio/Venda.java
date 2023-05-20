/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dominio;

import java.util.ArrayList;
import java.util.Calendar;

/**
 *
 * @author Alex
 */
public class Venda {
    
    private Cliente cliente;
    private Funcionario funcionario;
    private int numeroVenda;
    private Calendar dataVenda;
    
    private ArrayList<Produto> Produtos;
    private double valorVenda;

    public Venda(Cliente cliente, Funcionario funcionario, int numeroVenda, Calendar dataVenda, ArrayList<Produto> Produtos, double valorVenda) {
        this.cliente = cliente;
        this.funcionario = funcionario;
        this.numeroVenda = numeroVenda;
        this.dataVenda = dataVenda;
        this.Produtos = Produtos;
        this.valorVenda = valorVenda;
    }
    
}
