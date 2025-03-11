package secao4;

public class OperadoresLogicos {
    public static void main(String[] args) {
        // 7 - AND
        int idade = 20;
        boolean temCarteiraMotorista = true;

        System.out.println(idade >= 18 && temCarteiraMotorista);

        int a = 10;
        int b = 20;

        if (a > 5 && b > 10) {
            System.out.println("Deu certo!");
        } else {
            System.out.println("Não deu certo!");
        }

        // 8 - OR
        boolean estaChovendo = false;
        boolean temGuardaChuva = true;

        System.out.println(estaChovendo || temGuardaChuva);

        int idade2 = 16;
        boolean ehMembro = true;

        if (idade2 > 16 || ehMembro) {
            System.out.println("Você pode entrar!");
        } else {
            System.out.println("Entrada negada!");
        }

        // 9 - NOT
        System.out.println(estaChovendo);
        System.out.println(!estaChovendo);

        // 11 - Switch case e break
        int diaDaSemana = 5;

        switch (diaDaSemana) {
            case 1: 
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda-feira");
                break;
            case 3:
                System.out.println("Terça-feira");
                break;
            case 4:
                System.out.println("Quarta-feira");
                break;
            case 5:
                System.out.println("Quinta-feira");
                break;
            case 6:
                System.out.println("Sexta-feira");
                break;
            case 7:
                System.out.println("Sábado");
                break;
            default:
                break;
        }
    }
}
