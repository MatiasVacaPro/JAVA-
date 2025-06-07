// Main Class

import java.util.ArrayList;



public class Main {

    public static void main(String[] args) {

        // Instanciamos un estudiante

        Estudiante estudiante = new Estudiante();



        // Se asignan valores utilizando los métodos setters

        estudiante.setId(1);

        estudiante.setNombre("Gabriel García");



        // Añadir calificacionres usando el metodo addNota

        estudiante.addNota(92);

        estudiante.addNota(89);

        estudiante.addNota(90);



        // Obtener los valores usando los metodos geters

        int id = estudiante.getId();

        String nombre = estudiante.getNombre();

        ArrayList<Integer> notas = estudiante.getNotas();

        double promedio = estudiante.getPromedio();



        // Imprimir los valores

        System.out.println("Estudiante ID: " + id);

        System.out.println("Student Name: " + nombre);

        System.out.println("Notas: " + notas);

        System.out.println("Promedio: " + promedio);

    }

}