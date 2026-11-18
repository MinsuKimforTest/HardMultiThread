package thread.control;

import util.ThreadUtils;

import static util.MyLogger.log;

public class JoinMainV3 {

    public static void main(String[] args) throws InterruptedException {
        log("start");

        SumTask task1 = new SumTask(1, 50);
        SumTask task2 = new SumTask(51, 100);
        Thread thread1 = new Thread(task1, "threa-1");
        Thread thread2 = new Thread(task2, "threa-2");

        thread1.start();
        thread2.start();

        // 스레드가 종료될 때 까지 대기
        thread1.join();
        thread2.join();

        log("task1 : "+task1.result);
        log("task2 : "+task2.result);

        log("end");
    }


    static class SumTask implements Runnable {

        int startValue;
        int endValue;
        int result = 0;

        public SumTask(int startValue, int endValue) {
            this.startValue = startValue;
            this.endValue = endValue;
        }

        @Override
        public void run() {
            log("작업 시작");
            ThreadUtils.sleep(2000);
            int sum = 0;
            for(int i = startValue;i <= endValue;i++) {
                sum += i;
            }
            result = sum;
            log("작업 완료 : "+result);

        }
    }
}
