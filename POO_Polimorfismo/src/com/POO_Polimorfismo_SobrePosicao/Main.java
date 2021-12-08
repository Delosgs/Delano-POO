package com.POO_Polimorfismo_SobrePosicao;

public class Main {

    public static void main(String[] args) {
        //Animal n = new Animal(); Não pode instanciar animal pq a classe dele é abstrata
        Mamifero m = new Mamifero();
        Repitil r = new Repitil();
        Peixe p = new Peixe();
        Ave a = new Ave();
        Canguru c = new Canguru();
        Cachorro k = new Cachorro();
        Cobra j = new Cobra();
        Tartaruga t = new Tartaruga();
        Goldfish g = new Goldfish();
        Arara e = new Arara();

        m.setPeso(35.6f);
        m.setCorPelo("Marrom");
        m.setMembros(4);
        m.alimentar();
        m.locomover();
        m.emitirSom();

        a.locomover();
        p.locomover();
        c.locomover();
        k.locomover();
        k.emitirSom();

    }
}
