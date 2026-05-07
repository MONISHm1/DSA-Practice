import java.util.*;

public class insertInMinHeap {
    static class minHeap{
        ArrayList<Integer> heap = new ArrayList<>();
        public void insert(int val){
            heap.add(val);
            int i = heap.size()-1;
            while (i>0) {
                int parent = (i-1)/2;
                if(heap.get(i) < heap.get(parent)){
                    int temp = heap.get(i);
                    heap.set(i, heap.get(parent));
                    heap.set(parent, temp);
                    i = parent;
                }
                else{
                    break;
                }
            }
        }

        public void print(){
            System.out.println(heap);
        }
    }
    public static void main(String[] args) {
    minHeap h = new minHeap();
        h.insert(3);
        h.insert(4);
        h.insert(1);
        h.insert(7);

        h.print();
    }
}
