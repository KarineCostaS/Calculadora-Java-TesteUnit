package util;

import static java.lang.Math.sqrt;

public class Acoes {

    public static double soma(double numeroA, double numeroB) {
        return numeroA + numeroB;

    }

    public static double subtracao(double numeroA, double numeroB) {
        return numeroA - numeroB;
    }

    public static double multiplicacao(double numeroA, double numeroB){
        return numeroA * numeroB;
    }

    public static double divisao(double numeroA, double numeroB){
        return numeroA / numeroB;
    }

    public static double exponencial(double numeroA, double numeroB){
        return Math.pow(numeroA, numeroB);
    }

    public static double raizQuadrada(double numeroA){
        if (numeroA >= 0)
            return sqrt(numeroA);
        else {
            throw new IllegalArgumentException();
        }
    }
    public static double piso(double numeroA){
        return Math.floor(numeroA);
    }
    public static double teto(double numeroA){
        return Math.ceil(numeroA);
    }
}

