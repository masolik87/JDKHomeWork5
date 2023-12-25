package org.example;

public class Philosopher1 implements Runnable {
    private final String philosopher1;
    public Philosopher1(String philosopher1) {
        this.philosopher1 = philosopher1;
    }

    @Override
    public void run() {
        System.out.println(philosopher1);
    }
}
