package practice;

import util.MyLogger;
import util.ThreadUtils;

public class PracticeMainV2 {

    public static void main(String[] args) {
        Thread thread = new Thread(new CounterThread2(), "counter");
        thread.start();
    }

    static class CounterThread2 implements Runnable{
        @Override
        public void run() {
            for (int i = 0; i < 5; i++) {
                MyLogger.log("value : "+i);
                ThreadUtils.sleep(1000);
            }
        }
    }
}
