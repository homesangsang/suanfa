package cn.com.homesangsang.sort;

public class QuickSort {
    private int[] array;

    public QuickSort(int[] array) {
        this.array = array;
    }

    public void quicksort(int[] src, int begin, int end){
        if (begin < end) {
            int key = src[begin];
            int i = begin;
            int j = end;

            while (i < j) {
                while (i < j && src[j] > key) {
                    j--;
                }
                if (i < j) {
                    src[i] = src[j];
                    i++;
                }
                while (i < j && src[i] < key) {
                    i++;
                }
                if (i < j) {
                    src[j] = src[i];
                    j--;
                }
            }
            src[i] = key;

            quicksort(src, begin, i - 1);
            quicksort(src, i + 1, end);
        }
    }

    public void sort() {
        quicksort(array, 0, array.length-1);

    }

    public void print () {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
