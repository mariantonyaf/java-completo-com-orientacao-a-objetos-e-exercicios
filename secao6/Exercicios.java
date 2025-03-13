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

        System.out.println(parOuImpar(2));

        /*
        EXERCÍCIOS 4:
        Crie uma função que receba uma nota de 0 a 100 e retorne uma
        classificação de letra (A, B, C, D, F) usando switch.
        Inclua uma verificação para garantir que a nota está dentro
        do intervalo válido.
        */

        System.out.println(nota(8));

        /*
        EXERCÍCIO 5:
        Crie uma função que receba a idade de uma pessoa.
        Se a idade for menor que 18, use System.exit(0) para encerrar
        o programa com uma mensagem de "Acesso negado".
        Caso contrário, exiba "Acesso permitido".
        */

        idadePessoa(22);

        /*
        EXERCÍCIO 6:
        Crie uma função que receba um array de inteiros e retorne
        o maior número presente no array.
        Utilize um loop para percorrer os elementos do array e 
        identificar o maior valor.
        */

        int[] numeros = {10, 5, 100, 22, 44, 5};
        System.out.println(encontrarMaior(numeros));
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

    public static String parOuImpar (int num) {
        if (num % 2 == 0) {
            return "Par";
        } else {
            return "Ímpar";
        }
    }

    public static String nota (int n) {
        if (n < 0 || n > 10) {
            return "Nota inválida!";
        }

        switch (n) {
            case 10:
            case 9:
                return "A";
            case 8:
                return "B";
            case 7: 
                return "C";
            case 6:
                return "D";
        
            default:
                return "F";
        }
    }

    public static void idadePessoa (int idade) {
        if (idade < 18) {
            System.out.println("Acesso negado!");
            System.exit(0);
        }
            
        System.out.println("Acesso permitido!");
    }

    public static int encontrarMaior (int[] numeros) {
        int maior = numeros[0];

        //contador, cond. execução, incremento
        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
        }

        return maior;
    }
}
