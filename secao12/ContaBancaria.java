package secao12;

public class ContaBancaria {
    
    private String titular;
    private double saldo;

    public void setTitular(String titular) {
        // lógica para validar ou manipular 
        if(titular != null && !titular.isEmpty()) {
            this.titular = titular;
        } else {
            System.out.println("Nome do titular inválido!");
        }
    }

    public void setSaldo(double saldo) {
        if(saldo >= 0) {
            this.saldo = saldo;
        } else {
            System.out.println("O valor precisa ser positivo!");
        }
    }

    public void exibirInfo() {
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: " + saldo);
    }
}
