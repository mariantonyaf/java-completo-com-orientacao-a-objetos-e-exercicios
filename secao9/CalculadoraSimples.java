package secao9;

import java.util.Scanner;

/*
 * Objetivo: Criar uma calculadora que faz soma, multiplicação, divisão e subtração.

 * 1 - Pedir dois números para o usuário (double).
 * 2 - Apresentar uma tabela/texto para escolher a operação.
 * 3 - Resgatar a operação que o usuário selecionou.
 * 4 - Realizar o calculo.
 * 5 - Exibir o resultado.
 * 6 - Se a operação for inválida, exibir mensagem de erro. 

*/

public class CalculadoraSimples {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        double num1 = scanner.nextDouble();

        System.out.println("\nDigite o segundo número: ");
        double num2 = scanner.nextDouble();

        System.out.println("\nEscolha a operação:");
        System.out.println("1 - Soma (+)");
        System.out.println("2 - Subtração (-)");
        System.out.println("3 - Multiplicação (*)");
        System.out.println("4 - Divisão (/)");
        int operacao = scanner.nextInt();

        System.out.println(num1);
        System.out.println(num2);
        System.out.println(operacao);

        scanner.close();
    }
}
