import java.util.*;
public class interleaveTwoHalves {
    public static void interleave( Queue<Integer> q){
        Queue<Integer> firstHalf = new ArrayDeque<>();
        int size = q.size();
        for(int i = 0; i<size/2; i++){
            firstHalf.offer(q.poll());
        }

        while(!firstHalf.isEmpty()){
            q.offer(firstHalf.poll());
            q.offer(q.poll());
        }
    } 
    public static void main(String[] args) {
        Queue<Integer> q = new ArrayDeque<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);
        interleave(q);

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.poll();
        }
    }
}
