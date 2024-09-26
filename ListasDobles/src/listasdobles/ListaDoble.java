package listasdobles;

public class ListaDoble implements ILista {
    private Nodo head, tail;
    private int size = 0;
    
    public ListaDoble() {
        this.head = this.tail = null;
        this.size = 0;
    }

    @Override
    public Object insertBegin(Object element) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            setHead(nodo);
            setTail(nodo);
        } else {
            getHead().setPrevious(nodo);
            nodo.setNext(getHead());
            setHead(nodo);
        }
        size++;
        return nodo;
    }

    @Override
    public Object insertFinal(Object element) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            setHead(nodo);
            setTail(nodo);
        } else {
            nodo.setPrevious(getTail());
            getTail().setNext(nodo);
            setTail(nodo);
        }
        size++;
        return nodo;
    }

    @Override
    public Object insertInIndex(Object element, int index) {
        Nodo nodo = new Nodo(element);
        if (index < 0) {
            System.out.println("Index error");
        } else if (index > getSize()) {
            System.out.println("Index error");
        } else if (isEmpty()) {
            insertBegin(element);
        } else if(index == 0) {
            insertBegin(element);
        } else if (index == getSize()) {
            insertFinal(element);
        } else {
            if (index > (int)(size / 2)) {
                Nodo pointer = getTail();
                int end = getSize() - index - 1; 
                int aux = 0;
                while (pointer.getPrevious() != null && aux < end) {
                    pointer = pointer.getPrevious();
                    aux++;
                }
                Nodo pointer2 = pointer.getPrevious();
                nodo.setPrevious(pointer2);
                nodo.setNext(pointer);
                pointer2.setNext(nodo);
                pointer.setPrevious(nodo);
            } else {
                Nodo pointer = getHead();
                int aux = 0;//2
                while (pointer.getNext() != null && aux < index-1) {
                    pointer = pointer.getNext();
                    aux++;
                } 
                Nodo pointer2 = pointer.getNext();
                nodo.setNext(pointer.getNext());
                nodo.setPrevious(pointer2.getPrevious());
                pointer.setNext(nodo);
                pointer2.setElement(nodo);
            }
            size++;
        }  
        return nodo;
    }

    @Override
    public Object deleteBegin() {
        if (isEmpty()) {
            System.out.println("The list is empty");
            return null;
        } else {
            Nodo pointer = getHead();
            if (getHead() == getTail()) {
                // Tengo un solo elemento
                setHead(null);
                setTail(null);
                return pointer;
            } else {
                setHead(pointer.getNext());
                pointer.setNext(null);
                getHead().setPrevious(null);
            }
            size--;
            return pointer;
        }
    }

    @Override
    public Object deleteFinal() {
        if (isEmpty()) {
            System.out.println("The list is empty");
            return null;
        } else {
            Nodo pointer = getTail();
            if (getHead() == getTail()) {
                // Tengo un solo elemento
                setHead(null);
                setTail(null);
                return pointer;
            } else {
                setTail(pointer.getPrevious());
                pointer.setPrevious(null);
                getTail().setNext(null);
            }
            size--;
            return pointer;
        }
    }

    @Override
    public Object deleteInIndex(int index) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean isEmpty() {
        return getHead() == null && getTail() == null;
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
}
