// Projeto tabuada
// Receber um número pelo scanner e exibir a tabuada do mesmo.

package secao3;

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número que você quer ver a tabuada:");
        int num = scanner.nextInt();

        System.out.println("\n" + num + " X 1 = " + (num * 1));
        System.out.println(num + " X 2 = " + (num * 2));
        System.out.println(num + " X 3 = " + (num * 3));
        System.out.println(num + " X 4 = " + (num * 4));
        System.out.println(num + " X 5 = " + (num * 5));
        System.out.println(num + " X 6 = " + (num * 6));
        System.out.println(num + " X 7 = " + (num * 7));
        System.out.println(num + " X 8 = " + (num * 8));
        System.out.println(num + " X 9 = " + (num * 9));
        System.out.println(num + " X 10 = " + (num * 10) + "\n");
    }
}
