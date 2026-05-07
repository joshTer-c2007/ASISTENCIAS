package com.krakedev.figuras;

public class Graficador {
    public void graficar(Figura figura) {
        System.out.println("--- DATOS DE LA FIGURA ---");
        System.out.println(figura.toString());
        System.out.println("Área: " + figura.calcularArea());
        System.out.println("Perímetro: " + figura.calcularPerimetro());
    }
}