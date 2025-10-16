public class SingleLinkedlist {

    Node head;

    //agregar
    public void add(int data){
        Node newNode = new Node(data);//Crear un nuevo nodo
            if(head == null){// Verificacion de la lista vacia
                head =  newNode;
                return;
            }


            //Recorrido
            //(de la linea marcada en rojo me lo puedo aprender por que lo usaremos mucho)
            Node current = head;
                while (current.next != null) {// Recorrido de los nodos, hasta encontrar el ultimo
                    current = current.next;
                }

            //Insercion
            current.next = newNode; //Insertar un nuevo nodo al final de la list
    }

    public boolean contains(int data){
        Node current = head;
            while (current != null) {
                if (current.data == data) {//cuando comparamos primitivos si podemos hacer ==, pero cuando no se usa .equals
                    return true;
                }
                current = current.next;
            }
        return false;
    }

    public void remove(int data){
        if (head == null) { // pregunta si la lista esta vacia
            return;
        }
        if (head.data == data) { //valida que el dato este en el head
            head = head.next;
            return;
        }

        Node current = head;
            while (current.next != null && current.next.data != data) { //recorrer hasta encontrar el valor( valodando que el current.data sea diferente al valor que buscamos)
                current = current.next;   
            }

        current.next = current.next.next;
    }

    public void printList(){
        Node current = head;
            while (current != null) {
                System.out.println(current.data);
                current = current.next;
            }

            System.out.println("Null");
    }

    public int ocurrencias(int data){
        Node current = head;
        int contador = 0;
        while (current != null) {
                if (current.data == data) {//cuando comparamos primitivos si podemos hacer ==, pero cuando no se usa .equals
                contador++;
                }
                current = current.next;
            }

            return contador;//System.out.println("El numero de ocurrencias de ese valor es: " + contador);
    }

}
