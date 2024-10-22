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
    
    public double average(){
        if (isEmpty()) {
            return 0;
        } else {
            double suma = 0;
            Nodo pointer = getHead();
            while(pointer != null) {
                suma += (int) pointer.getElement();
                pointer = pointer.getNext();
            }
            return suma / getSize();
        }
    }
    
    public void reverse() {
        // 123456789 
        // 5->4->3->2->1-> null
        Nodo pointerCurrent = getHead(); //2
        Nodo pointerPrevious = null;// 1
        while (pointerCurrent != null) {
            Nodo pointerNext = pointerCurrent.getNext();//3
            pointerCurrent.setNext(pointerPrevious);
            pointerPrevious = pointerCurrent;
            pointerCurrent = pointerNext;
        }
        Nodo temp = getHead();
        setHead(getTail());
        setTail(temp);
    
    }
            
}
