package com.POO_Pessoas_Heranca2;

public class Bolsista extends Aluno{
    private float bolsa;

    public void renovarBolsa() {
        System.out.println("Renovando bolsa de " + this.getNome());
    }

    public void pagarMensalidade() {
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado ");

    }

    public float getBolsa(float v) {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
