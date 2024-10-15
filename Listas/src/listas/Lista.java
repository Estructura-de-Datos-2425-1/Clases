package listas;

public class Lista implements ILista {
    
    private Nodo head;
    private int size;

    public Lista() {
        this.head = null;
        this.size = 0;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty() {
        return head == null;
    }
    
    public Nodo insertBegin(Object element) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()){
            setHead(nodo);
        } else {
            nodo.setNext(getHead());
            setHead(nodo);
        }
        size++;
        return nodo;
    }
    
    public Nodo insertFinal(Object element) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            setHead(nodo);
        } else {
            Nodo pointer = getHead();
            while(pointer.getNext() != null) {
                pointer = pointer.getNext();
            }
            pointer.setNext(nodo);
        }
        size++;
        return nodo;
    }
    
    public Nodo insertInIndex(Object element, int index){
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            setHead(nodo);
            size++;
        } else {
            if (index < 0) {
                System.out.println("Error invalid index");
            } else if(index > size) {
                System.out.println("Error index out of range");
            } else if(index == 0) {
                insertBegin(element);
            } else if (index == size){
                insertFinal(element);
            } else {
                Nodo pointer = getHead();
                int aux = 0;
                while (pointer.getNext() != null && aux < index -1) {
                    pointer = pointer.getNext();
                    aux++;
                }
                nodo.setNext(pointer.getNext());
                pointer.setNext(nodo);
                size++;
            }
        }
        return nodo;
    }
    
    public Nodo deleteBegin(){
        if (isEmpty()) {
            System.out.println("Error list is empty");
            return null;
        } else {
            Nodo pointer = getHead();
            setHead(pointer.getNext());
            pointer.setNext(null);
            size--;
            return pointer;
        }
    }
    
    public Nodo deleteFinal() {
        if (isEmpty()) {
            System.out.println("Error list is empty");
            return null;
        } else {
            Nodo pointer = getHead();
            while (pointer.getNext().getNext() != null) {
                pointer = pointer.getNext();
            }
            Nodo temp = pointer.getNext();
            pointer.setNext(null);
            size--;
            return temp;
        }
    }
    
    public Nodo deleteInIndex(int index){
        if (isEmpty()) {
            System.out.println("Error list is empty");
        } else {
            if (index < 0) {
                System.out.println("Error invalid index");
            } else if(index > size) {
                System.out.println("Error index out of range");
            } else if(index == 0) {
                return deleteBegin();
            } else if (index == size-1){
                return deleteFinal();
            } else {
                Nodo pointer = getHead();//3
                int aux = 0;//2
                while (pointer.getNext() != null && aux < index -1) {
                    pointer = pointer.getNext();
                    aux++;
                }
                Nodo pointerAux = pointer.getNext();
                pointer.setNext(pointerAux.getNext());
                pointerAux.setNext(null);
                size--;
                return pointerAux;
            }
        }
        return null;
    }
    
    public void print() {
        Nodo pointer = getHead();
        while (pointer != null) {
            System.out.print("["+pointer.getElement()+"]");
            pointer = pointer.getNext();
        }
    }
}
