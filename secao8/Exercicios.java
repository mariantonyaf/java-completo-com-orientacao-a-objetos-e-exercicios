package secao8;

public class Exercicios {
    public static void main(String[] args) {
        /*
        EXERCÍCIO 1:
        Crie um programa que use um loop for para calcular o somatório
        dos números de 1 a 100 e exiba o resultado.
        */

        // int somatorio = 0;
        // for (int x = 0; x <= 100; x++) {
        //     somatorio += x;
        // }

        // System.out.println("Soma de 1 a 100: " + somatorio);

        /*
        EXERCÍCIO 2:
        Desenvolva um programa que use um loop while para imprimir
        todos os números pares de 1 a 20.
        */

        // int i = 1;

        // while (i <= 20) {

        //     if (i % 2 == 0) {
        //         System.out.println(i);
        //     }

        //     i++;
        // }

        /*
        EXERCÍCIO 3:
        Escreva um programa que receba um número do usuário e use um 
        loop for para verificar se ele é primo.
        */

        /* int numPrimo = 29;
        boolean ePrimo = true;

        // Testar se ele é primo mesmo
        for (int i = 2; i < numPrimo; i++) {
           // Dividir e não ter resto, ele não é primo
            // 1 e por ele msm

            if (numPrimo % i == 0) {
                ePrimo = false;
                break;
            }
        }

        if (ePrimo) {
            System.out.println("O número " + numPrimo + " é primo!");
        } else {
            System.out.println("O número " + numPrimo + " não é primo!");
        } */

        /*
        EXERCÍCIO 4:
        Crie um programa que exiba um menu interativo usando do-while,
        parmitindo ao usuário escolher opções até que ele decida sair.
        */

        /* int opcao;

        do {
            System.out.println("Exercício 4 - Menu");
            System.out.println("0) Refrigerante");
            System.out.println("1) Hamburguer");
            System.out.println("2) Cachorro quente");
            System.out.println("3) Sushi");
            System.out.println("4) Sair");

            opcao = (int)(Math.random() * 5);

            System.out.println("A opção escolhida foi: " + opcao);
        } while (opcao != 4); */

        /*
        EXERCÍCIO 5:
        Desenvolva um programa que calcule o fatorial de um número
        inteiro positivo usando um loop for.
        */

        /* int numFatorial = 4;
        int fatorial = 1;

        for(int i = 1; i <= numFatorial; i++) {
            fatorial *= i;
        } 

        System.out.println("O fatorial de " + numFatorial + " é igual a " + fatorial); */

        /*
        EXERCÍCIO 6:
        Contagem de dígitos de um número com while.
        */

        int numeroParaContar = 256487562;
        int contador = 0;

        while (numeroParaContar != 0) {
            
            numeroParaContar = numeroParaContar / 10;

            contador++;
        }

        System.out.println("Numero de digitos: " + contador);
    }
}
