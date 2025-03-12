package secao6;

public class FuncaoBuiltIn {
    public static void main(String[] args) {
        // 1 - Funções built in de string
        String frase = "Java é muito bom";

        // Length
        System.out.println(frase.length());

        System.out.println(frase.substring(0, 4));

        System.out.println(frase.toUpperCase());

        System.out.println(frase.replace("a", "e"));

        String fraseModificada = frase.toUpperCase();

        System.out.println(fraseModificada);
    }
}
