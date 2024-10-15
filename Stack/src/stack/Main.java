/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package stack;

/**
 *
 * @author sl006
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack stack = new Stack();
        Stack stack2 = new Stack();
        stack.push(40);
        stack.push(35);
        stack.push(25);
        stack2.push(10);
        stack2.push(20);
        stack2.push(30);
        System.out.println("STACK 1");
        stack.print();
        System.out.println("STACK 2");
        stack2.print();
        
        Ejercicios ej = new Ejercicios();
        Stack stackFinal = ej.merge(stack, stack2);
        System.out.println("Final");
        stackFinal.print();
    }
    
}
