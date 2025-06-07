package fis.poo.principios.herencia.Universidad;

import java.util.ArrayList;

public class Facultad {
    private String nombre;
    private Professor decano;
    private Professor subdecano;
    private ArrayList<Professor> profesores;

    public Facultad(String nombre, Professor decano, Professor subdecano) {
        this.nombre = nombre;
        this.decano = decano;
        this.subdecano = subdecano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Professor getDecano() {
        return decano;
    }

    public void setDecano(Professor decano) {
        this.decano = decano;
    }

    public Professor getSubdecano() {
        return subdecano;
    }

    public void setSubdecano(Professor subdecano) {
        this.subdecano = subdecano;
    }
}