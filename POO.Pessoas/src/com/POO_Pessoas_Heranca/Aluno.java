package com.POO_Pessoas_Heranca;

public class Aluno extends Pessoa { // Extends faz referencia a herança que vem da classe pessoa
    private int matricula;
    private String curso;

    public  void cancelarMatricula() {
        System.out.println(" Matricula sera cancelada ");

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
