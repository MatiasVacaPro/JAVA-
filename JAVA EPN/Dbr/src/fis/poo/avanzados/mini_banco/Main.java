// Archivo: mini_banco/Main.java
package mini_banco;

public class Main {

    public static void main(String[] args) {
        System.out.println("Bienvenido al Sistema del MiniBanco");

        // --- Pruebas con Cuenta de Ahorros ---
        System.out.println("\n--- Creando y operando Cuenta de Ahorros ---");
        CuentaAhorros ca1 = null;
        try {
            ca1 = new CuentaAhorros("AH-001", 200.00);
            System.out.println("Cuenta de Ahorros creada: " + ca1);

            ca1.depositar(50.00);
            System.out.println("Tras depósito de $50.00: " + ca1); // Saldo: 250.00

            ca1.retirar(100.00);
            System.out.println("Tras retiro de $100.00: " + ca1); // Saldo: 150.00

            System.out.println("\nIntentando retirar $60.00 (saldo quedaría en $90.00, mínimo $100.00)...");
            ca1.retirar(60.00); // Esto debería lanzar SaldoInsuficienteException
            System.out.println("Retiro de $60.00 exitoso (inesperado): " + ca1);

        } catch (IllegalArgumentException | OperacionInvalidaException | SaldoInsuficienteException e) {
            System.err.println("ERROR en Cuenta de Ahorros: " + e.getMessage());
            if (ca1 != null) {
                System.out.println("Estado actual de " + ca1.getNumeroCuenta() + ": " + ca1.getSaldo());
            }
        }

        System.out.println("\n--- Intentando crear Cuenta de Ahorros con saldo inicial inválido ---");
        try {
            CuentaAhorros ca2 = new CuentaAhorros("AH-002", 50.00); // Saldo inicial < 100.00
            System.out.println("Cuenta de Ahorros creada (inesperado): " + ca2);
        } catch (IllegalArgumentException e) {
            System.err.println("ERROR al crear Cuenta de Ahorros: " + e.getMessage());
        }

        // --- Pruebas con Cuenta Corriente ---
        System.out.println("\n\n--- Creando y operando Cuenta Corriente ---");
        CuentaCorriente cc1 = null;
        try {
            cc1 = new CuentaCorriente("CC-001", 300.00);
            System.out.println("Cuenta Corriente creada: " + cc1);

            cc1.depositar(100.00);
            System.out.println("Tras depósito de $100.00: " + cc1); // Saldo: 400.00

            cc1.retirar(200.00);
            System.out.println("Tras retiro de $200.00: " + cc1); // Saldo: 200.00

            System.out.println("\nIntentando retirar $600.00 (saldo quedaría en -$400.00, límite sobregiro -$500.00)...");
            cc1.retirar(600.00);
            System.out.println("Tras retiro de $600.00: " + cc1); // Saldo: -400.00

            System.out.println("\nIntentando retirar $200.00 más (saldo actual -$400.00, quedaría en -$600.00)...");
            cc1.retirar(200.00); // Esto debería lanzar LimiteSobregiroException
            System.out.println("Retiro de $200.00 exitoso (inesperado): " + cc1);

        } catch (IllegalArgumentException | OperacionInvalidaException | LimiteSobregiroException e) {
            System.err.println("ERROR en Cuenta Corriente: " + e.getMessage());
            if (cc1 != null) {
                System.out.println("Estado actual de " + cc1.getNumeroCuenta() + ": " + cc1.getSaldo());
            }
        }

        // --- Prueba de operación inválida (depósito negativo) ---
        System.out.println("\n\n--- Intentando depósito con monto negativo ---");
        if (ca1 != null) {
            try {
                System.out.println("Intentando depositar -$50.00 en " + ca1.getNumeroCuenta() + "...");
                ca1.depositar(-50.00); // Debería lanzar OperacionInvalidaException
                System.out.println("Depósito de -$50.00 exitoso (inesperado).");
            } catch (OperacionInvalidaException e) {
                System.err.println("ERROR al depositar: " + e.getMessage());
                System.out.println("Estado de la cuenta sin cambios: " + ca1);
            }
        }
        System.out.println("\nFin de las pruebas del MiniBanco.");
    }
}