package listacircular;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaCircular list = new ListaCircular();
        for (int i = 0; i < 10; i++) {
            list.insertFinal(i);
        }
        list.print();
        list.deleteInIndex(4);
        list.print();
    }
    
}
