package com.Delano_Get_Set_Const;

public class Caneta {

    // Atributos da classe caneta
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;

    // Metodo construtor
    public Caneta(String m, String c, float p) { //Este é o metodo construtor que tem o mesmo nome da classe
        this.modelo = m;
        this.cor = c;
        this.ponta = p;
        this.tampar();
    }

    // Get e Set dos atributos
    public String getModelo() {
        return  this.modelo;
    }
    public  void  setModelo(String m) {
        this.modelo = m;
    }
    public float getPonta() {
        return this.ponta;
    }
    public void setPonta(float p) {
        this.ponta = p;
    }
    public void tampar() {
        this.tampada = true;
    }
    public void destampar() {
        this.tampada = false;
    }
    public void status() {
        System.out.println("\nSobre a caneta:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada " + this.tampada);
    }
}
