package com.example.estructurasDeControl;

public class Bucles {

    public static void main(String[] args) {

        String[] nombres = {"pepe", "lolo", "carlos", "manuel", "santiago"};

        String resultado = concatenarTexto(nombres);
        System.out.println(resultado);
    }

    static String concatenarTexto(String[] nombres){

        String texto = "";

        for(int i = 0; i < nombres.length; i++){
            texto = texto + nombres[i] + " ";
        }
        return texto;
    }

}
