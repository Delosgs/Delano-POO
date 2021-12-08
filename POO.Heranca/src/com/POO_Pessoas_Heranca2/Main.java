package com.POO_Pessoas_Heranca2;

public class Main {

    public static void main(String[] args) {
	//Pessoa p1 = new Pessoa()
    System.out.println("Visitante: Delano Silva");
    Visitante v1 = new Visitante();
    v1.setNome("Delano");
    v1.setIdade(35);
    v1.setSexo("M");
    System.out.println(v1.toString());

    System.out.println("Aluno: Delano Silva");

    Aluno a1 = new Aluno();
    a1.setNome("Delano");
    a1.setMatricula(2021);
    a1.setIdade(35);
    a1.setCurso("Eng de Automação");
    a1.setSexo("M");
    a1.pagarMensalidade();

    System.out.println("Bolsista: Verusca Rocha");

    Bolsista b1 = new Bolsista();
    b1.setMatricula(2022);
    b1.setNome("Verusca");
    b1.getBolsa(12.5f);
    b1.setSexo("F");
    b1.pagarMensalidade();

    System.out.println("Professor: Alex Ribeiro");

    Professor p1 = new Professor();
    p1.setNome("Alex Ribeiro");
    p1.setSexo("M");
    p1.setIdade(62);
    System.out.println(p1.toString());
    p1.receberAumento();

    System.out.println("Tecnico: Bob Dog");

    Tecnico t1 = new Tecnico();
    t1.setNome("Bob");
    t1.setSexo("M");
    t1.setIdade(4);
    t1.praticar();
        System.out.println(t1.toString());



    }
}
