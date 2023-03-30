package com.company;




public class Main {

    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 30;
        int num3 = 8;
        int resultado;
        resultado = suma(num1, num2, num3);

        System.out.println(resultado);

        //

        Coche miCoche = new Coche();
        miCoche.agregarPuertas();
        miCoche.agregarPuertas();
        miCoche.mostrarInfo();

    }
        //Funcion SUMA.
    public static int suma(int num1, int num2, int num3) {

        return num1 + num2 + num3;
    }





}





