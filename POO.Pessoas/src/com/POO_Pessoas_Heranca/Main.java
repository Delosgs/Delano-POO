package com.POO_Pessoas_Heranca; // Herança POO

public class Main {  // Herança POO

    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        p1.setNome("Delano");
        p2.setNome("Bob");
        p3.setNome("Alex");
        p4.setNome("Verusca");

        p1.setSexo('M');
        p4.setSexo('F');
        p2.setIdade(4);
        p1.setIdade(35);

        p2.setCurso("Informática");
        p3.setSalario(2500.75f);
        p4.setSetor("Estoque");

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());

    }
}
