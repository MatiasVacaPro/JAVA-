// Estudiante.java

import java.util.ArrayList;


public class Estudiante {


    private int id;
    private String nombre;
    private ArrayList<Integer> calificaciones;


    public Estudiante() {
        this.calificaciones = new ArrayList<>();
    }


    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    public ArrayList<Integer> getNotas() {
        return this.calificaciones;
    }

    // Metodos Proipos


    public void addNota(int nota) {
        this.calificaciones.add(nota);
    }


    public double getPromedio() {
        // Ver valor
        if (this.calificaciones.isEmpty()) {
            return 0.0;
        }

        double suma = 0;
        // Lista para reccorer
        for (int nota : this.calificaciones) {
            suma += nota;
        }

        //Prom
        return suma / this.calificaciones.size();
    }
}