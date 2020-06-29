package com.model;

public class MyCounter {

    private int count;

    public MyCounter() {
    }

    public MyCounter(int count) {
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public MyCounter setCount(int count) {
        this.count = count;
        return this;
    }

    public int increment(){
        return count++;
    }
}
