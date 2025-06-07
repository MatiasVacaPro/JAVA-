// Membresia Premiun

public class MembresiaPremium extends Membresia {

    private boolean tieneEntrenador;
    private boolean tieneAccesoSpa;

    public MembresiaPremium(String nombreMiembro, String tipo, int duracionMeses, boolean tieneEntrenador, boolean tieneAccesoSpa) {
        super(nombreMiembro, tipo, duracionMeses);
        this.tieneEntrenador = tieneEntrenador;
        this.tieneAccesoSpa = tieneAccesoSpa;
    }

    @Override
    public double calcularCosto() {
        double costoMensual = COSTO_BASE_MENSUAL;

        if (this.tieneEntrenador) {
            costoMensual += 30.0; // Costo extra por entrenador
        }
        if (this.tieneAccesoSpa) {
            costoMensual += 20.0; // Costo extra por SPA
        }

        double costoTotal = costoMensual * this.duracionMeses;

        // Descuento anualidad
        if ("anual".equalsIgnoreCase(this.tipo)) {
            costoTotal *= 0.90; // Descuento del 10%
        }

        return costoTotal;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("--- Membresía Premium ---");
        System.out.println("Miembro: " + this.nombreMiembro);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Duración: " + this.duracionMeses + " meses");
        System.out.println("Entrenador Personal: " + (this.tieneEntrenador ? "Sí" : "No"));
        System.out.println("Acceso al SPA: " + (this.tieneAccesoSpa ? "Sí" : "No"));
        System.out.printf("Costo Total: $%.2f%n", this.calcularCosto());
    }
}