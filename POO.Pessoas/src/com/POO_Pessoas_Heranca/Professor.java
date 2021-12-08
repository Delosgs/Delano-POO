package com.POO_Pessoas_Heranca;

public class Professor extends Pessoa { // Extends faz referencia a herança que vem da classe pessoa
    private String especialidade;
    private float salario;

    public void receberAumento(float aum) {
        this.salario += aum;

    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }
}
