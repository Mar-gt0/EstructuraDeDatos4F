package Practica1_Queue;

public interface IQueue2<T> {

    void offer(T element);
    T poll();
    T peek();
    void clear();
    void print();
    boolean isEmpty();
    int getSize();
}


