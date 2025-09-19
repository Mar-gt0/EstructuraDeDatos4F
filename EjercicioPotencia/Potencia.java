package EjercicioPotencia;

public class Potencia {

    public static int elevarPontencia(int base, int exponente){
        if(exponente == 0){
            return 1;
        }else{
            return base * elevarPontencia(base, exponente - 1);
        }
    }

    public static void main(String[] args) {
        int potencia = elevarPontencia(2, 0);

        System.out.println("El resultado es: " + potencia);
    
    }

}
