package secao2;

public class Variavel {
    public static void main(String[] args) {
        // 1 - O que são variáveis?
        // tipo -> nome -> atribuir um valor;
        String nome = "Maria Antonya";

        // nome => "Maria Antonya"
        System.out.println(nome);

        // 2 - Atribuição de variável com outra.
        String teste = "Teste";
        String testando = teste;

        System.out.println(testando);

        long numeroGrande = 9999999999999999L;

        System.out.println(numeroGrande);

        // 3 - Comentários
        /*
        Teste 1
        Teste 2
        Teste 3
         */

         // 4 - Strings
         String firstName = "Maria Antonya";
         String lastName = "Fernandes da Silva";

         System.out.println(firstName + " " + lastName);
         System.out.println("O nome dela é: " + firstName + " " + lastName);

         String fullName = firstName + " " + lastName;

         System.out.println(fullName);

         // 5 - Char
         char letra = 'M';

         System.out.println(letra);

         char simbolo = '%';

         System.out.println(simbolo);

         // 6 - Int 
         int n = 42;

         System.out.println(n);
         System.out.println(n + 5);
         System.out.println(n * 15);
    }
}
