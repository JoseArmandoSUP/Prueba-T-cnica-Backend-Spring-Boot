package backend.exceptions;

public class NoEncontradoException extends RuntimeException {
    public NoEncontradoException(String mensaje){
        super(mensaje);
    }
}
