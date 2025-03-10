package secao2;

public class Exercicios {
    public static void main(String[] args) {
        /* 
        EXERCÍCIO 1:
        Crie uma variável int para armazenar o valor 10.
        Crie uma segunda variável int que armazene o dobro do valor 
        da primeira variável usando operadores aritméticos.
        Exiba o resultado.
        */

        int valor = 10;
        int valorDobro = valor * 2;

        System.out.println("1) Resultado: " + valorDobro);

        /* 
        EXERCÍCIO 2:
        Declare uma variável char que armazene a letra 'B'.
        Faça o casting explícito dessa variável para int e exiba o valor
        numérico correspondente.
        */

        char letraChar = 'B';
        int letraInt = (int) letraChar;

        System.out.println("2) Resultado: " + letraInt);

        /*
        EXERCÍCIO 3:
        Declare duas variáveis double para armazenar os valores 15.75 e
        20.40.
        Some os valores dessas variáveis e armazene o resultado em uma
        nova variável double.
        Exiba o resultado.
        */

        double valor1 = 15.75;
        double valor2 = 20.40;
        double soma = valor1 + valor2;

        System.out.println("3) Resultado: " + soma);

        /*
        EXERCÍCIO 4:
        Declare uma variável long para armazenar o número 2 bilhões
        (2_000_000_000).
        Em seguida, declare uma variável int e faça o castingo explícito
        do valor long para int.
        Exiba o resultado. 
        */

        long numeroLong = 2_000_000_000;
        int numeroInt = (int) numeroLong;
    
        System.out.println("4) Resultado: " + numeroInt);

        /*
        EXERCÍCIO 5:
        Escreva um programa que crie uma variável String com o valor
        "Olá, Mundo!".
        Em seguida, crie outra variável String que concatene a primeira
        variável com o texto " Bem vindo ao Java!".
        Exiba o resultado.
        */

        String texto1 = "Olá, Mundo!";
        String texto2 = texto1 + " Bem vindo ao Java!";

        System.out.println("5) resultado: " + texto2);
    }
}
