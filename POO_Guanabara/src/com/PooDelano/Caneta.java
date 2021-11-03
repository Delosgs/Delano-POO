package com.PooDelano;

public class Caneta {
    // Abaixo foi declarado os meus cincos atributos da classe caneta.
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;
    public void status() {
        System.out.println("Modelo " + this.modelo);
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga " + this.carga);
        System.out.println("Está tampada? " + this.tampada);
    }
    // Abaixo eu tenho os tres metodos da classe caneta
    public void rabiscar() {
        if (this.tampada == true){
            System.out.println("Erro! Não posso rabiscar");
        }else {
            System.out.println("Estou rabiscando");
        }
    }

    protected void tampar() {
        this.tampada = true;
    }

    protected void destampar() {
        this.tampada = false;
    }
}

