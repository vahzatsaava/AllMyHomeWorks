package com.company.thread_learn.counter_thread;

public class CounterThread {
    private int x;

    CounterThread() {
        this.x = 0;
    }

    public int getX() {
        return x;
    }

    public synchronized void inc() {
        this.x++;
    }

    public synchronized void dec() {
        this.x--;
    }
}
