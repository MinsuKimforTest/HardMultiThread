package thread.start;

public class BadThreadMain {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Thread thread = Thread.currentThread();
        System.out.println("thread = " + thread);

        HelloThread helloThread = new HelloThread();
        helloThread.run(); // run() 직접 실행
    }
}
