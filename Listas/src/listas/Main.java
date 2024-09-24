
package listas;


public class Main {


    public static void main(String[] args) {
        // Lista list = new Lista();
        ListaArray list = new ListaArray(10);
        System.out.println("Lista Begin");
        for (int i = 0; i < 10; i++) {
            list.insertBegin(i);
        }
        list.print();
        System.out.println("Secuencial");
        list.printSecuencial();
        System.out.println("");
        System.out.println("Lista Final");
        ListaArray listFinal = new ListaArray(10);
        for (int i = 0; i < 10; i++) {
            listFinal.insertFinal(i);
        }
        listFinal.print();
        System.out.println("");
        /*System.out.println("Lista After Index"); 
        listFinal.deleteInIndex(4);
        listFinal.print();
        System.out.println("");*/
    }
    
}
