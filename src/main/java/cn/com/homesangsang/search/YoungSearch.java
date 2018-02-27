package cn.com.homesangsang.search;

import java.util.Arrays;

public class YoungSearch {
    private int[][] array;

    public YoungSearch(int[][] array) {
        this.array = array;
    }

    public boolean search(int target){
        int i = 0, j=array[0].length - 1;
        int temp = array[i][j];
        while (true) {
            if (temp == target) {
                System.out.println(String.format("x: %d, y: %d", i, j));
                return true;
            } else if (temp < target && i < array.length - 1) {
                temp = array[++i][j];
            } else if (temp > target && j > 0) {
                temp = array[i][--j];
            } else {
                return false;
            }
        }

    }

    @Override
    public String toString() {
        return "YoungSearch{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
