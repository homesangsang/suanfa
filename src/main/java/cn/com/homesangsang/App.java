package cn.com.homesangsang;

import cn.com.homesangsang.sort.BubbleSort;
import cn.com.homesangsang.sort.InsertSort;
import cn.com.homesangsang.sort.QuickSort;
import cn.com.homesangsang.sort.SelectSort;
import org.junit.Test;

import java.io.*;
import java.util.*;

/**
 * Hello world!
 *
 */
public class App implements Serializable {
    public static final long serialVersionUID = 1L;
    private Date loggingDate = new Date();
    private String uid;
    private transient String pwd;
    App(String uid, String pwd) {
        this.uid = uid;
        this.pwd = pwd;
    }

    @Override
    public String toString() {
        if (pwd == null) {
            pwd = "NOT SET";
        } else {
            pwd = pwd;
        }
        return "App{" +
                "loggingDate=" + loggingDate +
                ", uid='" + uid + '\'' +
                ", pwd='" + pwd + '\'' +
                '}';
    }

    public static void main(String[] args) {
        App loginfo = new App("homesangsang", "12345");
        System.out.println(loginfo.toString());
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("App.out"));
            out.writeObject(loginfo);
            out.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            ObjectInputStream in = new ObjectInputStream(new FileInputStream("App.out"));
            App app = (App)in.readObject();
            System.out.println(app.toString());
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }
}
