package POO.Herencia;

import POO.Clases.SmartDevice;

public class SmartPhone extends SmartDevice {

    int cantCamaras;

    public SmartPhone() {
    }

    public SmartPhone(String fabricante, int year, String color, int cantCamaras) {
        super(fabricante, year, color);
        this.cantCamaras = cantCamaras;
    }
}
