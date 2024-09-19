package listas;

public interface ILista {
    public Object insertBegin(Object element);
    public Object insertFinal(Object element);
    public Object insertInIndex(Object element, int index);
    public Object deleteBegin();
    public Object deleteFinal();
    public Object deleteInIndex(int index);
    public boolean isEmpty();
}
