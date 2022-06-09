package part1Threads.thread3;

public class MyThread extends Thread{
    int exiting;
    String posistion;

    public MyThread(int exiting, String posistion) {
        this.exiting = exiting;
        this.posistion = posistion;
    }

    @Override
    public void run() {
        for (int i = 0; i < exiting; i++) {
            System.out.println(posistion + ": " + (exiting - i));
            try {
                Thread.sleep(Math.round(Math.random()*1500));
            }catch (Exception e) {}
        }
        System.out.println(posistion + " exiting");
    }
}
