/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicios;

/**
 *
 * @author sl006
 */
public class Ejercicios {

    public Ejercicios() {
    }
    
    public Lista reverseLista(Lista lista) {
        Lista newLista = new Lista();
        Nodo pointer = lista.getHead();
        while (pointer != null) {
            newLista.insertBegin(pointer.getElement());
            pointer = pointer.getNext();
        }
        return newLista;
    }
    
    public Lista reverseListaWithDelete(Lista lista) {
        Lista newLista = new Lista();
        Nodo pointer = lista.getHead();
        while (pointer != null) {
            newLista.insertBegin(pointer.getElement());
            pointer = pointer.getNext();
            lista.deleteBegin();
        }
        return newLista;
    }
    
    public Lista mergeList(Lista lista1, Lista lista2) {
        Lista finalList = new Lista();
        Nodo pointer1 = lista1.getHead();
        Nodo pointer2 = lista2.getHead();
        while (pointer1 != null || pointer2 != null) {
            if (pointer1 != null && pointer2 != null) {
                if ((int)pointer1.getElement() < (int)pointer2.getElement()) {
                    finalList.insertFinal(pointer1.getElement());
                    pointer1 = pointer1.getNext();
                } else if ((int)pointer1.getElement() > (int)pointer2.getElement()) {
                    finalList.insertFinal(pointer2.getElement());
                    pointer2 = pointer2.getNext();
                } else {
                    finalList.insertFinal(pointer2.getElement());
                    finalList.insertFinal(pointer1.getElement());
                    pointer1 = pointer1.getNext();
                    pointer2 = pointer2.getNext();                }
            } else if (pointer1 != null) {
                finalList.insertFinal(pointer1.getElement());
                pointer1 = pointer1.getNext();
            } else if (pointer2 != null) {
                finalList.insertFinal(pointer2.getElement());
                pointer2 = pointer2.getNext();
            }
        }
        return finalList;
    }
    
}
