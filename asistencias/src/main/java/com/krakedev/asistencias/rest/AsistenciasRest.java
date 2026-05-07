package com.krakedev.asistencias.rest;

import java.util.ArrayList;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.krakedev.asistencias.entidades.Asistencia;
import com.krakedev.asistencias.entidades.RegistroAsistencia;
import com.krakedev.asistencias.servicios.ServicioAsistencia;

@RestController
@RequestMapping("/asistencias")
public class AsistenciasRest {
    private final ServicioAsistencia servicio;

    public AsistenciasRest(ServicioAsistencia servicio) {
        this.servicio = servicio;
    }

    @PostMapping("/{cedula}")
    public RegistroAsistencia registrar(@PathVariable String cedula) {
        return servicio.registrarAsistencia(cedula);
    }

    @GetMapping("/{cedula}")
    public ArrayList<Asistencia> consultar(@PathVariable String cedula) {
        return servicio.consultarAsistencia(cedula);
    }
}