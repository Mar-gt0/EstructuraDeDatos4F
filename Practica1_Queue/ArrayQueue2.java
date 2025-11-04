package Practica1_Queue;

import java.util.Stack;

public class ArrayQueue2<T> implements IQueue2<T> {
    private Object[] data;
    private int rear;
    private int front;
    private int size;
    private static final int INITIAL_CAPACITY = 10;
    public ArrayQueue2() {
        this.data = new Object[INITIAL_CAPACITY];
        this.rear = 0;
        this.front = 0;
        this.size = 0;
    }
    @Override
    public void offer(T element) {
        expandCapacity();
        data[rear] = element;
        rear = (rear + 1) % data.length;
        size++;
    }
    private void expandCapacity() {
            if (size == data.length) {
                Object[] newArr = new Object[data.length * 2];
                for (int i = 0; i < size; i++) {
                    newArr[i] = data[(front + i) % data.length];
                }
                front = 0;
                rear = size;
                data = newArr;
            }
        }
        // mtodo para invertir la cola usando Stack
        public void reverse() {
            Stack<T> stack = new Stack<>();
            while (!isEmpty()) {
                stack.push(poll());
            }
            while (!stack.isEmpty()) {
                offer(stack.pop());
            }
        }

        @Override
        public void print() {
            StringBuilder sb = new StringBuilder();
            sb.append("[");
            for (int i = 0; i < size; i++) {
                sb.append(data[(front + i) % data.length]);
                if (i < size - 1) sb.append(", ");
            }
            sb.append("]");
            System.out.println(sb.toString());
        }

        @Override
        public boolean isEmpty() {
            return size == 0;
        }

        @Override
        public int getSize() {
            return size;
        }

        
    @SuppressWarnings("unchecked")
    @Override
    public T poll() {
        if (isEmpty()) {
            System.out.println("La cola está vacía");
            return null;
        }
        T result = (T) data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        return result;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("La cola está vacía");
            return null;
        }
        return (T) data[front];
    }

    @Override
    public void clear() {
    
    }

    
}