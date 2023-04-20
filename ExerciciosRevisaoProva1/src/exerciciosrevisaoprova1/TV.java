/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exerciciosrevisaoprova1;

/**
 *
 * @author Alex
 */
public class TV {
    private boolean ligado;
    private int canal;
    private int volume;

    public TV() {
        ligado = false;
        canal = 1;
        volume = 0;
    }

    public void ligar() {
        ligado = true;
        System.out.println("TV ligada.");
    }

    public void desligar() {
        ligado = false;
        System.out.println("TV desligada.");
    }

    public void aumentarVolume() {
        if (volume < 10) {
            volume++;
            System.out.println("Volume aumentado para " + volume);
        } else {
            System.out.println("Volume máximo atingido.");
        }
    }

    public void reduzirVolume() {
        if (volume > 0) {
            volume--;
            System.out.println("Volume reduzido para " + volume);
        } else {
            System.out.println("Volume minimo atingido.");
        }
    }

    public void trocarCanal(int novoCanal) {
        if (novoCanal >= 1 && novoCanal <= 50) {
            canal = novoCanal;
            System.out.println("Canal trocado para " + canal);
        } else {
            System.out.println("Canal invalido.");
        }
    }
}
