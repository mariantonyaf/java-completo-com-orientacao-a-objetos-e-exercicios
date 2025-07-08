package secao12;

import java.util.Arrays;

public class POO2 {
    public static void main(String[] args) {

        // 10 - Modificadores de acesso
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

        // 11 - Classe imutável
        PessoaImutavel joaquim = new PessoaImutavel("Joaquim", 23);

        System.out.println(joaquim.getNome());
        System.out.println(joaquim.getIdade());

        // 12 - Encapsulamento de arrays

        String[] meusAlunos = {"Matheus", "João", "Maria"};
        Turma novaTurma = new Turma(meusAlunos);
        System.out.println(Arrays.toString(novaTurma.getAluno()));

        String[] outrosAlunos = {"Aluno1", "Aluno2"};
        novaTurma.setAlunos(outrosAlunos);
        System.out.println(Arrays.toString(novaTurma.getAluno()));
    }
}
