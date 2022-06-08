package exercise1.thread4;

public class Message extends Thread {
    String message;
    int number;

    int timeout;

    public Message(String message, int number, int timeout) {
        this.message = message;
        this.number = number;
        this.timeout = timeout;
    }

    @Override
    public void run() {
        for (int i = 0; i < number; i++) {
            System.out.println("Message " + (i + 1));
            System.out.println("Timeout: " + timeout);
            try {
                Thread.sleep(timeout);
            } catch (Exception e) {}
        }
        System.out.println("done");
    }
}
