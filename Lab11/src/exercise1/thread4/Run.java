package exercise1.thread4;

import java.util.HashMap;

public class Run {
    public static void main(String[] args) {

        Message[] message = new Message[2];
        message[0] = new Message("multithreading",1000, 1);
        message[1] = new Message("multitasking", 2000, 2);


        for (int i = 0; i < 2; i++) {
            message[i].start();
        }
    }
}
