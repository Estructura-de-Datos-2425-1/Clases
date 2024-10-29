package trees;


public class Nodo {
    private Object element;
    private int key;
    private Nodo[] sons;

    public Nodo(Object element, int key) {
        this.element = element;
        this.key = key;
        this.sons = new Nodo[0];
    }

    public Object getElement() {
        return element;
    }

    public void setElement(Object element) {
        this.element = element;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public Nodo[] getSons() {
        return sons;
    }

    public void setSons(Nodo[] sons) {
        this.sons = sons;
    }
    
    
    
    
}
