package secao10;

import java.util.Arrays;
import java.util.ArrayList;

public class Exercicios {
    public static void main(String[] args) {

        /*
        EXERCÍCIO 1:
        Crie um programa que receba um array de inteiros do usuário e
        inverta a ordem dos elementos.
        Exiba o array original e o array invertido.
        */

        int[] arrayOriginal = {1, 2, 3, 4, 5};
        int[] arrayInvertido = new int[arrayOriginal.length];

        for(int i = 0; i < arrayOriginal.length; i++) {
            arrayInvertido[i] = arrayOriginal[arrayOriginal.length - 1 - i];
        }

        System.out.println("EX1 - Array Original: " + Arrays.toString(arrayOriginal));
        System.out.println("EX1 - Array Invertido: " + Arrays.toString(arrayInvertido));

        /*
        EXERCÍCIO 2:
        Desenvolva um programa que receba um array de inteiros e
        determine qual elemento aparece com maior frequência.
        Caso haja empate, exiba todos os elementos empatados.
        */

        int[] arrayInteiros = {1, 2, 3, 4, 4, 4, 5};

        int maisFrequente = arrayInteiros[0];

        int maxContagem = 1;

        for(int i = 0; i < arrayInteiros.length; i++) {
            int contagem = 0;

            for(int j = 0; j < arrayInteiros.length; j++) {
                
                if(arrayInteiros[j] == arrayInteiros[i]) {
                    contagem++;
                }
            }

            if(contagem > maxContagem) {
                maxContagem = contagem;
                maisFrequente = arrayInteiros[i];
            }
        }

        System.out.println("\nEX2 - O mais frequente é: " + maisFrequente + "\n");

        /*
        EXERCÍCIO 3:
        Crie um programa que receba uma matriz 2D e crie a matriz
        transposta (troca de linhas por colunas).
        Exiba a matriz original e a matriz transposta.
        */

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6}
        };

        int[][] matrizTransposta = new int[matriz[0].length][matriz.length];

        for(int i = 0; i < matriz.length; i++) {
            for(int j = 0; j < matriz[0].length; j++) {
                matrizTransposta[j][i] = matriz[i][j];
            }
        }

        for(int[] linha : matrizTransposta) {
            System.out.println("EX3 - " + Arrays.toString(linha));
        }

        /*
        EXERCÍCIO 4:
        Escreva um programa que receba um array de inteiros e 
        substitua todos os valores negativos por zero.
        Exiba o array antes e depois da modificação.
        */

        int[] arrayComNegativos = {1, -2, 3, -4, 5, -6};
        
        System.out.println("\nEX4 - Antes: " + Arrays.toString(arrayComNegativos));

        for(int i = 0; i < arrayComNegativos.length; i++) {
            if(arrayComNegativos[i] < 0) {
                arrayComNegativos[i] = 0;
            }
        }

        System.out.println("EX4 - Depois: " + Arrays.toString(arrayComNegativos));

        /*
        EXERCÍCIO 5:
        Desenvolva um programa que remova os elementos duplicados de
        um array de inteiros, mantendo apenas a primeira ocorrência
        de cada valor.
        Exiba o array original e o array sem duplicatas.
        */

        int[] arrayComDuplicados = {1, 2, 2, 2, 3, 4, 4, 5};

        // array numerico sem qtd de elementos definida
        ArrayList<Integer> arraySemDuplicados = new ArrayList<>();

        for(int numero : arrayComDuplicados) {
            if(!arraySemDuplicados.contains(numero)) {
                arraySemDuplicados.add(numero);
            }
        }

        System.out.println("\nEX5 - Original: " + Arrays.toString(arrayComDuplicados));
        System.out.println("EX5 - Sem Duplicatas: " + arraySemDuplicados);

    }
}
