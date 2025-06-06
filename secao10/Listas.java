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
    }
}
