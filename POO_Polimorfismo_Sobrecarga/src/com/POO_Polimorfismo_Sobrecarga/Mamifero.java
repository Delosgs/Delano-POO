package com.POO_Polimorfismo_Sobrecarga;

public class Mamifero extends Animal{
    protected String corPelo;

    @Override
    public void emitirSom() {
        System.out.println("Som de mamifero");
    }
}
