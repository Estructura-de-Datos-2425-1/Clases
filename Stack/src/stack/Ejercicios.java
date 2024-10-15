/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package stack;

public class Ejercicios {

    public Ejercicios() {
    }
    
    public Stack merge(Stack stack1, Stack stack2){
        Stack stack3 = new Stack();
        while (!stack2.isEmpty()){
            stack3.push(stack2.pop().getElement());
        }
        System.out.println("STACK3");
        stack3.print();
        
        while (!stack1.isEmpty() || !stack3.isEmpty()){
            if(!stack1.isEmpty() && !stack3.isEmpty()) {
                if((int)stack1.getPeak().getElement()<(int)stack3.getPeak().getElement()){
                    stack2.push(stack1.pop().getElement());
                } else {
                    stack2.push(stack3.pop().getElement());
                }
            } else if (stack1.isEmpty()) {
                stack2.push(stack3.pop().getElement());
            }  else {
                stack2.push(stack1.pop().getElement());
            }
        }
        
        return stack2;
    }
}
