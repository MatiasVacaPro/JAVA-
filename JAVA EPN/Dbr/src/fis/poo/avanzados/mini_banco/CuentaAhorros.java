// Archivo: mini_banco/CuentaAhorros.java
package mini_banco;

public class CuentaAhorros extends Cuenta {
    private static final double SALDO_MINIMO_REQUERIDO = 100.0;

    public CuentaAhorros(String numeroCuenta, double saldoInicial) {
        super(numeroCuenta, saldoInicial);
        if (saldoInicial < SALDO_MINIMO_REQUERIDO) {
            throw new IllegalArgumentException(
                    String.format("El saldo inicial (%.2f) para la cuenta de ahorros no puede ser menor que el mínimo requerido (%.2f).",
                            saldoInicial, SALDO_MINIMO_REQUERIDO)
            );
        }
    }

    @Override
    public void retirar(double monto) throws SaldoInsuficienteException, OperacionInvalidaException {
        if (monto <= 0) {
            throw new OperacionInvalidaException("El monto a retirar debe ser positivo.");
        }
        if ((this.saldo - monto) < SALDO_MINIMO_REQUERIDO) {
            throw new SaldoInsuficienteException(
                    String.format("Retiro no permitido. El saldo resultante (%.2f) sería menor al mínimo requerido de %.2f.",
                            (this.saldo - monto), SALDO_MINIMO_REQUERIDO)
            );
        }
        this.saldo -= monto;
    }

    @Override
    public String toString() {
        return String.format("Cuenta de Ahorros Nro: %s, Saldo: $%.2f", numeroCuenta, saldo);
    }
}