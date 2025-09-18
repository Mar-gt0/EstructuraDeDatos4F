package EjercicioFibonacci;

public class CasoFibonacci {

    public static int fibonacci(int n) {
            if (n <= 1) {
                return n;
            }else{
                return fibonacci(n - 1) +  fibonacci(n - 2);
                
            }
        }
    public static void main(String[] args) {
      int resultado = fibonacci(5);
    
        for (int i = 0; i < resultado; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    }

