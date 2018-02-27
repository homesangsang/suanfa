package cn.com.homesangsang.sort;

import org.junit.Test;

public class BubbleSort {
    private int[] array;

    public BubbleSort(int[] array) {
        this.array = array;
    }

    public void sort() {
        int temp = 0;
        for (int i = 0; i < array.length -1; i++ ) {
            for (int j = 0; j < array.length -1- i; j++) {
                if (array[j+1] < array[j]) {
                    temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
    }

    public void print(){
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

}
