public class largest_num_inArr {
    public static int large(int num[]){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i =0; i< num.length; i++){
            if(largest < num[i]){
                largest =num[i];
            }
            if(smallest > num[i]){
                smallest = num[i];
            }
        }
        System.out.println("smallest num is:" + smallest);
        return largest;
        
    } 
    public static void main(String[] args) {
        int num[] = {10,20,6,30,50};
        System.out.println("largest num is:"+large(num));;
    }
}
