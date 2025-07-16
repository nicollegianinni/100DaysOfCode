package errors.Throws;
// No Runtime Exception (os não checados) o THROW NEW (lançe uma nova exceção) não precisa colocar assinatura no metodo
// mas no IOException (os checadas precisam)
public class ThrowNaoChecados {
    public static void main(String[] args) {
        divisao(2,0);

    }

    private static  int divisao (int a, int b){
        if (b ==0){
            throw new IllegalArgumentException("Argumento ilegal, não pode ser por 0.");

        }return a/b;
    }
}
