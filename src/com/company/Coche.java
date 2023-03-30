package com.company;

public class Coche {

    int numeroPuertas = 0;

    public void agregarPuertas() {
        numeroPuertas++;
    }

    public void mostrarInfo() {
        System.out.println("La cantidad de puertas es de: " + numeroPuertas);
    }
}
