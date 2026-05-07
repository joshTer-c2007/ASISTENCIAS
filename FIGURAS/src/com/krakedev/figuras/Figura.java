package com.krakedev.figuras;


public abstract class Figura {
    private String nombre;
    private String color;

    public Figura(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    // Métodos abstractos: no tienen cuerpo {}, terminan en punto y coma
    public abstract double calcularArea();
    public abstract double calcularPerimetro();

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public String getColor() { return color; }
    public void setColor(String color) { this.color = color; }

    @Override
    public String toString() {
        return "Figura [nombre=" + nombre + ", color=" + color + "]";
    }
}