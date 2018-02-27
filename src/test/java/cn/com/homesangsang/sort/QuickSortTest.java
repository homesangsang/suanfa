package cn.com.homesangsang.sort;

import org.junit.Test;

public class QuickSortTest {
    @Test
    public void test() {
        QuickSort quickSort = new QuickSort(new int[]{1,23,5,34536,34,7,6,8,4,5,23,41,3,4325,2});
        quickSort.sort();
        quickSort.print();
    }
}
