package org.example;

public class Philosopher4 implements Runnable {

    private final String philosopher4;

    public Philosopher4(String philosopher4) {
        this.philosopher4 = philosopher4;
    }

    @Override
    public void run() {
        System.out.println(philosopher4);
    }
}
