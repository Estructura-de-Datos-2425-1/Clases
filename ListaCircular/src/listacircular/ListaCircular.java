package listacircular;

public class ListaCircular implements ILista {
    
    private Nodo head;
    private int size;

    public ListaCircular() {
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
            nodo.setNext(nodo);
            setHead(nodo);
        } else {
            Nodo pointer = getHead();
            while (pointer.getNext() != getHead()) {
                pointer = pointer.getNext();
            }
            nodo.setNext(getHead());
            setHead(nodo);
            pointer.setNext(getHead());
        }
        size++;
        return nodo;
    }
    
    public Nodo insertFinal(Object element) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            nodo.setNext(nodo);
            setHead(nodo);
        } else {
            Nodo pointer = getHead();
            while(pointer.getNext() != getHead()) {
                pointer = pointer.getNext();
            }
            pointer.setNext(nodo);
            nodo.setNext(getHead());
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
                while (pointer.getNext() != getHead() && aux < index -1) {
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
            Nodo pointer2 = getHead();
            
            if(getHead().getNext() == getHead()) {
                pointer.setNext(null);
                setHead(null);
            } else {
                while(pointer2.getNext() != getHead()) {
                    pointer2 = pointer2.getNext();
                }
                pointer2.setNext(getHead().getNext());
                // 
                setHead(pointer.getNext());
                pointer.setNext(null);
            }
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
            if (getHead().getNext() == getHead()) {
                pointer.setNext(null);
                setHead(null);
                return pointer;
            } else {
                while (pointer.getNext().getNext() != getHead()) {
                    pointer = pointer.getNext();
                }
                Nodo temp = pointer.getNext();
                pointer.setNext(getHead());
                size--;
                return temp;
            }
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
                while (pointer.getNext() != getHead() && aux < index -1) {
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
        boolean isFirstTime = true;
        while (isFirstTime || pointer != getHead()) {
            isFirstTime = false;
            System.out.print("["+pointer.getElement()+"]");
            pointer = pointer.getNext();
        }
        System.out.println("");
    }
}
