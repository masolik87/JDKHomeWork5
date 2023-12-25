package org.example;

public class Philosopher2 implements Runnable {

    private final String philosopher2;

    public Philosopher2(String philosopher2) {
        this.philosopher2 = philosopher2;
    }

    @Override
    public void run() {
        System.out.println(philosopher2);
    }
}
