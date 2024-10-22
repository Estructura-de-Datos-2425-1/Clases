package queue;

public class Main {


    public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 0; i < 10; i++) {
            queue.enqueue(i);
        }
        
        queue.print();
        System.out.println("");
        queue.dequeue();
        System.out.println("Average:"+queue.average());
        queue.reverse();
        queue.print();
    }
    
}
