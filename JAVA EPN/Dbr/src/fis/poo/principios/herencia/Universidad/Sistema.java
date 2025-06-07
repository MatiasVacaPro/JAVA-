package fis.poo.principios.herencia.Universidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Sistema {
    // Para leer la entrada de usuario
    private static Scanner sc = new Scanner(System.in);

    // Listas para almacenar los objetos
    private static ArrayList<Professor> profesores = new ArrayList<>();
    private static ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private static ArrayList<Facultad> facultades = new ArrayList<>();

    public static void main(String[] args) {
        //usoArrayList();
        //probandoUniversidad();
        Universidad universidad = new Universidad();
        int opcion;
        opcion = menu();
        while (opcion != 4) {
            switch (opcion) {
                case 1:
                    //TODO
                    gestionProfesores();
                    break;
                case 2:
                    gestionEstudiantes();
                    break;
                case 3:
                    gestionFacultad();   // nota: tu método ya se llama gestionFacultad()
                    break;

            }
            opcion = menu();
        }
    }


    public static void gestionFacultad() {
        int op;
        do {
            System.out.println("\n--- Gestión de Facultades ---");
            System.out.println("1. Mostrar facultades");
            System.out.println("2. Agregar facultad");
            System.out.println("3. Eliminar facultad");
            System.out.println("4. Volver al menú principal");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Lista de facultades:");
                    for (Facultad f : facultades) {
                        System.out.println(" - " + f.getNombre());
                    }
                    break;
                case 2:
                    System.out.print("Nombre de la facultad: ");
                    String nombreF = sc.nextLine();
                    // Para simplificar, creamos decano y subdecano vacíos
                    Facultad fac = new Facultad(nombreF, new Professor(), new Professor());
                    facultades.add(fac);
                    System.out.println("Facultad agregada.");
                    break;
                case 3:
                    System.out.print("Nombre de la facultad a eliminar: ");
                    String nombreEli = sc.nextLine();
                    facultades.removeIf(f -> f.getNombre().equalsIgnoreCase(nombreEli));
                    System.out.println("Si existía, se eliminó.");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (op != 4);
    }

    public static void gestionProfesores() {
        int op;
        do {
            System.out.println("\n--- Gestión de Profesores ---");
            System.out.println("1. Mostrar profesores");
            System.out.println("2. Agregar profesor");
            System.out.println("3. Eliminar profesor");
            System.out.println("4. Volver al menú principal");
            op = sc.nextInt();
            sc.nextLine();  // limpiar buffer

            switch (op) {
                case 1:
                    System.out.println("Lista de profesores:");
                    for (Professor p : profesores) {
                        System.out.println(" - " + p.getNombre() + " (" + p.getCi() + ")");
                    }
                    break;
                case 2:
                    System.out.print("Nombre: ");
                    String nombreP = sc.nextLine();
                    System.out.print("Cédula: ");
                    String ciP = sc.nextLine();
                    Professor prof = new Professor();
                    prof.setNombre(nombreP);
                    prof.setCi(ciP);
                    profesores.add(prof);
                    System.out.println("Profesor agregado.");
                    break;
                case 3:
                    System.out.print("Cédula del profesor a eliminar: ");
                    String cedulaDel = sc.nextLine();
                    profesores.removeIf(p -> p.getCi().equals(cedulaDel));
                    System.out.println("Si existía, se eliminó.");
                    break;
                case 4:
                    // vuelve al menú principal
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (op != 4);
    }
    public static void gestionEstudiantes() {
        int op;
        do {
            System.out.println("\n--- Gestión de Estudiantes ---");
            System.out.println("1. Mostrar estudiantes");
            System.out.println("2. Agregar estudiante");
            System.out.println("3. Eliminar estudiante");
            System.out.println("4. Volver al menú principal");
            op = sc.nextInt();
            sc.nextLine();

            switch (op) {
                case 1:
                    System.out.println("Lista de estudiantes:");
                    for (Estudiante e : estudiantes) {
                        System.out.println(" - " + e.getNombre() + " (" + e.getCi() + ")");
                    }
                    break;
                case 2:
                    System.out.print("Nombre: ");
                    String nombreE = sc.nextLine();
                    System.out.print("Cédula: ");
                    String ciE = sc.nextLine();
                    Estudiante est = new Estudiante();
                    est.setNombre(nombreE);
                    est.setCi(ciE);
                    estudiantes.add(est);
                    System.out.println("Estudiante agregado.");
                    break;
                case 3:
                    System.out.print("Cédula del estudiante a eliminar: ");
                    String cedulaEli = sc.nextLine();
                    estudiantes.removeIf(e -> e.getCi().equals(cedulaEli));
                    System.out.println("Si existía, se eliminó.");
                    break;
                case 4:
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        } while (op != 4);
    }

    public static int menu(){
        Scanner sc = new Scanner(System.in);
        System.out.println("***Bienvenido al sistema de la Universidad PRO*** ");
        int opcion;
        do {
            System.out.println("*** Menu de opciones ***");
            System.out.println("1. Gestión de profesores");
            System.out.println("2. Gestión de estudiantes");
            System.out.println("3. Gestión de Facultades");

            System.out.println("4. Salir");
            opcion = sc.nextInt();
        }while (opcion <1 || opcion >4);
        return opcion;
    }






    //codigos de ejemplo
    public static void probandoUniversidad() {
        System.out.println("Hola");
        Estudiante est1 = new Estudiante();
        est1.setCarrera("Sistemas");
        est1.setNombre("Juan");
        System.out.println(est1.getNombre());
        //Persona persona1 = new Persona();
        String var1 = "Saludo?";
        System.out.println(var1);
        System.out.println(est1);
        Estudiante est2 = new Estudiante("Paul", "Guevara",
                "1234567895");

        ArrayList<Estudiante> estudiantes = new ArrayList<>();
    }
    public static void usoArrayList(){
        ArrayList<String> nombres = new ArrayList<String>();
        boolean vacio = nombres.isEmpty();
        System.out.println("vacio = " + vacio);
        nombres.add("Paul");
        vacio = nombres.isEmpty();
        System.out.println("vacio = " + vacio);
        nombres.add(0,"Meli");

        for (int i = 0; i<nombres.size(); i++){
            System.out.println(nombres.get(i));
        }
        System.out.println(nombres.get(0));
        System.out.println(nombres.getFirst());
        nombres.add("Juan");
        System.out.println(nombres.getLast());
        nombres.set(2,"Juanito");
        System.out.println(nombres.getLast());
        System.out.println("Lista desordenada");
        for (String nombre : nombres){
            System.out.println(nombre);
        }

        System.out.println("Lista ordenada");
        Collections.sort(nombres);
        for (String nombre : nombres){
            System.out.println(nombre);
        }
        System.out.println(nombres.getFirst());
        nombres.remove(0);
    }
}