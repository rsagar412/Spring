package com.springcore.ci;

public class Addition {
    private int a;
    private int b;

    // Constructor to initialize the values of a and b
    public Addition(int a, int b) {
        this.a = a;
        this.b = b;
    }

    // Method to perform addition of a and b
    public int doSum() {
        return this.a + this.b;
    }

    // Method to perform subtraction of a and b
    public int doSub() {
        return this.a - this.b;
    }

    // Method to perform multiplication of a and b
    public int doMul() {
        return this.a * this.b;
    }

    // Method to perform division of a and b
    public int doDiv() {
        return this.a / this.b;
    }
}
