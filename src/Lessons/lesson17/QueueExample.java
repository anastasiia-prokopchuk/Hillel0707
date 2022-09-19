package Lessons.lesson17;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
//        Queue<String> queue = new LinkedList<>();

        Queue<String> queue = new PriorityQueue<>();


        queue.add("банани");
        queue.add("яблука");
        queue.add("ананаси");

        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }


//        while (queue.peek() != null) {
//            System.out.println(queue.poll());
//        }

        System.out.println(queue.poll());


//        queue.remove();
//        queue.poll(); //немає обробки ексепшена

//        System.out.println(queue.peek()); //null якщо елементів немає, викидає елементи з черги
//        System.out.println(queue.element());

    }
}
