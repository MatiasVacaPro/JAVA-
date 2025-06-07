package fis.poo.principios.herencia.Universidad;

import java.util.ArrayList;

public class Asignatura {
    private String nombre;
    private String codigo;
    private int creditos;
    private int nivel;

    public Asignatura(String nombre, String codigo, int creditos, int nivel) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.creditos = creditos;
        this.nivel = nivel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public int getCreditos() {
        return creditos;
    }

    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }
}