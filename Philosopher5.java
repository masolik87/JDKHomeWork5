package org.example;

public class Philosopher5 implements Runnable {

    private final String philosopher5;

    public Philosopher5(String philosopher5) {
        this.philosopher5 = philosopher5;
    }

    @Override
    public void run() {
        System.out.println(philosopher5);
    }
}
