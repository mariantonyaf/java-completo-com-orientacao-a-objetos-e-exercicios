package secao12;

public class Celular {
    String marca;
    String modelo;
    int bateria = 100;

    boolean celularLigado = false;

    void ligarCelular() {
        System.out.println("O celular " + modelo + " está ligado.");
    }

    void desligarCelular() {
        System.out.println("O celular " + modelo + " está desligado.");
    }

    void uarCelular(int consumo) {
        if(bateria - consumo >= 0) {
            bateria -= consumo;
            System.out.println("O celular foi usado. A bateria está em " + bateria + "%.");
        } else {
            System.out.println("Bateria é insuficiente!");
        }
    }


}
