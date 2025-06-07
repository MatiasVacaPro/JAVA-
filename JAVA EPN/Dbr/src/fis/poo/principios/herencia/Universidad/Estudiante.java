package fis.poo.principios.herencia.Universidad;

public class Estudiante extends Persona{
    private int codUnico;
    private String carrera;
    private int CreditosAprobados;
    boolean gratuidad;

    //COnstructores
    public Estudiante() {
        super();
    }
    public Estudiante(String nombre, String apellido, String ci){
        super();
        setNombre(nombre);
        setApellido(apellido);
        setCi(ci);
    }
    public int getCodUnico() {
        return codUnico;
    }

    public void setCodUnico(int codUnico) {
        this.codUnico = codUnico;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "nombre=" + nombre + '}';
    }
}