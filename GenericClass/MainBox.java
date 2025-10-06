package Generico;

import java.util.ArrayList;

public class MainBox {

    public static <T> void printArray(T[] array){
        for (T v : array) {
            System.out.println(v);
        }
    }

    public static void main(String[] args) {
        Box<String> box1 = new Box<String>("Esta es una caja de strings");
        System.out.println(box1.getValue());

        Box<Integer> box2 = new Box<Integer>(3);
        System.out.println(box2.getValue());

        List<String> list = new ArrayList<>();

        Pair<String, Integer> pair = new Pair<String, Integer>();
        System.out.println("La key es: "+ pair.getKey());
        System.out.println("Valor: "+ pair.getValue());

        String[] arrayString = {"Hola1", "Hola2", "Hola3"};
        Integer[] arrInt = {4, 5, 9, 10} 

        printArray(arrayString);
        System.out.println("----------------------------------");
        printArray(arrInt);
        System.out.println("----------------------------------");

        Student[] students = new Student[2];
        Student st1 = new Student(1, "Test1"):
        Student st2 = new Student(2, "Test2"):

        

    }
}
