package secao8;

public class Loops {
    public static void main(String[] args) {
        // 1 - For
        // Loop que vai rodar de 1 a 5
        for (int i = 1; i <= 5; i++) {
            System.out.println("Contador: " + i);
        }

        // Mostrar cada caractere de uma String
        String palavra = "Java";

        for (int i = 0; i < palavra.length(); i++) {
            System.out.println("Caractere: " + palavra.charAt(i));
        }

        // Contagem regressiva
        for (int i = 5; i >= 1; i--){
            System.out.println("Contador regressivo: " + i);
        }

        // 2 - While
        int i = 1;

        while (i <= 5) {
            System.out.println("While contador: " + i);
            i++;
        }

        int valor = 0;

        while (valor != 7) {
            valor = (int)(Math.random() * 10);

            System.out.println("Valor aleatorio: " + valor);
        }

        // 3 - Do while
        int j = 10;

        do {
            System.out.println("O valor de j é: " + j);
            j--;
        } while (j > 0);

        // 4 - Break em loops
        for (int x = 0; x <= 10; x++) {
            System.out.println("O valor de x é: " + x);

            if (x == 5) {
                System.out.println("Parando o loop...");
                break;
            }
        }

        // 5 - Continue em loops
        for (int x = 10; x > 0; x--) {

            if (x % 2 == 0) {
                System.out.println("Par!");
                continue;
            }

            System.out.println("Contador: " + x);
        }

        // 6 - Nested loops
        for (int m = 1; m <= 3; m++) {
            System.out.println("EXTERNO");

            for (int n = 1; n <= 3; n++) {
                System.out.println(m + " x " + n + " = " + (m * n));
            }
        }

        // Padrão de estrelas
        for (int o = 1; o <= 20; o++) {
            for (int p = 1; p <=o; p++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}