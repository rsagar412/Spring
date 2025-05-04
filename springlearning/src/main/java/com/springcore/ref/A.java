package com.springcore.ref;

public class A {
    private int x;
    private B ob1;
    public A(){
        super();
    }
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public B getob1() {
        return this.ob1;
    }
    public void setob1(B ob1) {
        this.ob1 = ob1;
    }
    @Override
    public String toString() {
        return "A [x=" + this.x + ", b=" + this.ob1 + "]";
    }
    
    
}
