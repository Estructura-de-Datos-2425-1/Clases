package listadoble;

public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ListaDoble lista = new ListaDoble();
        for (int i = 0; i < 10; i++) {
            lista.insertFinal(i);
        }
        System.out.println("ANTES");
        lista.print();
        lista.insertInIndex(55, 3);
        System.out.println("DESPUES");
        lista.print();
    }
    
}
