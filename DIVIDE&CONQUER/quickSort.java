public class quickSort {
    public static void printArr(int arr[]){
        for(int i =0; i< arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
    }
    public static void qSort(int arr[], int si, int ei){
        if(si>=ei){
            return;
        }
        int pvtIdx = partition(arr, si, ei);
        qSort(arr, si, pvtIdx -1);
        qSort(arr, pvtIdx+1, ei);
    }

    public static int partition(int arr[], int si, int ei){
        int piviot = arr[ei];
        int i = si-1;
        for(int j = si; j<ei; j++){
            if(arr[j] < piviot){
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        i++;
        int temp = arr[i];
        arr[i] = arr[ei];
        arr[ei] = temp;

        return i;
    }
    public static void main(String[] args){
        int arr[] = {6,3,9,8,2,5};
        qSort(arr, 0, arr.length-1);
        printArr(arr);
    }
}
