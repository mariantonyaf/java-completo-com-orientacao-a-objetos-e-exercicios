package secao6;

public class Exercicios {
    public static void main(String[] args) {
        /*
        EXERCÍCIO 1:
        Crie uma função que converta uma temperatura de Celsius para
        Fahrenheit.
        A função deve receber a temperatura em Celsius como argumento
        e retornar o valor correspondente em Fahrenheit.
        Exiba o resultado encapsulado em uma variável.
        */

        double f = converter(25);
        System.out.println("Grau em Fahrenheit: " + f);

        /*
        EXERCÍCIO 2:
        Crie uma função que calcule o fatorial de um número inteiro.
        Teste a função com um número de sua escolha.
        */

        System.out.println(fatorial(10));

        /*
        EXERCÍCIO 3:
        Crie uma função que receba um número inteiro e retorne uma 
        string indicando se o número é "Par" ou "Ímpar".
        Use condicionais if-else para determinar a paridade.
        */

        /*
        EXERCÍCIOS 4:
        Crie uma função que receba 
        */
    }

    public static double converter (double c) {
        return c * 1.8 + 32;
    }

    public static int fatorial (int num) {
        if (num == 0 || num == 1) {
            return 1;
        } else {
            return num * fatorial(num - 1);
        }
    }
}
