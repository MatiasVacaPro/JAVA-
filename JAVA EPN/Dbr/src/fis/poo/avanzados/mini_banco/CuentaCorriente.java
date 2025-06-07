// Archivo: mini_banco/CuentaCorriente.java
package mini_banco;

public class CuentaCorriente extends Cuenta {
    private static final double LIMITE_SOBREGIRO = -500.0;

    public CuentaCorriente(String numeroCuenta, double saldoInicial) {
        super(numeroCuenta, saldoInicial);
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
        return String.format("Cuenta Corriente Nro: %s, Saldo: $%.2f", numeroCuenta, saldo);
    }
}