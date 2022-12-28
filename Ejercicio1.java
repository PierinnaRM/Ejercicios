package com.java1E1;

/**
 * Clase de prueba para crear un programa básico en java
 */
public class Ejercicio1 {

    /**
     * Punto de entrada a la aplicación java
     * Permite ejecutar la aplicación
     * @param args
     */
    public static void main(String[] args) {

        // Video Método "main" y "system.out"
        System.out.println("Hola mundo desde sesión 1 de Open Bootcamp");

        // Video Errores
        System.out.println("¡Adiós mundo cruel!");

        //Video Tipos de datos y creación de variables
        // 1. numéricos

        // 1.1. enteros
        byte variable1 = 5;
        System.out.println(variable1);
        short variable2 = 10;
        System.out.println(variable2);
        int variable3 = 30;
        System.out.println(variable3);
        long variable4 = 100;
        System.out.println(variable4);
        long numeroTelefono = 666555444;
        System.out.println(numeroTelefono);
        //long precio = null;

        // 1.2. decimales
        float variable5 = 5.5f;
        System.out.println(variable5);
        double variable6 = 10.5d;
        variable6 = 20.5d;
        System.out.println(variable6);
        double precioSilla = 49.99;
        System.out.println(precioSilla);

        // 2. booleano
        boolean variable7 = true;
        System.out.println(variable7);
        boolean variable8 = false;
        System.out.println(variable8);

        // 3. texto
        char variable9 = 'a';
        System.out.println(variable9);
        String variable10 = "Lorem ipsum dolor sit amet...";
        System.out.println(variable10);
    }
}
