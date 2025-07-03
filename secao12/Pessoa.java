package secao12;

public class Pessoa {
    
    private String nome;
    private int idade;

    public void setNome(String nome) {
        // this -> objeto
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }
}
