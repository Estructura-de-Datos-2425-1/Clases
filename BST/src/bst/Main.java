/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bst;

/**
 *
 * @author sl006
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BST tree = new BST();
        tree.insert(100, null);
        tree.insert(75, tree.getRoot());
        tree.insert(70, tree.getRoot());
        tree.insert(85, tree.getRoot());
        tree.insert(62, tree.getRoot());
        tree.insert(72, tree.getRoot());
        tree.insert(73, tree.getRoot());
        tree.insert(95, tree.getRoot());
        tree.insert(120, tree.getRoot());
        tree.insert(110, tree.getRoot());
        tree.insert(130, tree.getRoot());
        tree.insert(93, tree.getRoot());
        tree.deleteNodo(70, tree.getRoot(), null);
        tree.preOrden(tree.getRoot());
    }
    
}
