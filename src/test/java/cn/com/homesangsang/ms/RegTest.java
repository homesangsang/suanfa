package cn.com.homesangsang.ms;

import org.junit.Test;

public class RegTest {
    @Test
    public void test() {
        String s = "afdsafasfjlaksf23423423412321jksjdfalsfjlsd";
        s.replaceAll("[^0-9]", "|");
        System.out.println(s);
    }
}
