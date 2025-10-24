package EjercicioCadena;

public class CadenaInvertida {

    

    public static void main(String[] args) {
        String palabra = "marlen";
        String palabraInvertida = " ";

        for(int i = palabra.length()-1; i>=0; i-- ){
            palabraInvertida = palabraInvertida + palabra.substring(i, i + 1);
        }
        System.out.println("La palabra invertida es: " + palabraInvertida);

    }
}

