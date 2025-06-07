package fis.poo.principios.herencia.Universidad;

import java.util.ArrayList;

public class Carrera {
    private Facultad facultad;
    private String nombre;
    private int creditosTotales;
    private ArrayList<Asignatura> asignaturas;

    public Carrera(Facultad facultad, String nombre, int creditosTotales) {
        this.facultad = facultad;
        this.nombre = nombre;
        this.creditosTotales = creditosTotales;
    }

    public Facultad getFacultad() {
        return facultad;
    }

    public void setFacultad(Facultad facultad) {
        this.facultad = facultad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCreditosTotales() {
        return creditosTotales;
    }

    public void setCreditosTotales(int creditosTotales) {
        this.creditosTotales = creditosTotales;
    }

    public void anadirAsignatura(Asignatura asignatura) {
        asignaturas.add(asignatura);
    }

    public void eliminarAsignatura(String codigo) {
        for (Asignatura asignatura : asignaturas) {
            if (asignatura.getCodigo().equals(codigo)) {
                asignaturas.remove(asignatura);
            }
        }
    }
}