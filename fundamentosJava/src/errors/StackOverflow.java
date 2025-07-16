package errors;

// EXEMPLO DE ESTOURAR A STACK POR UM METODO CHAMAR OUTRO METODO NUM LOOP ATE ACABAR A MEMORIA E APONTAR O ERROR
public class StackOverflow {
    public static void main(String[] args) {

        chamadaLoop();
    }
    public static void chamadaLoop(){
        chamadaLoop();
    }
}
