package ArrayQueue;

public class ArrayQueue<T> implements IQueue<T>{
    private Object[] data;
    private int rear;  //indice d einsercion
    private int front;
    private int size;
    private static final int INITIAL_CAPACITY = 10;

    public ArrayQueue(){
        this.data = new Object[INITIAL_CAPACITY];
        this.rear = 0;
        this.front = 0;
        this.size = 0;
    }

    @Override
    public void offer(T element) {
        //verificar la capacidad del array
        expandCapacity();
        data[rear] = element; // pone el elemento en el indice asignado (rear)
        rear = (rear + 1) % data.length;  //avanza en uno hasta que llega a la acapacidad del arreglo y regresa a cer (recalcula rear pero evita que se desborde)
        size++;
    }

    @SuppressWarnings("unchecked")
    @Override
    public T poll() {
        if (isEmpty()) {
            System.out.println("La pila esta vacia");
            return null;
        }
        T result = (T) data[front];
        data[front] = null;
        front = (front + 1) % data.length;
        size--;
        return result;
    }

 
    @Override
    public T peek() {
        if (isEmpty()) {
            System.out.println("La pila esta vacia");
            return null;
        }
        return (T) data[front];
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    private void expandCapacity(){
            Object[] newArr = new Object[data.length*2]; // creacion de un nuevo arreglo

            for (int i = 0; i < size; i++) {
                newArr[i] = data [(front+i) % data.length]; // vaciando la info comenzando d...
            }
            // reiniciamos los valores del arreglo para poderlo seguir usando
            front = 0; // pone el frende en la primera posicion
            data = newArr; // asigna el nuevo arreglo al tributo data
            rear = size; // indice de la siguiente insercion
            }


    @Override
    public void print() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < size; i++) {
            sb.append(data[ (front+i) % data.length]);
            if (i != 0) sb.append("->");
            
        }
        sb.append("]");
        System.out.println(sb.toString());
    }

    @Override
    public boolean isEmpty() {
        return size == 0; // verifica 
    }

    @Override
    public int getSize() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSize'");
    }

   
}
