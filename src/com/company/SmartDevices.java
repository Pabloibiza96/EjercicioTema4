package com.company;

public class SmartDevices {

    //Atributos
    boolean wifi;
    boolean bluetooth;
    int precio;
    String fabricante;
    String modelo;
    int años;
    String sistemaOperativo;
    Boolean Wifi;
    String Color;

    //Constructores
    public SmartDevices() {

    }
    public SmartDevices(boolean wifi, boolean bluetooth, int precio, String fabricante, String modelo, int años, String sistemaOperativo, String color) {
        this.wifi = wifi;
        this.bluetooth = bluetooth;
        this.precio = precio;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.años = años;
        this.sistemaOperativo = sistemaOperativo;
    }

    //Metodos
    public boolean isWifiOn(boolean b) {
        this.Wifi = true;
        return b;
    }




}
