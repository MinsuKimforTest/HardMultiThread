package practice;

import util.MyLogger;


public class CounterThread extends Thread {

    @Override
    public void run() {

        for(int i = 0; i < 5; i++) {
            MyLogger.log("value : "+i );
        }
    }
}
