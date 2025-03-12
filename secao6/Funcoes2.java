package secao6;

public class Funcoes2 {
    public static void main(String[] args) {
        // 5 - Funções com condicionais
        String r1 = verificarAcesso(22, true, true);

        System.out.println(r1);
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
}
