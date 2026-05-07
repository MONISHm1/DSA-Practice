import java.util.*;

public class removeinHeap {
    static class Heap{
        ArrayList<Integer>Heap = new ArrayList<>();

        public void add(int data){
            Heap.add(data);
            int i = Heap.size()-1;
            while(i>0){
                int par = (i-1)/2;
                if(Heap.get(i) < Heap.get(par)){
                    Collections.swap(Heap, i, par);
                    i=par;
                }
                else{
                    break;
                }
            }
        }
        public int peek(){
            return Heap.get(0);
        }

        private void heapify(int i){
            int left = 2*i +1;
            int right = 2*i +2;
            int minIdx = i;
            if(left < Heap.size() && Heap.get(minIdx) > Heap.get(left)){
             minIdx = left;
            }
            if(right < Heap.size() && Heap.get(minIdx) > Heap.get(right)){
                minIdx = right;
            }

            if(minIdx != i){
                int temp = Heap.get(i);
                Heap.set(i, Heap.get(minIdx));
                Heap.set(minIdx, temp);

                heapify(minIdx);
            }
        }

        public int remove(){
            int data = Heap.get(0);

            int temp = Heap.get(0);
            Heap.set(0, Heap.get(Heap.size()-1));
            Heap.set(Heap.size()-1, temp);

            Heap.remove(Heap.size()-1);
            heapify(0);
            return data;
        }

        public boolean isEmpty() {
           return Heap.size() == 0;
        }
    }
    public static void main(String[] args) {
        Heap h = new Heap();
         h.add(3);
         h.add(4);
         h.add(1);
         h.add(5);

         while (!h.isEmpty()) {
            System.out.print(h.peek()+" ");
            h.remove();
         }
    }
}
