package POO.Clases;

import POO.Herencia.SmartPhone;
import POO.Herencia.SmartWatch;

public class Main {

    public static void main(String[] args) {

        SmartDevice smarts = new SmartDevice("samsung",2010, "Azul");

        SmartPhone motoG = new SmartPhone();
        SmartPhone motoG8 = new SmartPhone("Motorola", 2010, "verde", 3);

        SmartWatch appleWatch = new SmartWatch();
        SmartWatch relojito = new SmartWatch("apple", 2022, "rojo", "XL");

        System.out.println(smarts.fabricante);
        System.out.println(motoG.fabricante);
        System.out.println(motoG8.color);
        System.out.println(appleWatch.fabricante);
        System.out.println(relojito.year);

        System.out.println("probando si funciona el metodo enUso");
        System.out.println(motoG8.enUso);
        motoG8.enUso(true);
        System.out.println(motoG8.enUso);

    }
}
