import java.util.Arrays;

public class SortOfSort {
    public static void main(String[] args) {
        int[] a = {3,2,1,5,6,8,0,3};
        newSort(a);
    }
    public static void sortOfSort(int[] arr) {
        int countLeft = 2;
        int countRight = 2;
        int leftIndex = 0;
        int rightIndex = arr.length - 1;
        int times = 2;
       while (times > 0) {
            //get the largest at the end
            while (countRight > 0) {
                int temp = 0;
                for (int i = leftIndex, j = rightIndex; j >= 0; i++, j--) {
                    if (arr[i] > arr[j]) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
                countRight--;
                countLeft = 2;
            }
            //get the largest at the beginning
            while (countLeft > 0) {
                int temp2 = 0;
                for (int i = rightIndex, j = leftIndex; j >= 0; i++, j--) {
                    if (arr[i] > arr[j]) {
                        temp2 = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp2;
                    }
                }
                countLeft--;
                countRight = 2;
            }
            times--;
        }
        System.out.println(Arrays.toString(arr));
    }
    public static void newSort(int[]a) {
        int temp;
        int first = 0;
        int second = 1;
        int counter = 0;
        int scope = a.length;
        //gets the biggest element to the las position
        while (counter < 2) {
            while (second < scope) {
                if (a[first] > a[second]) {
                    temp = a[first];
                    a[first] = a[second];
                    a[second] = temp;
                }
                first++;
                second++;
            }
            first = 0;
            second = 1;
            scope--;
            counter++;
        }
        System.out.println(scope);
        System.out.println(Arrays.toString(a));
    }
}
