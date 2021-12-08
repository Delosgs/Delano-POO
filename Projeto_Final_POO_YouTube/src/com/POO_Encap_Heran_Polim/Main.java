package com.POO_Encap_Heran_Polim;

public class Main {

    public static void main(String[] args) {
	Video v[] = new Video [3];
    v[0] = new Video("Aula 1 de poo");
    v[1] = new Video("Aula 12 de PHP");
    v[2] = new Video("Aula de python");

    Gafanhoto g[] = new Gafanhoto[2];
    g[0] = new Gafanhoto("Delano", 35, "M", "Dellavolp");
    g[1] = new Gafanhoto("Verusca", 33, "F", "Branquinha");

    Visualizacao vis[] = new Visualizacao[2];
    vis[0] = new Visualizacao(g[0],v[2]);  // Delano assiste aula de python
    vis[0].avaliar();
    System.out.println(vis[0].toString());

    vis[1] = new Visualizacao(g[1], v[1]); // Delano assiste aula de PHP
    vis[1].avaliar(87.0f);
    System.out.println(vis[1].toString());

        /*System.out.println("Videos\n-----------------");
        System.out.println(v[0].toString());
        System.out.println(v[1].toString());
        System.out.println(v[2].toString());
        System.out.println("Gafanhoto\n-----------------");
        System.out.println(g[0].toString());
        System.out.println(g[1].toString());*/

        //System.out.println(v[0].toString());
        //System.out.println(g[0].toString());




    }
}
