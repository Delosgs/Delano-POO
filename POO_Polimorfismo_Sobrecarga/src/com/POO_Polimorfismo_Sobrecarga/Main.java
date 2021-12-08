package com.POO_Polimorfismo_Sobrecarga;

public class Main {

    public static void main(String[] args) {
	Mamifero m = new Mamifero();
    Lobo l = new Lobo();
    Cachorro c =new Cachorro();

    //l.emitirSom();
    //m.emitirSom();
    c.emitirSom();
    c.reagir(false);
    c.reagir(13, 10);
    c.reagir(6, 11.5f);

    }
}
