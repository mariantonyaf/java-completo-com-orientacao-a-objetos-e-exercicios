package secao5;

import java.util.Scanner;

/*
 * 1 - Pedir peso em kg.
 * 2 - Pedir altura em m.
 * 3 - Calcular IMC => peso / (altura * altura).
 * 4 - Exibir classificção.
 * < 18.5 => Abaixo do peso.
 * >= 18.5 e <= 24.9 => Peso normal.
 * >= 25 e < 29.9 => Sobrepeso.
 * Mais que isso: obesidade.
*/

public class Calculadora {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira seu peso em kg:");
        double peso = scanner.nextDouble();

        System.out.println("Insira sua altura em m");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);

        System.out.println("IMC: " + imc);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal");
        } else if (imc >= 25 && imc < 29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }

        scanner.close();
    }
}
