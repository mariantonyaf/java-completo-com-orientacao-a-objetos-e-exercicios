package secao10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class AvancandoArrays {
    public static void main(String[] args) {
        
        // 1 - Ordenação

        // ordenação array de inteiros
        int[] numbers = {5, 6, 1, 4, 2, 22, 1};

        System.out.println(Arrays.toString(numbers));

        // modifica o array original
        Arrays.sort(numbers);

        System.out.println(Arrays.toString(numbers));

        // ordenação com comparator
        String[] name = {"João", "Bob", "Pedro", "Marco"};

        System.out.println("\n" + Arrays.toString(name));

        // ordernação inversa
        Arrays.sort(name, Comparator.reverseOrder());

        System.out.println(Arrays.toString(name));

        // ordenação de matriz
        int[][] matriz = {
            {4, 5, 1},
            {3, 8, 9},
            {2, 3, 1}
        };

        for(int[] linha : matriz) {
            System.out.println("Antes: " + Arrays.toString(linha));
        }

        // ordenação de linhas, por um valor de coluna
        Arrays.sort(matriz, Comparator.comparingInt(a -> a[1]));

        for(int[] linha : matriz) {
            System.out.println("Depois: " + Arrays.toString(linha));
        }
    }
}
