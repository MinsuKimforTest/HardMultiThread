package thread.control.interrupt;

import util.ThreadSleep;

import static util.MyLogger.log;

public class ThreadStopMainV1  {

    public static void main(String[] args) {

        MyTask task = new MyTask();
        Thread work = new Thread(task, "work");
        work.start();

        ThreadSleep.myThreadSleep(4000);
        log("작업 중단 지시 runFlag=false");
        task.runFlag = false;
    }

    static class MyTask implements Runnable{

        volatile boolean runFlag = true;

        @Override
        public void run() {
            while (runFlag){
                log("작업 중");
                ThreadSleep.myThreadSleep(3000);
            }
            log("자원 정리");
            log("자원 종료");

        }
    }
}
