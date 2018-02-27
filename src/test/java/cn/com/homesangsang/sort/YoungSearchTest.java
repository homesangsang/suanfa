package cn.com.homesangsang.sort;

import cn.com.homesangsang.search.YoungSearch;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

public class YoungSearchTest {
    @Test
    public void test(){
        int[][] array = {
                {1,2,8,9,15,22,38},
                {2,5,9,12,16,25,42},
                {4,7,13,15,21,28,46},
                {7,9,16,18,24,32,54}
        };
        YoungSearch youngSearch = new YoungSearch(array);
        System.out.println(youngSearch.search(22));
        System.out.println(youngSearch.search(33));
        System.out.println(youngSearch.search(16));

    }
}
