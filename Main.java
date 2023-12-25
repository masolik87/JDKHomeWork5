package org.example;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 3; i++){
            new Thread(new Philosopher1("Eat1")).start();
            Thread.sleep(500);
            new Thread(new Philosopher1("Think1")).start();
            new Thread(new Philosopher2("Eat2")).start();
            Thread.sleep(500);
            new Thread(new Philosopher2("Think2")).start();
            new Thread(new Philosopher3("Eat3")).start();
            Thread.sleep(500);
            new Thread(new Philosopher3("Think3")).start();
            new Thread(new Philosopher4("Eat4")).start();
            Thread.sleep(500);
            new Thread(new Philosopher4("Think4")).start();
            new Thread(new Philosopher5("Eat5")).start();
            Thread.sleep(500);
            new Thread(new Philosopher5("Think5")).start();
        }
    }
}