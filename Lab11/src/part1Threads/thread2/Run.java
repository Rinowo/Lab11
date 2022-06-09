package part1Threads.thread2;

public class Run {
    public static void main(String[] args) {
        MyJavaThread myJavaThread = new MyJavaThread(20);

        for (int i = 0; i < 20; i++) {
            myJavaThread.start();
        }
    }
}
