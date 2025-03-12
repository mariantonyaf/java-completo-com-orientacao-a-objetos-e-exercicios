package secao6;

public class Funcoes2 {
    public static void main(String[] args) {
        // 5 - Funções com condicionais
        String r1 = verificarAcesso(22, true, true);
        System.out.println(r1);

        // 6 - Funções com Switch
        System.out.println(obterDiaDaSemana(10));

        String diaSemana = obterDiaDaSemana(4);
        System.out.println(diaSemana);

        // 7 - System exit
        verificarAutenticacao ("admin", "SenhaSegura");
        System.out.println("Oi");

        // 8 - Documentação função
        System.out.println(calcularMedia(5, 6, 7));
    }

    public static String verificarAcesso (int idade, 
        boolean temCarteira,
        boolean temHistoricoNegativo) {

            if (idade >= 18 && temCarteira && !temHistoricoNegativo) {
                return "Acesso permitido: todos os critérios atendidos!";
            } else if (idade >= 18 && temCarteira && temHistoricoNegativo) {
                return "Acesso negado: histórico negativo detectado!";
            } else {
                return "Acesso negado: critérios não atendidos!";
            }
    }

    public static String obterDiaDaSemana (int dia) {
        switch (dia) {
            case 1:
                return "Domingo";
            case 2:
                return "Segunda-feira";
            case 3:
                return "Terça-feira";
            case 4:
                return "Quarta-feira";
            case 5:
                return "Quinta-feira";
            case 6:
                return "Sexta-feira";
            case 7:
                return "Sábado";

            default:
                return "Dia inválido";
        }
    }

    public static void verificarAutenticacao (String usuario, String senha) {
        if (!usuario.equals("admin") && !senha.equals("SenhaSegura")) {
            System.out.println("Autentificação falhou!");
            System.exit(1);
        }
            
        System.out.println("Autentificação bem sucedida!");
    }

    /**
     * Calcula a média de três números inteiros.
     * @param num1 O primeiro número/nota a ser enviado.
     * @param num2 O segundo número/nota a ser enviado.
     * @param num3 O terceiro número/nota a ser enviado.
     * @return A média dos três números.
     */
    public static double calcularMedia (int num1, int num2, int num3) {
        return (num1 + num2 + num3) / 3;
    }
}
