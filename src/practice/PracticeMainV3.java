package practice;

import util.MyLogger;

public class PracticeMainV3 {

    public static void main(String[] args) {
        Thread threadA = new Thread(new PrintWork("ContentA", 1000), "Thread-A");

        Thread threadB = new Thread(new PrintWork("ContentB", 2000), "Thread-B");

        threadA.start();
        threadB.start();

    }

    static class PrintWork implements Runnable{

        String content;
        long sleepts;

        public PrintWork(String content, long sleepts){
            this.content = content;
            this.sleepts = sleepts;
        }

        @Override
        public void run() {
            while (true){
                MyLogger.log(content);
                try {
                    Thread.sleep(sleepts);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        }
    }
}
