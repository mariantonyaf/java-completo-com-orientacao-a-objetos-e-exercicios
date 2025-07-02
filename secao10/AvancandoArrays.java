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

        System.out.println("\nAntes: " + Arrays.deepToString(matriz));

        // ordenação de linhas, por um valor de coluna
        Arrays.sort(matriz, Comparator.comparingInt(a -> a[1]));

        // imprimir matriz, sem foreach
        System.out.println("Depois: " + Arrays.deepToString(matriz));

        // 2 - Manipulação avançada

        // copia
        int[] original = {1, 2, 2, 3};

        int[] copia = Arrays.copyOf(original, 2);

        System.out.println("\n" + Arrays.toString(copia));

        // fill - preenchimento
        int[] numeros = new int[5];

        System.out.println("\n" + Arrays.toString(numeros));

        Arrays.fill(numeros, 5);

        System.out.println(Arrays.toString(numeros));

        // transfromação de array para stream
        int[] values = {1, 2, 3, 4, 5};

        System.out.println("\nElementos: " + Arrays.toString(values));

        // fazer a uma soma dos els
        int sum = Arrays.stream(values).sum();

        System.out.println("Soma dos elementos: " + sum);

        // 3 - Arrays dinamicos

        ArrayList<String> frutas = new ArrayList<>();

        System.out.println("\n" + frutas);

        frutas.add("Maçã");
        frutas.add("Banana");

        System.out.println("Adicionar - " + frutas);

        for(String fruta : frutas) {
            System.out.println(fruta);
        }

        frutas.remove("Banana");

        System.out.println("Remover - " + frutas);

        frutas.remove(0);

        System.out.println("Remover - " + frutas);
    }
}
