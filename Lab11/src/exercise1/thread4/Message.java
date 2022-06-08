package exercise1.thread4;

public class Message extends Thread {
    String message;

    String priority;
    int timeout;



    public Message(String message, String priority, int timeout) {
        this.message = message;
        this.priority = priority;
        this.timeout = timeout;
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println(message);
            try {
                Integer intPriority = Integer.valueOf(priority);
                Thread.currentThread().getPriority(intPriority).sleep(timeout);
            } catch (Exception e) {}
        }
    }
}
