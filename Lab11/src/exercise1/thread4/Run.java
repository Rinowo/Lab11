package exercise1.thread4;

public class Run {
    public static void main(String[] args) {
        Message[] message = new Message[2];
        message[0] = new Message("multithreading","High", 1000);
        message[1] = new Message("multitasking","Medium", 2000);

        for (int i = 0; i < 2; i++) {
            message[i].start();
        }
    }
}
