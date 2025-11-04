package Practica1_Stack;

public class MainPalindroma {
    
        public static boolean isPalindrome(String text) {
            ArrayStack2<Character> stack = new ArrayStack2<>();
    
            // Normalizar texto: quitar espacios, signos y pasar a minúsculas
            String clean = "";
            for (int i = 0; i < text.length(); i++) {
                char c = text.charAt(i);
                if (Character.isLetterOrDigit(c)) {
                    clean += Character.toLowerCase(c);
                    stack.push(Character.toLowerCase(c));
                }
            }
    
            // Comparar con lo que sale de la pila
            for (int i = 0; i < clean.length(); i++) {
                if (clean.charAt(i) != stack.pop()) {
                    return false;
                }
            }
            return true;
        }
    
        public static void main(String[] args) {
            String frase1 = "Anita lava la tina";
            String frase2 = "Hola";
    
            System.out.println( frase1 + " -> " + isPalindrome(frase1));
            System.out.println(frase2 + " -> " + isPalindrome(frase2));
        }
    }




