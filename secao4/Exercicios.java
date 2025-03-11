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
        scanner.nextLine();

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
        
        */

        scanner.close();
    }
}
