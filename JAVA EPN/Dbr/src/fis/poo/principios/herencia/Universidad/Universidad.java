package fis.poo.principios.herencia.Universidad;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Universidad {
    ArrayList<Facultad> facultades;

    public ArrayList<Facultad> getFacultades() {
        return facultades;
    }

    public void anadirFacultad(Facultad facultad) {
        facultades.add(facultad);
    }
}