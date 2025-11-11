package PruebaExamenU2;


public class SingleLinkedList {
    Node head;

    public void add(Job data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public Job removeLast() {
        if (head == null) return null;
        if (head.next == null) {
            Job temp = head.data;
            head = null;
            return temp;
        }
        Node current = head;
        while (current.next.next != null) {
            current = current.next;
        }
        Job temp = current.next.data;
        current.next = null;
        return temp;
    }

    public int size() {
        int count = 0;
        Node current = head;
        while (current != null) {
            count++;
            current = current.next;
        }
        return count;
    }

    public void print() {
        Node current = head;
        System.out.print("[");
        while (current != null) {
            System.out.print(current.data);
            if (current.next != null) System.out.print(" -> ");
            current = current.next;
        }
        System.out.println("]");
    }
}