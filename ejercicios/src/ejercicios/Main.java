/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicios;

/**
 *
 * @author sl006
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Lista list = new Lista();
        Lista list2 = new Lista();
        System.out.println("Lista Begin");
        for (int i = 1; i < 10; i++) {
            list.insertFinal(i);
            list2.insertFinal(i);
        }
        System.out.println("Lista1");
        list.print();
        System.out.println("");
        System.out.println("Lista2");
        list2.print();
        System.out.println("");
        Ejercicios ejercios = new Ejercicios();
        System.out.println("");
//        Lista reversedList = ejercios.reverseLista(list);
//        reversedList.print();
//        System.out.println("");
//        list.print();
        ////////////
        System.out.println("Merge");
        Lista mergeLista = ejercios.mergeList(list, list2);
        mergeLista.print();
        
    }
    
}
