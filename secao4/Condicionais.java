package secao4;

public class Condicionais {
    public static void main(String[] args) {
        // 1 - O que é boolean?
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(isTrue);
        System.out.println(isFalse);

        // 2 - Operadores de comparação
        int x = 10;

        System.out.println(x == 10);
        System.out.println(x == 9);

        System.out.println(x != 5);
        System.out.println(x != 10);

        System.out.println(x > 10);
        System.out.println(x >= 10);

        System.out.println(x < 10);
        System.out.println(x <= 10);

        // 3 - Camparação de Strings
        String str1 = "Java";
        String str2 = new String("Java");
        String str3 = "JAVA";

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));

        // 4 - Estruturas de condição (if)
        int numero = 10;

        if (numero > 5) {
            System.out.println("O número é maior que 5.");
        }

        // if com string
        String texto = "Teste";

        if (texto.equalsIgnoreCase("Teste")) {
            System.out.println("O texto é: Texte.");
        }

        // 5 - Estruturas de condição (else)
        int q = 9;
        String texto2 = "Teste";

        if (q > 10) {
            System.out.println("Q é maior que 10.");
        } else {
            System.out.println("Insira um número maior que 10.");
        }

        if (texto2.equalsIgnoreCase("Testee")) {
            System.out.println("O texto é: Texte.");
        } else {
            System.out.println("O texto não é igual.");
        }

        // 6 - Estruturas de condição (else if)

    }
}
