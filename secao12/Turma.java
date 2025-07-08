package secao12;

import java.util.Arrays;

public class Turma {
    private String[] alunos;

    public Turma(String[] alunos) {
        this.alunos = Arrays.copyOf(alunos, alunos.length);
    }

    public String[] getAluno() {
        return Arrays.copyOf(alunos, alunos.length);
    }

    public void setAlunos(String[] alunos) {
        this.alunos = Arrays.copyOf(alunos, alunos.length);
    }
}
