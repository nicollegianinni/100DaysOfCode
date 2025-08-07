package variaveisecontroledefluxo;

//calcular o N-ésimo numero de uma função
public class Fibonacci {

    public int fibonacci(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;

        int a = 0; // F(0)
        int b = 1; // F(1)
        int fib = 0;

        for (int i = 2; i <= n; i++) {
            fib = a + b;
            a = b;
            b = fib;
        }

        return fib;
    }

    public static void main(String[] args) {
        Fibonacci f1 = new Fibonacci();

        System.out.println("O resultado de 8 Fibonacci é: " + f1.fibonacci(8));
    }
}
