package bst;

public class BST {
    private Nodo root;
    
    public BST() {
        this.root = null;
    }

    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }
    
    public void preOrden(Nodo raiz) {
        if (raiz != null) {
            System.out.println("["+raiz.getElement()+"]");
            preOrden(raiz.getLeftSon());
            preOrden(raiz.getRightSon());
        }
    }
    
    public void inOrden(Nodo raiz) {
        if (raiz != null) {
            preOrden(raiz.getLeftSon());
            System.out.println("["+raiz.getElement()+"]");
            preOrden(raiz.getRightSon());
        }
    }
        
    public void postOrden(Nodo raiz) {
        if (raiz != null) {
            preOrden(raiz.getLeftSon());
            preOrden(raiz.getRightSon());
            System.out.println("["+raiz.getElement()+"]");
        }
    }
    
    public void insert(int element, Nodo pointer) {
        Nodo nodo = new Nodo(element);
        if (isEmpty()) {
            setRoot(nodo);
        } else {
            if (element == pointer.getElement()) {
                System.out.println("Invalid element");
            } else if (element < pointer.getElement()) {
                if (pointer.hasLeftSon()) {
                    insert(element, pointer.getLeftSon());
                } else {
                    pointer.setLeftSon(nodo);
                }
            } else {
                if (pointer.hasRightSon()) {
                    insert(element, pointer.getRightSon());
                } else {
                    pointer.setRightSon(nodo);
                }
            }
        }
    }
    
    public boolean isEmpty() {
        return getRoot() == null;
    }
}
