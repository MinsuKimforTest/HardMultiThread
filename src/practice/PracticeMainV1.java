package practice;

import util.MyLogger;

public class PracticeMainV1 {

    public static void main(String[] args) {
        CounterThread counterThread = new CounterThread();
        counterThread.start();
    }

    static class CounterThread2 extends Thread{
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
