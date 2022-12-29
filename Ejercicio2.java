package com.ejercicio2;

public class Ejercicio2 {

    public static void main(String[] args) {

        float precioFinal = precioConIVA(576.99f, 21);
        System.out.println("El precio con el IVA incluido es: " + precioFinal);
    }

    public static float precioConIVA(float precio, float iva) {

        float impuesto = precio * (iva / 100);
        return impuesto + precio;
    }
}