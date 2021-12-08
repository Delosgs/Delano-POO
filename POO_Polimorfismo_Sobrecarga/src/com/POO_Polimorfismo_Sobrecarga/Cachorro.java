package com.POO_Polimorfismo_Sobrecarga;

// Polimorfismo de sobre carga, as classes são as mesmas, mas, as assinaturas são diferentes

public class Cachorro extends Lobo {
    public void emitirSom() {
        System.out.println("Au! Au! Au!");
    }

    public void reagir(String frase) {  // Mesma classe e assinatura diferente
        if (frase.equals("Toma comida") || frase.equals("Olá")) {
            System.out.println("Abanar e latir");
        }else {
            System.out.println("Rosnar");
        }

    }
    public void reagir(int hora, int min) {  // Mesma classe e assinatura diferente
        if (hora < 12) {
            System.out.println("Abanar");
        }else if (hora >= 18) {
            System.out.println("Ignorar");
        }else {
            System.out.println("Abanar e latir");
            this.emitirSom();
        }

    }
    public void reagir(boolean dono) {  // Mesma classe e assinatura diferente
        if (dono) {
            System.out.println("Abanar");
        }else {
            System.out.println("Rosnar e latir");

        }

    }
    public void reagir(int idade, float peso) {  // Mesma classe e assinatura diferente
        if (idade < 5) {
            if (peso < 10) {
                System.out.println("Abanar");
            }else {
                System.out.println("Latir");
            }
        }else {
            if (peso < 10) {
                System.out.println("Rosnar");
            }else {
                System.out.println("Ignorar");
            }
        }

    }

}
