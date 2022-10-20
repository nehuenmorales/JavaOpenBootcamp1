package POO.Clases;

public class SmartDevice {

    //Atributos
    protected String fabricante;
    protected int year;
    protected String color;
    protected boolean enUso;

    //constructores

    public SmartDevice() {}

    public SmartDevice(String fabricante, int year, String color) {
        this.fabricante = fabricante;
        this.year = year;
        this.color = color;
    }

    //metodos

    public void enUso(boolean uso){
        this.enUso = uso;
    }
}
