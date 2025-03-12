package secao4;

public class CondicionaisDois {
    public static void main(String[] args) {
        // 1 - Condicional ternária

        int numero = 11;

        String resultado = (numero % 2 == 0) ? "Par" : "Ímpar";

        System.out.println(resultado);

        /* CONDIÇÃO X > 5 ? EXPRESSÃO SE É TRUE "Ok" : EXPRESSÃO SE É
        FALSE "Não ok" */

        // 2 - If e else aninhado
        int idade = 25;
        boolean temCarteira = false;

        if (idade >= 18) {
            if (temCarteira) {
                System.out.println("Pode dirigir!");
            } else {
                System.out.println("Precisa ter a habilitação para dirigir!");
            }
        } else {
            System.out.println("Você não pode dirigir ainda!");
        }
    }
}
