package ArrayStack;


public class ArrayStack<T> implements IStack<T> {
    private Object[] data;
    private int top; // no indicara el indice donde estamos trabajando

    public ArrayStack(){ // constructor 1 vacio
        this(10); //invoca al constructor 2
    }

    //constructor 2
    public ArrayStack(int initialCapacity){
        this.data = new Object[initialCapacity];
        this.top = 0;
    }

    @Override
    public void push(T element) {
        //nos vamos a asegurar que aun tenga espacio el array
        data[top] = (T) element;
        top++;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T pop() {
        if(isEmpty()){
            System.out.println("La pila esta vacia");
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
            System.out.println("La pila esta vacia");
            return null;
        }
        return (T) data[top];
    }

    @Override
    public void clear() {
        while (top > 0){
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
        if(top == 0){
            return true;
        }else{
            return false;
        }
    }

    @Override
    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = top-1; i >= 0; i--) {
            sb.append(data[i]);
            if(i!= 0){
                sb.append("->");
            }
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    
}


//hereddar = extends
//usar interfaz = implements