package com.Delano_Get_Set_Const;

public class Main {

    public static void main(String[] args) {
        Caneta c1 = new Caneta("Bic", "Amarelo", 0.4f);
        c1.status();
        Caneta c2 = new Caneta("Top", "Preta", 0.7f);
        c2.status();


        /*c1.setModelo("Bic");  // Chamada pelo metodo modoficador
        //c1.modelo = "Bic";  // Foi acessado diretamente pelo atributo


        c1.setPonta(0.5f);
        //c1.ponta = 0.5f;

        //c1.status();

        System.out.println("Tenho uma caneta " + c1.getModelo() + " de ponta " + c1.getPonta());*/
    }
}
