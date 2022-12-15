package com.company;

public class SmartPhone extends SmartDevices {
    boolean camara;
    boolean camaraInterior;
    boolean cincoG;


    //constructores

    public SmartPhone() {}

    public SmartPhone(boolean wifi, boolean bluetooth, int precio, String fabricante, String modelo, int años, String sistemaOperativo, String color, boolean camara, boolean camaraInterior, boolean cincoG) {
        super(wifi, bluetooth, precio, fabricante, modelo, años, sistemaOperativo, color);
        this.camara = camara;
        this.camaraInterior = camaraInterior;
        this.cincoG = cincoG;
    }

}
