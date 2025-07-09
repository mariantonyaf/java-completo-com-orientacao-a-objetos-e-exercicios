import java.util.Random;
import java.util.Arrays;

public class Bilhete {
    private int[] numerosEscolhidos;
    private int[] resultadoSorteio;

    public Bilhete(int[] numerosEscolhidos) {
        this.numerosEscolhidos = numerosEscolhidos;
    }

    // método para realizar o sorteio
    public void realizarSorteio() {
        Random random = new Random();

        resultadoSorteio = new int[6];

        for(int i = 0; i < resultadoSorteio.length; i++) {
            resultadoSorteio[i] = random.nextInt(60) + 1;
        }

        Arrays.sort(resultadoSorteio);
    }

    // método para contar quantos números o jogador acertou
    public int contarAcertos() {
        int acertos = 0;


        return acertos;
    }

    // exibir os resultados
}
