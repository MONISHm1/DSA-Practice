import java.util.*;
public class priorityQueuImple {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(3);
        pq.add(4);
        pq.add(1);
        pq.add(7);

        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.poll();
        }
       
    }
}
