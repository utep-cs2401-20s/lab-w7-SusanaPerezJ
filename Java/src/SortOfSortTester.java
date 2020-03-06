import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortOfSortTester {
    public int[] a = {3,2,1,5,6,8,0,16};
    public int[] b = {8,2,45,79,10,6,3};
    public int[] c = {2,2,0,0,8,8,3,3};
    public int[] d = {-12,12,7,6,33,-7};
    public int[] e = {7,6,3,2,0,1,4,5,8,9};
    //Test with an even length array since the swaps happen twice for each side of the array.
    @Test
    public void sortTest(){
        int [] solution = {6, 5, 1, 0, 2, 3, 8, 16};
        SortOfSort.sortOfSort(a);
        assertArrayEquals(solution, a);
    }
    //Test with an odd length array to make sure that the last element is getting swapped to the correct position.
    @Test
    public void sortTest1(){
        int [] solution = {10, 8, 2, 3, 6, 45, 79};
        SortOfSort.sortOfSort(b);
        assertArrayEquals(solution, b);
    }
    //Test with duplicate numbers to check that the condition to swap works properly.
    @Test
    public void sortTest2(){
        int [] solution = {3, 3, 0, 0, 2, 2, 8, 8};
        SortOfSort.sortOfSort(c);
        assertArrayEquals(solution, c);
    }
    //Test with negative integers to check that the swapping works even with numbers less than zero and places them in the correct place.
    @Test
    public void sortTest3(){
        int [] solution = {7, 6, -12, -7, 12, 33};
        SortOfSort.sortOfSort(d);
        assertArrayEquals(solution, d);
    }
    //Test with an already (sort of) sorted array
    @Test
    public void sortTest4(){
        int [] solution = {7,6,3,2,0,1,4,5,8,9};
        SortOfSort.sortOfSort(e);
        assertArrayEquals(solution, e);
    }
}