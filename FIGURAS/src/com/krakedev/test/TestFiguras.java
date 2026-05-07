package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Triangulo;

public class TestFiguras {
    public static void main(String[] args) {
        Cuadrado c = new Cuadrado("Cuadrado1", "Rojo", 5.0);
        Triangulo t = new Triangulo("Triangulo1", "Azul", 4.0, 3.0);

        System.out.println(c);
        System.out.println(t);
    }
}