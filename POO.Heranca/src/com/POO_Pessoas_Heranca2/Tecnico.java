package com.POO_Pessoas_Heranca2;

public class Tecnico extends Aluno {
    private String registroProfissional;

    public void praticar() {
        System.out.println(this.getNome() + " è eletricista industrial ");

    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
