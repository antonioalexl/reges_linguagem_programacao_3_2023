/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosrevisaoprova1;

/**
 *
 * @author Alex
 */
public class Carro {
    public String marca;
    public String modelo;
    public int ano;
    public String cor;
    public boolean ligado;
    public int velocidade;

    public void ligar() {
        if (!ligado) {
            System.out.println("Ligando o carro...");
            ligado = true;
        } else {
            System.out.println("O carro ja esta ligado!");
        }
    }

    public void desligar() {
        if (ligado) {
            System.out.println("Desligando o carro...");
            ligado = false;
            velocidade = 0;
        } else {
            System.out.println("O carro ja esta desligado!");
        }
    }

    public void acelerar(int incremento) {
        if (ligado) {
            velocidade += incremento;
            System.out.println("Acelerando o carro. Velocidade atual: " + velocidade + " km/h");
        } else {
            System.out.println("O carro precisa estar ligado para acelerar!");
        }
    }
}