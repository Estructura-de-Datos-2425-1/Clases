
package listadoble;

public class Nodo {
    private Nodo next, previous;
    private Object element;

    public Nodo(Object element) {
        this.next = this.previous = null;
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

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }
    
    
    
    
    
}
