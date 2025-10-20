package EjercicioSingleLinkedList;

public class MainSingleList {
    public static void main(String[] args) {
        SingleList listaNueva = new SingleList();
        listaNueva.add(5);
        listaNueva.add(3);
        listaNueva.add(5);
        listaNueva.add(7);
        listaNueva.add(3);
        listaNueva.add(9);

        System.out.println("--- Lista original ---");
        listaNueva.printList();

        listaNueva.removeDuplicado();
        System.out.println("--- Lista verificada ---");
        listaNueva.printList();



    }

}
