package EjercicioSuma;

public class SumaRecursiva {

    public static int SumaRecur(int numero){
        if(numero <= 0){
            return numero;
        }else{
            return numero + SumaRecur(numero - 1);
        }
    }

    public static void main(String[] args) {
        int resultado = SumaRecur(3);

            System.out.println(resultado);
        


    }

}

