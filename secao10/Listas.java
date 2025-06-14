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

        // 3 - For each

        for(int numero : numeros) {
            System.out.println("O número é: " + numero);
        }

        // Concatenar elementos de um array

        String[] palavras = {"Java", "é", "bom!"};

        String frase = "";

        for(String palavra : palavras) {
            frase += palavra + " ";
        }
        System.out.println(frase);
    
        // Verificar se o valor esta presente em array

        char[] letras = {'a', 'e', 'i', 'o', 'u'};

        char letraProcurada = 'i';

        for(char letra : letras) {

            if(letra == letraProcurada) {
                System.out.println("Encontramos a letra: " + letra); 
                break;
            }
        }

        // 4 - Loops com if 

        // Filtrar e somar numeros pares

        int somaPares = 0;

        for(int numero : numeros) {
            if(numero % 2 == 0) {
                somaPares += numero;
            }
        }
        System.out.println("Soma pares: " + somaPares);

        // Exibir valores maiores que um determinado valor

        int[] nums = {12, 6, 18, 24, 48, 5};

        int limite = 10;

        for(int i = 0; i < nums.length; i++) {

            if(nums[i] > limite) {
                System.out.println("Numero maior encontrado: " + nums[i]);
            }
        }

        String[] linguagens = {"Java", "C", "Python", "PHP"};

        String linguagemAlvo = "Python";

        for(String linguagem : linguagens) {

            if(linguagemAlvo == linguagem) {
                System.out.println("Linguagem encontrada! Parando o loop");
                break;
            } else {
                System.out.println("Linguagem ainda não encontrada!");
            }
        }

        // 5 - Atualizar valores

        for(int i = 0; i < numeros.length; i++) {
            numeros[i] *= 2;
        }
        System.out.println(numeros[1]);

        for(int numero : numeros) {
            System.out.println("Numero dobrado: " + numero);
        }

        for(int i = 0; i < frutas.length; i++) {

            if(frutas[i].equals("Maçã")) {
                frutas[i] = "Abacate";
            }
        }
        System.out.println(frutas[0]);

        
    }
}
