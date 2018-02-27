package cn.com.homesangsang.search;

import org.junit.Test;

public class BlockSearchTest {
    @Test
    public void test() {
        int[] index = {10, 20, 30};
        BlockSearch blockSearch = new BlockSearch(index);

        for (int i = 0; i < 40; i++) {
            blockSearch.insert(i);
        }

        blockSearch.printAll();

        System.out.println(blockSearch.search(33));
        System.out.println(blockSearch.search(11));
    }
    @Test
    public void testBinarySearch() {
        int[] index = {10, 20, 30};
        BlockSearch blockSearch = new BlockSearch(index);
        System.out.println(blockSearch.binarySearch(30));

    }
}
