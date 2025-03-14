package secao6;

import java.util.Arrays;
import java.util.List;

public class FuncaoC {
    public static void main(String[] args) {
        // 1 - Função recursiva
        int soma = somaRecursiva(6);
        // 6 + 5 + 4 + 3 + 2 + 1 = 21
        System.out.println(soma);

        // 2 - Função Anônima
        // (arg1, agr2) -> {}
        Runnable tarefa = () -> System.out.println("Minha função anônima!");
        tarefa.run();

        List<String> nomes = Arrays.asList("Ana", "Pedro", "Paulo");
        nomes.forEach(nome -> System.out.println(nome));
    }

    public static int somaRecursiva (int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + somaRecursiva(n - 1);
        }
    }
}