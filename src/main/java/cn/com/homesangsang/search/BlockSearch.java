package cn.com.homesangsang.search;

import cn.com.homesangsang.lsit.ArrayList;

import java.util.Arrays;

public class BlockSearch {
    private int[] index;

    private ArrayList[] list;

    public BlockSearch(int[] index) {
        if (index != null && index.length != 0) {
            this.index = index;
            this.list = new ArrayList[index.length];
            for (int i = 0; i < list.length; i++) {
                list[i] = new ArrayList();
            }
        }else
            throw new Error("index could not be null or empty");
    }

    /**
     * 插入元素
     * @param value
     */
    public void insert(int value) {
        int i = binarySearch(value);
        list[i].add(value);
    }

    /**
     * 查找元素
     * @param data
     * @return
     */
    public boolean search(int data) {
        int i = binarySearch(data);
        for (int j = 0; j < list[i].size(); j++) {
            if (data == list[i].get(j)) {
                return true;
            }
        }
        return false;
    }

    public void printAll() {
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list[i].size(); j++) {
                System.out.print(list[i].get(j) + " " );
            }
        }
    }

    @Override
    public String toString() {
        return "BlockSearch{" +
                "list=" + Arrays.toString(list) +
                '}';
    }

    /**
     *
     * @param value
     * @return
     */

    public int binarySearch(int data) {
        int start = 0;
        int end = index.length;
        int mid = -1;

        while (start <= end) {
            mid = (start + end) / 2;
            if (index[mid] > data) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }
}
