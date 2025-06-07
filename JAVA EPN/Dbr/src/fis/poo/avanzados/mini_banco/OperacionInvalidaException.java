package mini_banco;

public class OperacionInvalidaException extends Exception {
    public OperacionInvalidaException(String message) {
        super(message);
    }
}