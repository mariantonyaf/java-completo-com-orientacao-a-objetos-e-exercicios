package secao10;

import java.util.Arrays;
import java.util.ArrayList;

public class Arrays2D {
    public static void main(String[] args) {

        // 9 - arrays 2d (matrizes)
        // [[1,2,3], [2,3]]
        // array[0][1]

        int[][] matriz = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        System.out.println(matriz[1][2]);

        // criando array vazio e preenchendo

        int[][] tabela = new int[3][3];

        tabela[0][0] = 10;
        tabela[1][1] = 20;
        tabela[2][2] = 30;

        for(int[] linha : tabela) {
            System.out.println(Arrays.toString(linha));
        }

        int[][] grade = new int[4][5];

        for(int m = 0; m < grade.length; m++) {
            for(int n = 0; n < grade[m].length; n++) {
                grade[m][n] = m * n;
            }
        }

        for(int[] linha : grade) {
            System.out.println(Arrays.toString(linha));
        }
    }
}
