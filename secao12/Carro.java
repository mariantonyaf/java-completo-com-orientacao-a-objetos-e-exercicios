package secao12;

public class Carro {
    
    // essa classe não é nada sem:

    // atributos ou propriedades
    String marca;
    String modelo;
    int ano;

    double velocidadeAtual = 0;
    boolean motorLigado = false;

    // e métodos
    void acelerar() {
        System.out.println("Estamos acelerando o carro!");
    }

    void exibirInfo() {
        System.out.println("Marca: " + marca + "\nModelo: " + modelo + "\nAno: " + ano);
    }

    // 3 - Métodos
    void ligarMotor() {
        if(!motorLigado) {
            motorLigado = true;
            System.out.println("Ligando o motor...");
        } else {
            System.out.println("O motor já está ligado!");
        }
    }

    void aumentarVelocidade(double incremento) {
        if(motorLigado) {
            velocidadeAtual += incremento;
            System.out.println("A velocidade atual é: " + velocidadeAtual);
        } else {
            System.out.println("Primeiro precisa ligar o motor.");
        }
    }
}
