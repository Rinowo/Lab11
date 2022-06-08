package exercise1.thread4;

public class Run {
    public static void main(String[] args) {
        Message[] message = new Message[2];
        message[1] = new Message("multithreading", 1, 1000);
        message[2] = new Message("multitasking", 2, 2000);

        for (int i = 0; i < 2; i++) {
            message[i].start();
        }
    }
}
