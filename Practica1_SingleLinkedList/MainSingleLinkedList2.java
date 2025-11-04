package Practica1_SingleLinkedList;

public class MainSingleLinkedList2 {
    public static void main(String[] args) {
        SingleLinkedList2 original = new SingleLinkedList2();
        original.add(1);
        original.add(2);
        original.add(3);
        original.add(4);
        original.add(5);

        System.out.println("Lista original:");
        original.printList();
        System.out.println();

        SingleLinkedList2 pares = new SingleLinkedList2();
        SingleLinkedList2 impares = new SingleLinkedList2();

        original.dividirEnParesEImpares(pares, impares);

        System.out.println("Lista de pares:");
        pares.printList();

        System.out.println();

        System.out.println("Lista de impares:");
        impares.printList();
    }


}
