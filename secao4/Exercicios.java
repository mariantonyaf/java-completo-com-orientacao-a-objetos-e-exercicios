package secao4;

import java.util.Scanner;

public class Exercicios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
        EXERCÍCIO 1:
        Peça ao usuário para inserir o preço de um produto.
        Se o preço for menor que 50, categorize como "Barato".
        Se estiver entre 50 e 100, categorize como "Médio".
        Se for maior que 100, categorize como "Caro".
        Exiba a categoria correspondente.
        */

        System.out.println("Insira o preço do produto:");
        double preco = scanner.nextDouble();

        if (preco < 50) {
            System.out.println("Barato.");
        } else if (preco >= 50 && preco <= 100) {
            System.out.println("Médio.");
        } else {
            System.out.println("Caro.");
        }

        /*
        EXERCÍCIO 2:
        Peça ao usuário para inserir um nome de usuário e uma senha.
        Verifique se o nome de usuário é "admin" e a senha é "1234".
        Se ambos forem corretos, exiba "Acesso permitido".
        Caso contrário, exiba "Acesso negado".
        */

        System.out.println("\n\nInsira um nome:");
        String nome = scanner.nextLine();

        System.out.println("\nInsira uma senha:");
        int senha = scanner.nextInt();

        if (nome.equals("admin") && senha == 1234) {
            System.out.println("\nAcesso permitido!");
        } else {
            System.out.println("\nAcesso negado!");
        }

        /*
        EXERCÍCIO 3:
        Peça ao usuário para inserir um número.
        Veriique se o número é par ou ímpar, e exiba a palavra "Par" ou
        "Ímpar".
        Use uma String para armazenar o resultado e exibi-la.
        */

        System.out.println("Insira um número:");
        int num = scanner.nextInt();

        String resultado;

        if (num % 2 == 0) {
            resultado = "Par";
        } else {
            resultado = "Ímpar";
        }

        System.out.println(resultado);

        /*
        EXERCÍCIO 4:
        Peça ao usuário para inserir um número de 1 a 7,
        representando os dias da semana (1 para domingo, 2 para segunda,
        ect).
        Use switch para verificar se o dia é um dia útil (seg a sexta) ou
        final de semana (sab e doming).
        Exiba uma mensagem correspondente.
        */

        System.out.println("Insira um número de 1 a 7:");
        int n = scanner.nextInt();

        switch (n) {
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia de semana");
                break;
            default:
                System.out.println("Número inválido!");
                break;
        }

        /*
        EXERCÍCIO 5:
        Peça ao usuário para inserir um número.
        Verifique se o número está no intervalo de 10 a 20, inclusive.
        Se estiver, exiba "Dentro do intervalo". Caso contrário, exiba
        "Fora do intervalo".
        */

        System.out.println("Insira um número:");
        int nu = scanner.nextInt();

        if (nu >= 10 && nu <= 20) {
            System.out.println("Dentro do intervalo.");
        } else {
            System.out.println("Fora do intervalo.");
        }

        /*
        EXERCÍCIO 6:
        Peça ao usuário para inserir uma letra.
        Verifique se a letra é uma vogal (a, e, i, o, u) ou uma
        consoante.
        Exiba "Vogal" ou "Consoante" de acordo com a entrada.
        Considere tanto letras maiúsculas quanto minúsculas.
        */

        System.out.println("Insira uma letra:");
        String letra = scanner.next();

        if (letra.equalsIgnoreCase("a")) {
            System.out.println("Vogal");
        } else if (letra.equalsIgnoreCase("e")) {
            System.out.println("Vogal");
        } else if (letra.equalsIgnoreCase("i")) {
            System.out.println("Vogal");
        } else if (letra.equalsIgnoreCase("o")) {
            System.out.println("Vogal");
        } else if (letra.equalsIgnoreCase("u")) {
            System.out.println("Vogal");
        } else {
            System.out.println("Consoante");
        }

        // ou

        System.out.println("Insira uma letra:");
        char letra2 = scanner.next().toLowerCase().charAt(0);
        // charAt pega apenas o primeiro caractere e ignora o resto.

        switch (letra2) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vogal");
                break;
        
            default:
                System.out.println("Consoante");
                break;
        }

        scanner.close();
    }
}
