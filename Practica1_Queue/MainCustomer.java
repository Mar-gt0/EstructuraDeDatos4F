package Practica1_Queue;


public class MainCustomer {
    public static void main(String[] args) {
        ArrayQueue2<Customer> queue = new ArrayQueue2<>();

        queue.offer(new Customer(1, "Mar"));
        queue.offer(new Customer(2, "Alan"));
        queue.offer(new Customer(3, "Xime"));
        queue.offer(new Customer(4, "Yeni"));
        queue.offer(new Customer(5, "Leo"));
        queue.offer(new Customer(6, "Bren"));

        System.out.println("--- Antes de invertir ---");
        
        queue.print();
        int tamanoAntes = queue.getSize();

        queue.reverse();
        System.out.println();
        System.out.println("--- Después de invertir ---");
        queue.print();
        int tamanoDespues = queue.getSize();

        System.out.println();

        System.out.println("Elementos antes = " + tamanoAntes + ", elementos después = " + tamanoDespues);
    }
}