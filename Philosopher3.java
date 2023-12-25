package org.example;

public class Philosopher3 implements Runnable {

    private final String philosopher3;

    public Philosopher3(String philosopher3) {
        this.philosopher3 = philosopher3;
    }

    @Override
    public void run() {
        System.out.println(philosopher3);
    }
}
