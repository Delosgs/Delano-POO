package com.Projeto_Livro;

public class Main {

    public static void main(String[] args) {
	    Pessoa [] p = new Pessoa[2]; //Array de duas pessoas
        Livro [] l = new Livro[3];   // Array de tres livros

        p[0] = new Pessoa("Delano", 35, "M");
        p[1] = new Pessoa("Verusca", 33, "F");

        l[0] = new Livro("POO na pratica","Delano Silva", 200, p[1]);
        l[1] = new Livro("Java na pratica", "Verusca Rocha", 300, p[0]);
        l[2] = new Livro("JAVA avançado", "Bob dog", 500, p[0]);

        l[0].abrir();
        l[0].folhear(199);
        l[0].avancarPag();
        System.out.println(l[0].detalhes());

        System.out.println("------------------");

        System.out.println(l[1].detalhes());
    }
}
