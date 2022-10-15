package com.example.funciones;

public class Funciones {
    public static void main(String[] args) {

        int precio = 110;
        double resultado =  sumaIVA(precio);

        System.out.println(resultado);
    }

    static double sumaIVA(int precio) {
        double iva = 12.5;
        return precio + iva;
    }
}
