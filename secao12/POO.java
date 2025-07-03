package secao12;

public class POO {
    public static void main(String[] args) {
        
        // 1 - Criar a classe
        // criação de Carro.java

        // 2 - Instanciar a classe
        Carro carro1 = new Carro();

        // NOMEOBJETO. PROP
        carro1.marca = "VW";
        carro1.modelo = "Fusca";
        carro1.ano = 1964;

        // NOMEOBJETO.METODO()
        carro1.acelerar();
        carro1.exibirInfo();

        Carro carro2 = new Carro();

        carro2.marca = "Fiat";
        carro2.modelo = "Fusca";
        carro2.ano = 2010;

        carro2.exibirInfo();

        // 3 - Métodos
        carro1.aumentarVelocidade(10.0);

        carro1.ligarMotor();

        carro1.aumentarVelocidade(20.0);

        carro1.aumentarVelocidade(30.0);
    }
}
