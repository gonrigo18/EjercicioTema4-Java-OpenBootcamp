package com.openBootcamp;

import java.util.ArrayList;

public class Main {

    public static ArrayList<SmartDevice> catalogo = new ArrayList<SmartDevice>();

    public static void main(String[] args) {

        SmartPhone xiaomi = new SmartPhone("Xiaomi", "Redmi", "red", 131.999, 2022,false);
        SmartPhone samsung = new SmartPhone("Samsung", "Galaxy", "blue", 110.245, 2021,false);
        SmartWatch xiaomiBand = new SmartWatch("Xiaomi", "Mi Band", "black", 25.000, 2022, true);

        catalogo.add(xiaomi);
        catalogo.add(samsung);
        catalogo.add(xiaomiBand);

        // Muestra de catalogo
        showSmarts();
    }
        public static void showSmarts(){
            for(int i = 0; i< catalogo.size(); i++)
                System.out.println(catalogo.get(i));  //se invoca el método toString de la clase Coche
    }
}
