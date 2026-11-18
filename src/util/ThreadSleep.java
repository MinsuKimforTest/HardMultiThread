package util;

public abstract class ThreadSleep {

   /* public static class myTheadSleep implements Runnable{

        long second;
        public myTheadSleep(long second) {
            this.second = second;
        }
        @Override
        public void run() {
            try {
                Thread.sleep(second);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }*/

    public static void myThreadSleep(long millis){
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }

}
