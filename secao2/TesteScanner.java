package secao2;

import java.util.Scanner;

public class TesteScanner {
    public static void main(String[] args) {
        // 1 - Classe Scanner
        // nextLine(): Lê uma linha inteira de texto;
        // nextInt(): Lê um valor inteiro;
        // nextDouble(): Lê um valor decimal (ponto flutuante);
        // next(): Lê uma única palavra;
        Scanner scanner = new Scanner(System.in);

        // Mensagem para o usuario entender que precisa digitar
        System.out.println("Digite seu nome: ");
        // Resgata o valor do terminal
        String nome = scanner.nextLine();

        // Exibe o valor
        System.out.println("Olá, " + nome + "!");

        
        System.out.println("\nAgora, digite sua idade: ");
        int idade = scanner.nextInt();

        System.out.println("Sua idade é: " + idade + '.');

        // 3 - Problema do nextLine
        System.out.println("\n\nDigite um número: ");
        int x = scanner.nextInt();

        /* 
        Quando o usuario entrar primeiro com números e depois com
        texto, tem que colocar um nextLine vazio dps de pegar as 
        informações do nextInt. 
        */
        scanner.nextLine();

        System.out.println("Digite um texto: ");
        String txt = scanner.nextLine();

        System.out.println("Os dados são, x = " + x + " e txt = " + txt);

        // Fechamento do scanner, para evitar memory leak
        scanner.close();
    }
}
