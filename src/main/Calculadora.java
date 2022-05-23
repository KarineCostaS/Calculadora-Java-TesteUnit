package main;

import util.Acoes;

import java.util.Locale;
import java.util.Scanner;

public class Calculadora {

    public static void main(String[] args) {
        Acoes acoes = new Acoes();

        Scanner scanner = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        int opcao = -1;

        double numeroA, numeroB;
        while (true) {

            System.out.println("Digite uma opção: 1 - Soma, 2 - Subtracao, 3 - Multiplicacao, 4 - Divisao, 5 - Exponencial, 6 - Raiz Quadrada, 7 - Piso, 8 - Teto, 9 - Sair");
            opcao = (int) scanner.nextFloat();

            if (opcao == 0)
                break;
            System.out.println("Digite o primeiro numero: ");
            numeroA = scanner.nextFloat();

            System.out.println("Digite o segundo numero: ");
            numeroB = scanner.nextFloat();

            switch (opcao) {
                case 1:{
                    System.out.println(Acoes.soma(numeroA, numeroB));

                    break;
                }
                case 2:{
                    System.out.println(Acoes.subtracao(numeroA, numeroB));

                    break;
                }
                case 3:{
                    System.out.println(Acoes.multiplicacao(numeroA, numeroB));

                    break;
                }
                case 4:{
                    System.out.println(Acoes.divisao(numeroA, numeroB));

                    break;
                }
                case 5:{

                    System.out.println(Acoes.exponencial(numeroA, numeroB));

                    break;
                }
                case 6:{
                    System.out.println(Acoes.raizQuadrada(numeroA));

                    break;
                }
                case 7:{
                    System.out.println(Acoes.piso(numeroA));

                    break;
                }
                case 8:{
                    System.out.println(Acoes.teto(numeroA));

                    break;
                }
                default:
                    System.out.println("Digite um numero entre 0 e 4");
                    break;
            }
        }
        scanner.close();
    }
}
