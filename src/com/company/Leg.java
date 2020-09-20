package com.company;

public class Leg {
    private int size;

    public void bitleg() {
        System.out.println("Бьет по мячику");
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void showSize() {
        System.out.println("Размер ноги: " + size);
    }
}

