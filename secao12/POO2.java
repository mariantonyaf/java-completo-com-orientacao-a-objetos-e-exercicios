package secao12;

public class POO2 {
    public static void main(String[] args) {
        Funcionario funcionario1 = new Funcionario("Maria Antonya", 759, "teste2022");

        funcionario1.exibirDados();

        funcionario1.nome = "Miguel Pevidor";
        funcionario1.salario = 1300;
        //funcionario1.senha = "2022teste";

        funcionario1.exibirDados();

        funcionario1.aumentarSalario(25);

        if (funcionario1.autenticar("teste2022")) {
            System.out.println("Usuário entrou no sistema.");
        }
    }
}
