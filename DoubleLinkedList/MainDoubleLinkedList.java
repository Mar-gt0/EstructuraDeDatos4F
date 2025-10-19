package DoubleLinkedList;

public class MainDoubleLinkedList {

    public static void main(String[] args) throws Exception {
        DoublelinkedList list = new DoublelinkedList();
        list.printFordward();
        list.add(1);
        list.add(2);
        list.add(5);
        list.add(6);
        list.add(7);
        list.printFordward();
        System.out.println("-------- imprimir backward--------");
        list.printBackward();
        System.out.println();
        
        System.out.println("Lista original");
        list.printFordward();
        System.out.println();
        System.out.println("Imprimir lista borrando un valor");
        list.remove(5);
        list.printFordward();
    }
}
