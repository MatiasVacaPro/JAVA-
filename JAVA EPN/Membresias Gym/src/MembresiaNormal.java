// Membresia Normal
public class MembresiaNormal extends Membresia {

    public MembresiaNormal(String nombreMiembro, String tipo, int duracionMeses) {
        super(nombreMiembro, tipo, duracionMeses);
    }

    @Override
    public double calcularCosto() {
        double costoTotal = COSTO_BASE_MENSUAL * this.duracionMeses;
        // si es anual aplicar el descuento
        if ("anual".equalsIgnoreCase(this.tipo)) {
            costoTotal *= 0.90; // Descuento del 10%
        }
        return costoTotal;
    }

    @Override
    public void mostrarInformacion() {
        System.out.println("--- Membresía Normal ---");
        System.out.println("Miembro: " + this.nombreMiembro);
        System.out.println("Tipo: " + this.tipo);
        System.out.println("Duración: " + this.duracionMeses + " meses");
        System.out.printf("Costo Total: $%.2f%n", this.calcularCosto());
    }
}
