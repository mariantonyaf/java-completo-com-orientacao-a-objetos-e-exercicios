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
    }
}
