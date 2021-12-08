package com.POO_Encap_Heran_Polim;

public class Gafanhoto extends Pessoa { // Gafanhoto extend a classe pessoa que é uma herança e tambem é encapisulado no primeiro pilar
    private String login;
    private int totalAssistido;

    // Metodo construtor
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo); // Super vem da classe pessoa pq ta chamando os atributos de la.
        this.login = login;
        this.totalAssistido = 0;
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotalAssistido() {
        return totalAssistido;
    }

    public void setTotalAssistido(int totalAssistido) {
        this.totalAssistido = totalAssistido;
    }

    @Override  // Nesse toString foi adicionado o super toString da classe superior Pessoa que traz os atributos dela
    public String toString() {
        return "Gafanhoto{" + super.toString() + ", login='" + login + '\'' + ", totalAssistido=" + totalAssistido + '}';
    }
}
