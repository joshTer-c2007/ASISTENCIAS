package com.krakedev.figuras;

public class Hexagono extends Figura {
    private double lado;

    public Hexagono(String nombre, String color, double lado) {
        super(nombre, color);
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return (3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2;
    }

    @Override
    public double calcularPerimetro() {
        return lado * 6;
    }
}