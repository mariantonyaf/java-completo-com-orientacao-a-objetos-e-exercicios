package secao6;

public class Funcoes {
    public static void main(String[] args) {
        // 1 - Criando a primeira função
        saudacao();

        // 2 - Parâmetros
        soma(50, 5);
        soma(10, 12);

        saudar("Maria Antonya");

        // 3 - return
        dobrar(4);

        int numero = 10;
        int numeroDobrado = dobrar(numero);
        System.out.println("Dobro: " + numeroDobrado);

        System.out.println(dobrar(54));

        // 4 - Retorno em variável
        String r1 = verificarPar(numero);
        String r2 = verificarPar(3);

        System.out.println(r1);
        System.out.println(r2);

        int x = dobrar(soma2(2, 4));

        System.out.println("O dobro da soma é: " + x);
    }

    /* NIVEL DE ACESSO, STATIC => não preciso instanciar classe para 
    executar, TIPO DE RETORONO */
    // NOME, OS PARENTESES (ARGS), BLOCO {}
    public static void saudacao () {
        System.out.println("Primeira função!");
    }

    public static void soma (int a, int b) {
        int resultado = a + b;
        System.out.println("Soma de A + B = " + resultado);
    }

    public static void saudar (String nome) {
        System.out.println("Olá, " + nome + ", tudo bem?");
    }

    public static int dobrar (int n) {
        return n * 2;
    }

    public static String verificarPar (int n) {
        if (n % 2 == 0) {
            return "O número " + n + " é par!";
        } else {
            return "O número " + n + " é ímpar!";
        }
    }

    public static int soma2 (int a, int b) {
        return a + b;
    }
}
