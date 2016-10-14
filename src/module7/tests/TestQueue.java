package module7.tests;


import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueue {

    public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.add(11);
        queue.add(-11);
        queue.add(0);
        int a = queue.element();

        System.out.println(a);
        System.out.println(queue);
    }
}
