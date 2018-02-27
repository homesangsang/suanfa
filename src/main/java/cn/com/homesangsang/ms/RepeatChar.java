package cn.com.homesangsang.ms;

import org.junit.runners.Parameterized;

import java.util.HashMap;
import java.util.Map;

public class RepeatChar {
    private String data;

    public void repeats() {
        Map<Character, Integer> map = new HashMap<Character, Integer>();
        Character ch ;
        for (int i = 0; i < this.data.length(); i++ ) {
            ch = this.data.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch)+1);
            } else {
                map.put(ch,1);
            }
        }
        for (Map.Entry entity : map.entrySet()) {
            System.out.println(entity.getKey() + " : " + entity.getValue());

        }
    }

    public RepeatChar(String data) {
        this.data = data;
    }

    public RepeatChar() {

    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}
