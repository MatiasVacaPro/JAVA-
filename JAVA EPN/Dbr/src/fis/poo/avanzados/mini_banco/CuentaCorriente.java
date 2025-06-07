// Archivo: mini_banco/CuentaCorriente.java
package mini_banco;

public class CuentaCorriente extends Cuenta {
    private static final double LIMITE_SOBREGIRO = -500.0;
    private MembresiaPremium membresiaPremium;

    public CuentaCorriente(String numeroCuenta, double saldoInicial) {
        super(numeroCuenta, saldoInicial);
    }

    public CuentaCorriente(String numeroCuenta, double saldoInicial, MembresiaPremium membresiaPremium) {
        this(numeroCuenta, saldoInicial);
        this.membresiaPremium = membresiaPremium;
    }

    public MembresiaPremium getMembresiaPremium() {
        return membresiaPremium;
    }

    public void mostrarBeneficiosGimnasio() {
        if (membresiaPremium != null) {
            membresiaPremium.mostrarInformacion();
            membresiaPremium.mostrarOfertasEspeciales();
        } else {
            System.out.println("La cuenta no tiene membresía de gimnasio.");
        }
    }

    @Override
    public void retirar(double monto) throws LimiteSobregiroException, OperacionInvalidaException {
        if (monto <= 0) {
            throw new OperacionInvalidaException("El monto a retirar debe ser positivo.");
        }
        if ((this.saldo - monto) < LIMITE_SOBREGIRO) {
            throw new LimiteSobregiroException(
                    String.format("Retiro no permitido. El saldo resultante (%.2f) superaría el límite de sobregiro de %.2f.",
                            (this.saldo - monto), LIMITE_SOBREGIRO)
            );
        }
        this.saldo -= monto;
    }

    @Override
    public String toString() {
        String beneficio = (membresiaPremium != null) ? ", Gimnasio Premium" : "";
        return String.format("Cuenta Corriente Nro: %s, Saldo: $%.2f%s", numeroCuenta, saldo, beneficio);
    }
}