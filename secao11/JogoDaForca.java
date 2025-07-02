package secao11;

/*
    1 - Importar Scanner: Importar a classe Scanner para capturar
    a entrada do usuário.
         
    2 - Definir Palavra Secreta: Criar uma variável palavraSecreta
    com a palavra a ser adivinhada e inicializar um array palavraOculta
    com caracteres de sublinhado _ para representar a palavra oculta.
        
    3 - Configurar Tentativas: Definir o número máximo de tentativas e uma
    variável para verificar se o usuário venceu.
        
    4 - Loop Principal: Criar um loop que continua enquanto houver tentativas
    restantes.
        
    5 - Exibir Status: Mostrar a palavra oculta e o número de tentativas
    restantes. Solicitar a entrada do usuário para uma letra.

    6 - Verificar Letra: Comparar a letra inserida com a palavra secreta.
    Atualozar a palavra oculta se a letra for correta.
    Diminuir o número de tentativas se a letra for incorreta.

    7 - Verificar Vitória: Verificar se a palavra oculta corresponde à
    palavra secreta e sair do loop se o usuário vencer.

    8 - Finalizar Jogo: Exibir mensagem de vitória ou derrota e mostrar a
    palavra secreta.

    9 - Fechar Scanner: Fechar o Scanner para liberar recursos.
    */

import java.util.Scanner;
import java.util.Arrays;

public class JogoDaForca {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // definir a palavra a ser adivinhada
        String palavraSecreta = "Java";

        char[] palavraOculta = new char[palavraSecreta.length()];

        for(int i = 0; i < palavraSecreta.length(); i++) {
            palavraOculta[i] = '_';
        }

        System.out.println(Arrays.toString(palavraOculta));

        // número máximo de tentativas
        int tentativas = 6;
        boolean venceu = false;

        // loop que solicita as letras para o usuário
        while (tentativas > 0) {
            System.out.println("Palavra: " + String.valueOf(palavraOculta));
            System.out.println("Tentativas restantes: " + tentativas);
            System.out.println("Digite uma letra: ");
            char letra = scanner.next().toUpperCase().charAt(0);
            System.out.println(letra);

            boolean acertou = false;

            for(int i = 0; i < palavraSecreta.length(); i++) {
                if(palavraSecreta.charAt(i) == letra) {
                    palavraOculta[i] = letra;
                    acertou = true;
                }
            }

            System.out.println(String.valueOf(palavraOculta));

            tentativas --;
        }

        scanner.close();
    }
}
