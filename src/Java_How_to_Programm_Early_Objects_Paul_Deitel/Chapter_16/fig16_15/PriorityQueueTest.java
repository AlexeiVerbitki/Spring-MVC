package Java_How_to_Programm_Early_Objects_Paul_Deitel.Chapter_16.fig16_15;// Fig. 16.15: PriorityQueueTest.java
// PriorityQueue test program.

import java.util.*;

public class PriorityQueueTest {
    public static void main(String[] args) {

        // Method 1: Creating a custom comparator
        Comparator<Double> reversePriority = new Comparator<Double>() {
            @Override
            public int compare(Double o1, Double o2) {
                return o2.compareTo(o1);
            }
        };
        PriorityQueue<Double> queue = new PriorityQueue<>(11, reversePriority);


        //Method 2: adding to a List and ther reverse displaying
        ArrayList<Double> list = new ArrayList<>();

        // insert elements to queue
        queue.offer(3.2);
        queue.offer(9.8);
        queue.offer(5.4);

        System.out.print("Polling from queue: ");

        // display elements in queue
        while (queue.size() > 0) {
            System.out.printf("%.1f ", queue.peek()); // view top element
            list.add(queue.peek());
            queue.poll(); // remove top element
        }
        System.out.printf("\nQueue in reverse order");
        Collections.reverse(list);
        System.out.println(list);
    }
} // end class PriorityQueueTest


