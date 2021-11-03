package com.Delano_Conta.Banco;

public class Main {

    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setNumConta(3593);
        p1.setDono("Delano");
        p1.abrirConta("CC");

        ContaBanco p2 = new ContaBanco();
        p2.setNumConta(2376);
        p2.setDono("Verusca");
        p2.abrirConta("CP");

        p1.depositar(100);
        p2.depositar(500);
        p2.sacar(1000);
        p1.sacar(150);
        p1.fecharConta();

        p1.estadoAtual();
        p2.estadoAtual();
    }
}
