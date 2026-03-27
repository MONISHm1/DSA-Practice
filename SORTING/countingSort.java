public class countingSort {
    public static void countSrt(int arr[]) {

        // maximum element
        int largest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            largest = Math.max(largest, arr[i]);
        }

        // create a count array
        int count[] = new int[largest + 1];

        // sotre the frequency

        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        // sorting
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            while (count[arr[i]] > 0) {
                arr[j] = i;
                j++;
                count[i]--;
            }
        }

    }

    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {
        int arr[] = {1,4,1,3,2,4,3,7};
        countSrt(arr);
        print(arr);
    }
}
