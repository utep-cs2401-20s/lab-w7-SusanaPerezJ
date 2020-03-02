public class SortOfSort {
    public static void sortOfSort(int[] arr){
        /*int place = arr.length-1;
        int scope = arr.length-1;
        //stopping point at length-1
        for(int i = 0, j = scope; i<scope; i++){
            //find the largest
            int largest = arr[i];
            int temp = 0;
            if(arr[i] > arr[i+1]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }*/
        //get the largest at the end
        int temp = 0;
        for(int i = 0, j = arr.length-1; j >= 0; i++, j--){
            if(arr[i] > arr[j]){
                temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }
}
