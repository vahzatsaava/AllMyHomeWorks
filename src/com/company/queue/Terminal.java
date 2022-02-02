package com.company.queue;

public class Terminal {
    private final long time = System.currentTimeMillis() / 1000;

    public long getTime() {
        return time;
    }

    @Override
    public String toString() {
        return "true";
    }
}
