package secao4;

public class Condicionais {
    public static void main(String[] args) {
        // 1 - O que é boolean?
        boolean isTrue = true;
        boolean isFalse = false;

        System.out.println(isTrue);
        System.out.println(isFalse);
        
        // 2 - Operadores de comparação
        int x = 10;

        System.out.println(x == 10);
        System.out.println(x == 9);

        System.out.println(x != 5);
        System.out.println(x != 10);

        System.out.println(x > 10);
        System.out.println(x >= 10);

        System.out.println(x < 10);
        System.out.println(x <= 10);

        // 3 - Camparação de Strings
        String str1 = "Java";
        String str2 = new String("Java");
        String str3 = "JAVA";

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1.equals(str2));
        System.out.println(str1.equals(str3));
        System.out.println(str1.equalsIgnoreCase(str3));
    }
}
