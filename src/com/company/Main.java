package com.company;

public class Main {
    public static void main(String[] args) {

        //Objeto1 sonybravia (clase padre)
        SmartDevices televisor1 = new SmartDevices(true,false,500, "Sony", "Bravia", 2, "AndroidTV" , "negro");
        System.out.println("Este televisor1 es un " + televisor1.fabricante+ " " + televisor1.modelo+ " , cuyo coste es " +televisor1.precio+ " euros");

        System.out.println("El Wifi está encendido? " +televisor1.isWifiOn(false));

        //Objeto2 iphone (clase hija)

        SmartPhone iPhone = new SmartPhone(true, true, 990, "apple", "iPhone 14", 1, "iOS", "negro", true, true, true);
        System.out.println("Este Smartphone es un " + iPhone.fabricante+ " " +iPhone.modelo+ " , cuyo coste es " +iPhone.precio+ " euros.");

        //Objeto3 smartwatch samsung

        SmartWatch smartWatchSamsung = new SmartWatch(true, true, 500, "Samsung","pulsera",2, "android", "azul", true, false, "blanca");
        System.out.println("Este Smartwatch es un " + smartWatchSamsung.fabricante +" "+smartWatchSamsung.modelo+ " , cuyo coste es " +smartWatchSamsung.precio+ " euros.");
    }
}
