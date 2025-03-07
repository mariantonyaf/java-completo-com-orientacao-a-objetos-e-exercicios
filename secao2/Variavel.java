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

         // 7 - Long
         long populacaoMundial = 7800000000000L;

         System.out.println(populacaoMundial);

         long grandeNumero = 1_000_000L;

         System.out.println(grandeNumero + 100);

         // 8 - Double
         double preco = 19.99;

         System.out.println(preco);
         System.out.println(preco + 65.87);
         System.out.println(preco + 54);
         System.out.println(preco / 5);

         // 9 - OP.  aritmeticos p1
         int soma = 10 + 5;

         System.out.println(soma);
         System.out.println(soma / 2.0);
         System.out.println(soma % 2); // % resto

         
    }
}
