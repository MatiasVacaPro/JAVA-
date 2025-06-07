package fis.poo.principios.herencia.Universidad;

import java.util.ArrayList;

public class Professor extends Persona{
    private String Departamento;
    private String Categoria;
    private ArrayList<Asignatura> Asignaturas;
    public Professor() {
        super();
    }

    public Professor(String nombre,String departamento, String categoria) {
        super();
        Departamento = departamento;
        Categoria = categoria;
        super.nombre = nombre;
    }
}