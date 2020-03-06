import java.util.Arrays;

public class SortOfSort {
    public static void sortOfSort(int[] a) {
        int count = 0;
        int temp;
        int scopeRight = a.length - 1; //last index
        int scopeLeft = 0;//first index
        int max;
        int index = 0;
        //I got help from Cynthia for the outer loop//

        //find max
        for(int m = scopeLeft, n = scopeRight; m < n;) {
            max = a[scopeLeft];
            for (int i = scopeLeft; i <= scopeRight; i++) {//i is less than the scope
                if (a[i] >= max) {
                    max = a[i];
                    index = i;
                }
            }
            if(count == 4){
                count = 0;
            }
            //swap max with last element in the scope
            if(count < 2) {
                temp = a[scopeRight];
                a[scopeRight] = max;
                a[index] = temp;
                scopeRight--; //decrease scope
                n--;
            }else{
                temp = a[scopeLeft];
                a[scopeLeft] = max;
                a[index] = temp;
                scopeLeft++; //decrease scope
                m++;
            }
            count++;
        }
        System.out.println(Arrays.toString(a));
    }
}

