package com.DemoCollections;

import java.util.Vector;

public class DemoVector {
    public static void main(String[] args) {

        Vector<Integer> mydata = new Vector<Integer>(3);

        System.out.println("**");
        System.out.println("capacity  :"+mydata.capacity());
        System.out.println("size  :"+mydata.size());
        mydata.add(32);
        mydata.add(2);
        mydata.add(4);
        mydata.add(5);
        System.out.println("**");
        System.out.println("capacity  :"+mydata.capacity());
        System.out.println("size  :"+mydata.size());

    }
}
