package listadoble;

public interface ILista {
    public void insertBegin(Object element);
    public void insertFinal(Object element);
    public void insertInIndex(Object element, int index);
    public Object deleteBegin();
    public Object deleteFinal();
    public Object deleteInIndex(int index);
    public boolean isEmpty();
}

