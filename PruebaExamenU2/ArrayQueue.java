package PruebaExamenU2;


public class ArrayQueue<T> {
    private Object[] data;
    private int front;
    private int rear;
    private int size;

    public ArrayQueue() {
        data = new Object[10];
        front = 0;
        rear = 0;
        size = 0;
    }

    public void offer(T element) {
        if (size == data.length) return;
        data[rear] = element;
        rear = (rear + 1) % data.length;
        size++;
    }

    @SuppressWarnings("unchecked")
    public T poll() {
        if (isEmpty()) return null;
        T result = (T) data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        return result;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            System.out.print(data[(front + i) % data.length]);
            if (i < size - 1) System.out.print(" -> ");
        }
        System.out.println("]");
    }

    public void addFront(T element) {
        front = (front - 1 + data.length) % data.length;
        data[front] = element;
        size++;
    }
}