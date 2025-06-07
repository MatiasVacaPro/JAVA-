// Archivo: mini_banco/Cuenta.java
package mini_banco;

public abstract class Cuenta {
    protected String numeroCuenta;
    protected double saldo;

    public Cuenta(String numeroCuenta, double saldoInicial) {
        if (numeroCuenta == null || numeroCuenta.trim().isEmpty()) {
            throw new IllegalArgumentException("El número de cuenta no puede ser nulo o vacío.");
        }
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldoInicial;
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double monto) throws OperacionInvalidaException {
        if (monto <= 0) {
            throw new OperacionInvalidaException("El monto a depositar debe ser positivo.");
        }
        this.saldo += monto;
    }

    public abstract void retirar(double monto) throws SaldoInsuficienteException, LimiteSobregiroException, OperacionInvalidaException;

    @Override
    public String toString() {
        return String.format("Cuenta: %s, Saldo: $%.2f", numeroCuenta, saldo);
    }
}