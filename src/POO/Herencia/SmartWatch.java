package POO.Herencia;

import POO.Clases.SmartDevice;

public class SmartWatch extends SmartDevice {
    //atributos
    String talle;

    //constructores


    public SmartWatch() {
    }

    public SmartWatch(String fabricante, int year, String color, String talle) {
        super(fabricante, year, color);
        this.talle = talle;
    }
}
