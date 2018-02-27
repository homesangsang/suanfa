package cn.com.homesangsang.sort;

import org.junit.Test;

public class BubbleSortTest {
    @Test
    public void test() {
        BubbleSort bubbleSort = new BubbleSort(new int[]{1,2,3,5352,54,33,1,32,45,65,7,4});

        bubbleSort.sort();
        bubbleSort.print();
    }

}
