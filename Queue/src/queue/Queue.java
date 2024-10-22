package queue;

public class Queue {
    private Nodo head, tail;
    private int size;

    public Queue() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    public Nodo getHead() {
        return head;
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public Nodo getTail() {
        return tail;
    }

    public void setTail(Nodo tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
    
    public boolean isEmpty() {
        return getHead() == null && getTail() == null;
    }
    
    public Nodo enqueue(Object element) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            setHead(nodo);
            setTail(nodo);
        } else {
            getTail().setNext(nodo);
            setTail(nodo);
        }
        size++;
        return nodo;
    }
    
    public Nodo dequeue() {
        if (isEmpty()) {
            System.out.println("The queue is empty");
            return null;
        } else {
            Nodo pointer = getHead();
            if (getTail() == getHead()) {
                setHead(null);
                setTail(null);
            } else {
                setHead(pointer.getNext());
                pointer.setNext(null);
            }
            size--;
            return pointer;
        }
    }
    
    public Nodo dispatch() {
        if (!isEmpty()){
            System.out.println("["+getHead().getElement()+"]");
        }
        return dequeue();
    }
    
    public void print() {
        Nodo pointer = getHead();
        while (pointer != null) {
            System.out.print("["+pointer.getElement()+"]");
            pointer = pointer.getNext();
        }
    }
            
}
