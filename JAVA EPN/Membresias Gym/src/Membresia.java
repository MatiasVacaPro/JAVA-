//Membresia

public abstract class Membresia {
    // Atributos de todas las membresías
    protected String nombreMiembro;
    protected String tipo; //
    protected int duracionMeses;
    protected static final double COSTO_BASE_MENSUAL = 50.0;

    public Membresia(String nombreMiembro, String tipo, int duracionMeses) {
        this.nombreMiembro = nombreMiembro;
        this.tipo = tipo;
        this.duracionMeses = duracionMeses;
    }

    // Metodo para visualizar las ofertas
    public void mostrarOfertasEspeciales() {
        System.out.println("--- Ofertas Especiales ---");
        if ("anual".equalsIgnoreCase(this.tipo)) {
            System.out.println("🎉 ¡Oferta! Tienes un 10% de descuento por tu membresía anual.");
        } else {
            System.out.println("Actualmente no hay ofertas para membresías mensuales.");
        }
    }

    // Métodos abstractos se ejecutan por las clases hijas
    public abstract void mostrarInformacion();
    public abstract double calcularCosto();
}