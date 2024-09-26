package listasdobles;


public class Nodo {
    private Object element;
    private Nodo next, previous;
    
    public Nodo(Object element) {
        this.element = element;
        this.next = this.previous = null;
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }

    public Nodo getPrevious() {
        return previous;
    }

    public void setPrevious(Nodo previous) {
        this.previous = previous;
    }
    
}
