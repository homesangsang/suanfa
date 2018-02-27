package cn.com.homesangsang.ms;

public class ThreadTest {
    public static void main(String[] args) {
        SellThread sell = new SellThread();
        Thread sell1 = new Thread(sell,"sellman1");
        Thread sell2 = new Thread(sell, "sellman2");
        Thread sell3 = new Thread(sell, "sellman3");
        sell1.start();
        sell2.start();
        sell3.start();
    }
}

class SellThread implements Runnable {
    private int i = 20;

    @Override
    public void run() {
        while (true) {
            if (i > 0) {
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(Thread.currentThread().getName() + "sell " + i--);
            }
        }

    }
}
