package part1Threads.thread4;

import java.util.HashMap;

public class Message extends Thread {
    String message;
    int timeout;

    int priority;

    public Message(String message, int timeout, int priority) {
        this.message = message;
        this.timeout = timeout;
        this.priority = priority;
    }

    HashMap<Integer, String> hashMap = new HashMap<Integer, String>();

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(message);
            try {
                Thread.currentThread().getPriority();
                Thread.sleep(timeout);

            } catch (Exception e) {}
        }
    }
}

