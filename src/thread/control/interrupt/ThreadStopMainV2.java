package thread.control.interrupt;

import util.ThreadSleep;

import static util.MyLogger.log;

public class ThreadStopMainV2 {

    public static void main(String[] args) {

        MyTask task = new MyTask();
        Thread work = new Thread(task, "work");
        work.start();

        ThreadSleep.myThreadSleep(4000);
        log("작업 중단 지시 runFlag=false");
        //task.runFlag = false;
        work.interrupt();
        log("work 스레드 인터럽트 상태 1 = "+work.isInterrupted());
    }

    static class MyTask implements Runnable{

        volatile boolean runFlag = true;

        @Override
        public void run() {
            try {
                while (runFlag){
                    log("작업 중");
                    Thread.sleep(3000);
                }

            }catch (InterruptedException e){
                log("work 스레드 인터럽트 상태2 = " + Thread.currentThread().isInterrupted());
                log("interrupt message = " + e.getMessage());
                log("state = " + Thread.currentThread().getState());
            }
            log("자원 정리");
            log("자원 종료");

        }
    }
}
