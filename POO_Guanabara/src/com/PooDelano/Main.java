package com.PooDelano;

public class Main {

    public static void main(String[] args) {
        //System.out.println("Caneta 1");
        Caneta c1 = new Caneta();
        c1.modelo = "Bic cristal";
        c1.cor = "Azul";
        //c1.ponta = 0.5f;
        c1.carga = 80;
        c1.tampada = false;
        c1.status();
        c1.rabiscar();


       /* c1.cor = "Azul"; // Aqui é uma referencia ao atributo
        c1.ponta = 0.5f;
        c1.tampar();
        c1.status(); // Aqui é uma referencia ao metodo
        c1.rabiscar();

        System.out.println("\nCaneta 2");
        Caneta c2 = new Caneta();
        c2.modelo = "Hostnet";
        c2.cor = "Preta";
        c2.destampar();
        c2.status();
        c2.rabiscar();*/
    }
}
