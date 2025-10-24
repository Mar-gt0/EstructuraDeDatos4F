package ArrayStack;

public interface IStack<T> {

    void push(T data);
    T pop();
    T peek();
    void cleaar();
    int size();
    boolean isEmpty();
    void print();

}
