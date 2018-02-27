package cn.com.homesangsang.search;

import java.util.Arrays;

public class SequentialSearch {
    private int[] array;

    public SequentialSearch(int[] array) {
        this.array = array;
    }

    @Override
    public String toString() {
        return "SequentialSearch{" +
                "array=" + Arrays.toString(array) +
                '}';
    }

    public int search(int key) {
        if (key == array[0]) {
            return 0;
        }
        int temp = array[0];
        array[0] = key;
        int i = array.length - 1;
        while (array[i] != key){
            i--;
        }
        array[0] = temp;
        if (i ==0)
            return -1;
        return i;
    }
}
