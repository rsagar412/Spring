package com.springcore.lifecycle;

public class Samosa {
            private double price;
            public void setprice(double price) {
                this.price = price;
            }
            public double getPrice() {
                return price;
            }
            public Samosa(){
                super();
            }
            @Override
            public String toString() {
                return "Samosa [price=" + price + "]";
            }
            public void init(){
                System.out.println("Init method called for samosa");
            }
            public void destroymet(){
                System.out.println("Destroy method called for samosa");
            }
}
