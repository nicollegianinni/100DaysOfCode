package errors.RuntimeException;

public class MinhaClasseException extends Exception{

    private int num;
    private  int den;

    public MinhaClasseException(int num, int den) {
        super();
        this.num = num;
        this.den = den;
    }

    @Override
    public String toString() {
        return "Resultado de " + num + " / " + den+ " não é um numero inteiro!";
    }
}
