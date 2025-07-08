package secao12;

public class Exercicios {
    public static void main(String[] args) {

        /* Exercício 1: Crie uma classe Celular que tenha as seguintes
        propriedades: marca, modelo, bateria. Implemente os métodos para
        ligar e desligar o celular, e outro método que simule o consumo
        da bateria quando o celular é usado. Crie a classe principal para
        instanciar dois objetos Celular e testar os métodos criados. */

        Celular celular1 = new Celular();

        celular1.marca = "Apple";
        celular1.modelo = "Iphone 15";

        celular1.ligarCelular();
        celular1.desligarCelular();
        celular1.uarCelular(50);

        Celular celular2 = new Celular();

        celular2.marca = "Android";
        celular1.modelo = "S24 FE";

        celular2.ligarCelular();
        celular2.desligarCelular();
        celular2.uarCelular(10);

        /* Exercício 2: Crie uma classe Aluno com as propriedades privadas
        nome, matricula, notaFinal. Adicione um construtor parametrizado
        para inicializar essas propriedades e implemente os setters e
        getters com validação para garantir que o nome não esteja vazio e
        a nota final esteja entre 0 e 100. Na classe principal, crie dois
        objetos da classe Aluno, atribua valores e exiba as informações. */

        Aluno aluno1 = new Aluno("Maria Antonya", 2022122760, 85);

        System.out.println(aluno1.getNome());
        System.out.println(aluno1.getNotaFinal());

        aluno1.setNome("Miguel Pevidor");
        aluno1.setNotaFinal(91);

        aluno1.exibirInfo();

        /* Exercício 3: Implemente uma classe ContaCorrente com as
        propriedades privadas titular, saldo e limiteSaque. Crie os
        métodos para depositar(), sacar() e exibirSaldo(). O método de
        saque deve verificar se o valor é menor ou igual ao limite de
        saque e se o saldo é suficiente. Crie dois objetos da classe
        ContaCorrente e teste os métodos criados. */

        ContaCorrente maria = new ContaCorrente("Maria Antonya", 1500, 500);
        
        maria.exibirSaldo();
        maria.depositar(598);
        maria.sacar(98);

        /* Exercício 4: Crie uma classe ProdutoEletronico com as
        propriedades nome, preco, e garantia.  Implemente um método para
        aplicar desconto no preço e, dentro desse método, chame outro
        método que calcula o valor do desconto. Crie um objeto da classe
        ProdutoEletronico, aplique o desconto e exiba as informações
        após a alteração do preço. */

        ProdutoEletronico notebook = new ProdutoEletronico("Notebook dell", 3500, 12);

        notebook.aplicarDesconto(20);
        notebook.exibirInfo();

        /* Exercício 5: Crie uma classe LivroBiblioteca com as propriedades
        privadas titulo, autor, e disponivel (boolean). Adicione métodos
        para pegar emprestado (definindo disponivel como false) e devolver
        o livro (definindo disponivel como true). Nos setters e getters,
        adicione a lógica para verificar se o livro está disponível ou já
        emprestado antes de permitir a ação. Na classe principal,
        instancie dois livros e simule o processo de empréstimo e
        devolução. */
    }
}
