package Practica1_Stack;

public class ArrayStack2<T> implements IStack2<T> {
    private Object[] data;
    private int top;

    public ArrayStack2() {
        this(50);
    }

    public ArrayStack2(int initialCapacity) {
        this.data = new Object[initialCapacity];
        this.top = 0;
    }
    @Override
    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = top - 1; i >= 0; i--) {
            sb.append(data[i]);
            if (i != 0) {
                sb.append("->");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    @Override
    public void push(T element) {
        data[top] = element;
        top++;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T pop() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return null;
        }
        T value = (T) data[--top];
        data[top] = null;
        return value;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("La pila está vacía");
            return null;
        }
        return (T) data[top];
    }

    @Override
    public void clear() {
        while (top > 0) {
            top--;
            data[top] = null;
        }
    }

    @Override
    public int size() {
        return top;
    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    
}