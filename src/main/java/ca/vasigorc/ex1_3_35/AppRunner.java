package ca.vasigorc.ex1_3_35;

import static java.lang.Integer.valueOf;

/**
 * Created by vgorcinschi on 17/09/16.
 */
public class AppRunner {
    public static void main(String[] args) {
        RandomQueue<Integer> randomQueue = new RandomQueue<>(10);
        for (int i = 0; i < 25; i++) {
            randomQueue.enqueue(valueOf(i+1));
        }

        for (int i = 0; i < 20; i++) {
            randomQueue.dequeue();
        }

        for (int i = 0; i < 100; i++) {
            System.out.println(randomQueue.sample());
        }
    }
}
