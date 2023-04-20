/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exerciciosrevisaoprova1;

/**
 *
 * @author Alex
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.marca = "Chevrolet";
        carro.modelo = "Cruze";
        carro.ano = 2022;
        carro.cor = "Preto";
        carro.ligar();
        carro.ligar();
        carro.acelerar(50);
        carro.acelerar(30);
        carro.desligar();
        carro.desligar();

        System.out.println("-----------------");

        Funcionario funcionario1 = new Funcionario();
        funcionario1.nome = "João";
        funcionario1.salario = 2000;
        funcionario1.reajustarSalario(10);
        funcionario1.exibirDados();
        System.out.println("-----------------");
        Banco banco1 = new Banco(5000);
        Banco banco2 = new Banco(10000);

        banco1.depositar(1000);
        banco1.sacar(2000);
        banco1.transferir(1500, banco2);

        banco1.exibirSaldo();
        banco2.exibirSaldo();

        System.out.println("-----------------");

        Diversos diversos = new Diversos();
        diversos.positivoNegativo(15);
        diversos.positivoNegativo(-15);
        diversos.positivoNegativo(0);

        System.out.println("-----------------");
        diversos.intervaloDoisInteiros(15, 50);

        System.out.println("-----------------");
        diversos.tabuada0a100();

        System.out.println("-----------------");
        Calculadora calc = new Calculadora();
        double resulSoma = calc.somar(2, 4);
        System.out.println("Resultado Soma: " + resulSoma);

        double resulDiv = calc.dividir(20, 2);
        System.out.println("Resultado Soma: " + resulDiv);

        double resulMult = calc.multiplicar(3, 888);
        System.out.println("Resultado Soma: " + resulMult);

        double resulSub = calc.subtrair(15555, 5555);
        System.out.println("Resultado Soma: " + resulSub);
        System.out.println("-----------------");

        TV tv = new TV();
        tv.ligar();

        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();
        tv.aumentarVolume();

        tv.trocarCanal(15);
        tv.trocarCanal(55);
        tv.desligar();

        System.out.println("-----------------");
        AdivinheNumero adivinheNumero = new AdivinheNumero();
        adivinheNumero.tentar();

        System.out.println("-----------------");

    }

}
