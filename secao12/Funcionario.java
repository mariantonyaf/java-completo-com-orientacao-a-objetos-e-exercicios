package secao12;

public class Funcionario {
    public String nome; // modifica em qualquer lugar
    protected double salario; // modifica so em classes e subclasses
    private String senha; // modifica pelos get e set

    public Funcionario(String nome, double salario, String senha) {
        this.nome = nome;
        this.salario = salario;
        this.senha = senha;
    }

    public void exibirDados() {
        System.out.println("Nome: " + nome + "\nSalario: " + salario + "\nSenha: " + senha);
    }

    protected void aumentarSalario(double porcentagem) {
        this.salario += ((this.salario * porcentagem) / 100);
        System.out.println("O salário agora é de: " + salario);
    }

    private boolean verificarSenha(String tentativaSenha) {
        return this.senha.equals(tentativaSenha);
    }

    public boolean autenticar(String tentativaSenha) {
        // outras lógicas
        return verificarSenha(tentativaSenha);
    }
}
