package secao14;

public class POO {
    public static void main(String[] args) {
        
        // 1 - Objetc Composition
        Motor motor1 = new Motor("V8", 450);

        Carro carro1 = new Carro("Ford", "Mustang", motor1);

        carro1.exibirInfo();
    }
}
