package part1Threads.thread2;

public class MyJavaThread extends Thread{
    int finish;

    public MyJavaThread(int finish) {
        this.finish = finish;
    }

    @Override
    public void run() {
        for (int i = 0; i < finish; i++) {
            if (i % 2 == 0) {
                System.out.println("Count " + (i));
            }
            try {
                Thread.sleep(1500);
            }catch (Exception e) {}
        }
        System.out.println("finish");
    }
}
