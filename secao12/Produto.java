package secao12;

public class Produto {

    private String nome;
    private double preco;

    public void setNome(String nome) {
        if(nome != null && !nome.isEmpty() && nome.length() > 3) {
            this.nome = nome;
        } else {
            System.out.println("O nome enviado não atende os critérios.");
        }
    }

    public String getNome() {
        return nome.toUpperCase();
    }

    public void setPreco(double preco) {
        if(preco < 0) {
            System.out.println("O preco não pode ser negativo!");
        } else {
            this.preco = preco;
        }
    }

    public String getPreco() {
        return String.format("R$%.2f", preco);
    }

    public String getProdutoInfo() {
        return "Nome: " + this.getNome() + ", Preço: " + this.getPreco();
    }

    public void aplicarDesconto(double porcentagem) {
        if(porcentagem > 0 && porcentagem <= 100) {
            double desconto = calcularDesconto(porcentagem);

            double precoFinal = this.preco - desconto;

            this.setPreco(precoFinal);

            System.out.println("Desconto de " + porcentagem + "% aplicado!");

            System.out.println(this.getProdutoInfo());
        } else {
            System.out.println("Porcentagem inválida.");
        }
    }

    private double calcularDesconto(double porcentagem) {
        return (this.preco * porcentagem) / 100;
    }
}
