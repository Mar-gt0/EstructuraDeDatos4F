package PruebaExamenU2;

public class ArrayStack<T> {
    private Object[] data;
    private int top;

    public ArrayStack() {
        data = new Object[10];
        top = 0;
    }

    public void push(T element) {
        if (top == data.length) return;
        data[top++] = element;
    }

    @SuppressWarnings("unchecked")
    public T pop() {
        if (isEmpty()) return null;
        T result = (T) data[--top];
        data[top] = null;
        return result;
    }

    public boolean isEmpty() {
        return top == 0;
    }

    public void print() {
        System.out.print("[");
        for (int i = 0; i < top; i++) {
            System.out.print(data[i]);
            if (i < top - 1) System.out.print(" -> ");
        }
        System.out.println("]");
    }
}