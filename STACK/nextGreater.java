import java.util.Stack;

public class nextGreater{
    public static void main(String[] args) {
        int arr[] = {6,8,0,1,3};
        int nxtgtr[] = new int[arr.length];
        Stack<Integer> s = new Stack<>();

        for(int i = arr.length-1; i >=0; i--){
            while(!s.isEmpty() && arr[s.peek()] <= arr[i]){
                s.pop();
            }
            if(s.isEmpty()){
                nxtgtr[i] = -1;
            }
            else{
                nxtgtr[i] = arr[s.peek()];
            }
            s.push(i);
        }
        for(int i = 0; i<nxtgtr.length;i++){
            System.out.print(nxtgtr[i] + " ");
        }

    }
}