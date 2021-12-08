package com.POO_Polimorfismo_SobrePosicao;

public class Repitil extends Animal {
    private String corEscama;

    @Override
    public void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    public void alimentar() {
        System.out.println("Comendo vegetais");

    }

    @Override
    public void emitirSom() {
        System.out.println("Som de répitil");

    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }
}
