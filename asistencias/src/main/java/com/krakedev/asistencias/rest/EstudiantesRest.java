package com.krakedev.asistencias.rest;

import org.springframework.web.bind.annotation.*;

import com.krakedev.asistencias.entidades.Estudiante;
import com.krakedev.asistencias.servicios.ServicioEstudiantes;

import java.util.ArrayList;

@RestController
@RequestMapping("/estudiantes")
public class EstudiantesRest {
    private final ServicioEstudiantes servicio;

    public EstudiantesRest(ServicioEstudiantes servicio) {
        this.servicio = servicio;
    }

    @PostMapping
    public void crear(@RequestBody Estudiante estudiante) {
        servicio.agregar(estudiante);
    }

    @GetMapping("/{cedula}")
    public Estudiante buscar(@PathVariable String cedula) {
        return servicio.buscarPorCedula(cedula);
    }

    @GetMapping
    public ArrayList<Estudiante> listar() {
        return servicio.listar();
    }

    @PutMapping("/{cedula}")
    public void actualizar(@PathVariable String cedula, @RequestBody Estudiante estudiante) {
        servicio.actualizar(cedula, estudiante);
    }

    @DeleteMapping("/{cedula}")
    public void eliminar(@PathVariable String cedula) {
        servicio.eliminar(cedula);
    }
}