
package listas;


public class Main {


    public static void main(String[] args) {
        Lista list = new Lista();
        System.out.println("Lista Begin");
        for (int i = 0; i < 10; i++) {
            list.insertBegin(i);
        }
        list.print();
        System.out.println("");
        System.out.println("Lista Final");
        Lista listFinal = new Lista();
        for (int i = 0; i < 10; i++) {
            listFinal.insertFinal(i);
        }
        listFinal.print();
        System.out.println("");
        System.out.println("Lista After Index"); 
        listFinal.deleteInIndex(4);
        listFinal.print();
        System.out.println("");
    }
    
}
