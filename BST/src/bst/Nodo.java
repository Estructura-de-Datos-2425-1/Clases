package bst;

public class Nodo {
    private int element;
    private Nodo leftSon, rightSon;

    public Nodo(int element) {
        this.element = element;
        this.leftSon = null;
        this.rightSon = null;
    }

    public int getElement() {
        return element;
    }

    public void setElement(int element) {
        this.element = element;
    }

    public Nodo getLeftSon() {
        return leftSon;
    }

    public void setLeftSon(Nodo leftSon) {
        this.leftSon = leftSon;
    }

    public Nodo getRightSon() {
        return rightSon;
    }

    public void setRightSon(Nodo rightSon) {
        this.rightSon = rightSon;
    }
    
    public boolean isLeaf() {
        return leftSon == null && rightSon == null;
    }
    
    public boolean hasLeftSon(){
        return leftSon != null;
    }
    
    public boolean hasRightSon(){
        return rightSon != null;
    }
    
    public boolean hasOnlyLeftSon() {
        return leftSon != null && rightSon == null;
    }
    
    public boolean hasOnlyRightSon() {
        return leftSon == null && rightSon != null;
    }
}
