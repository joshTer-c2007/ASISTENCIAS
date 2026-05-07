package com.krakedev.asistencias.servicios;

import org.springframework.stereotype.Service;

import com.krakedev.asistencias.entidades.Estudiante;

import java.util.ArrayList;

@Service
public class ServicioEstudiantes {
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    public void agregar(Estudiante estudiante) {
        if (buscarPorCedula(estudiante.getCedula()) == null) {
            estudiantes.add(estudiante);
        }
    }

    public Estudiante buscarPorCedula(String cedula) {
        for (Estudiante e : estudiantes) {
            if (e.getCedula().equals(cedula)) {
                return e;
            }
        }
        return null;
    }

    public ArrayList<Estudiante> listar() {
        return estudiantes;
    }
    public void actualizar(String cedula, Estudiante nuevo) {
        for (int i = 0; i < estudiantes.size(); i++) {
            if (estudiantes.get(i).getCedula().equals(cedula)) {
                estudiantes.set(i, nuevo);
                break;
            }
        }
    }
    public void eliminar(String cedula) {
        Estudiante estudianteEncontrado = buscarPorCedula(cedula);
        if (estudianteEncontrado != null) {
            estudiantes.remove(estudianteEncontrado);
        }
    }
}