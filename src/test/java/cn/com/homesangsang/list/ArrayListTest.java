package cn.com.homesangsang.list;

import cn.com.homesangsang.lsit.ArrayList;
import org.junit.Test;

public class ArrayListTest {
    @Test
    public void test() {
        ArrayList arrayList = new ArrayList(0);
        arrayList.add(1);
        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(8);
        arrayList.add(10);
        arrayList.add(100);
        arrayList.add(1000);
        arrayList.add(111);
        arrayList.add(1111);
        arrayList.add(2222);
        System.out.println(arrayList.get(10));
        System.out.println(arrayList.set(3,10000000));
        System.out.println(arrayList.get(3));
        System.out.println(arrayList.size());
        System.out.println(arrayList.get(111));
    }
}
