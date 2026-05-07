package com.krakedev.test;

import com.krakedev.figuras.Cuadrado;
import com.krakedev.figuras.Graficador;
import com.krakedev.figuras.Triangulo;

public class TestGraficador {
    public static void main(String[] args) {
        Graficador g = new Graficador();
        
        Cuadrado c = new Cuadrado("C1", "Rojo", 5.0);
        Triangulo t = new Triangulo("T1", "Azul", 4.0, 3.0);
        
        // Polimorfismo en acción
        g.graficar(c); 
        g.graficar(t);
    }
}