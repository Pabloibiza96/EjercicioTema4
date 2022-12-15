package com.company;

public class SmartWatch extends SmartDevices{
    boolean acuatico;
    boolean WifiCellular;
    String colorCorrea;


    //constructor


    public SmartWatch() {
    }

    public SmartWatch(boolean wifi, boolean bluetooth, int precio, String fabricante, String modelo, int year, String sistemaOperativo, String color, boolean acuatico, boolean wifiCellular, String colorCorrea) {
        super(wifi, bluetooth, precio, fabricante, modelo, year, sistemaOperativo, color);
        this.acuatico = acuatico;
        WifiCellular = wifiCellular;
        this.colorCorrea = colorCorrea;
    }
}
