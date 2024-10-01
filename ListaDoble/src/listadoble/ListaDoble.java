
package listadoble;

public class ListaDoble implements ILista{
    private Nodo head, tail;
    private int size;
    
    public ListaDoble() {
        this.head = this.tail = null;
        size = 0;
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

    @Override
    public void insertBegin(Object element) {
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
    }

    @Override
    public void insertFinal(Object element) {
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
    }

    @Override
    public void insertInIndex(Object element, int index) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            insertBegin(element);
        } else {
            if (index < 0) {
                System.out.println("Index Error");
            } else if (index > size) {
                System.out.println("Index Error");
            } else if (index == size) {
                insertFinal(element);
            } else if (index == 0) {
                insertBegin(element);
            } else {
                if ((index > (int)(size/2))) {
                    Nodo pointer = getTail();
                    int end = size - index;
                    int aux = 0;    
                    while (aux < end) {
                        pointer = pointer.getPrevious();
                        aux++;
                    }
                    Nodo pointer2 = pointer.getNext();
                    nodo.setNext(pointer2);
                    nodo.setPrevious(pointer);
                    pointer.setNext(nodo);
                    pointer2.setPrevious(nodo);
                } else {
                    int aux = 1; 
                    Nodo pointer = getHead();
                    while (aux < index) {
                        pointer = pointer.getNext();
                        aux++;
                    }
                    Nodo pointer2 = pointer.getNext();
                    nodo.setNext(pointer2);
                    nodo.setPrevious(pointer);
                    pointer.setNext(nodo);
                    pointer2.setPrevious(nodo);
                }
                size++;
            }
        }
    }

    @Override
    public Object deleteBegin() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object deleteFinal() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object deleteInIndex(int index) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean isEmpty() {
        return getHead() == null && getTail() == null;
    }
    
    public void print() {
        Nodo pointer = getHead();
        while (pointer != null) {
            System.out.println("[ "+pointer.getElement() + " ]");
            pointer = pointer.getNext();
        }
    }
    
}
