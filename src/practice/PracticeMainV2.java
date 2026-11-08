package practice;

import util.MyLogger;

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
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
