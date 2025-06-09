package secao10;

public class Listas {
    public static void main(String[] args) {
        
        // 1 - Sintaxe

        int[] numeros = {1, 2, 3, 4, 5, 6, 7, 8};
        // {ELEM1, ELEM2, ELEM3...}

        System.out.println("Acessando primeiro elemento: " + numeros[0]);

        // Tamanho fixo, só que vazio
        String[] frutas = new String[3];

        // 0, 1 e 2 => add elementos

        frutas[0] = "Maçã";
        frutas[1] = "Banana";
        frutas[2] = "Mamão";

        System.out.println(frutas[0]);

        // 2 - Loops em arrays

        // Somar todos os elementos de um array;
        // Acessar os elementos e condensar a soma em um var.

        int soma = 0;

        // Length => a qtd de elementos de um array

        for(int i = 0; i < numeros.length; i++) {
            soma += numeros[i];
        }

        System.out.println("Soma dos elementos: " + soma);

        // For each
        // Nomear o item => array
        // Pessoas => Pessoa
        // Frutas => Fruta

        for(String fruta : frutas) {
            System.out.println("Fruta da vez: " + fruta);
        }

        // Encontrar o maior valor de array

        int[] valores = {10, 25, 8, 22, 1};

        int maiorValor = valores[0];

        int j = 0;

        while(j < valores.length) {
            if(valores[j] > maiorValor) {
                maiorValor = valores[j];
            }
            j++;
        }
        System.out.println("Maior valor: " + maiorValor);
    }
}
