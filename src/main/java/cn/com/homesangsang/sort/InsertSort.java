package cn.com.homesangsang.sort;

import java.util.Arrays;

public class InsertSort {
    private int[] array;

    public InsertSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        if (array == null) {
            throw new NullPointerException("数组为空");
        }
        int length = array.length;
        for (int i = 1; i < length; i++ ) {
            int temp = array[i];
            int j = i;
            for (;j > 0 && array[j-1] > temp; j--) {
                array[j] = array[j-1];
            }
            array[j] = temp;
        }
    }

    @Override
    public String toString() {
        return "InsertSort{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
