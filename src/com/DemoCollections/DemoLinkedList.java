package com.DemoCollections;

import java.util.LinkedList;
import java.util.List;

public class DemoLinkedList {
    public static void main(String[] args) {

        List<Integer> mydata = new LinkedList<Integer>();

        mydata.add(322);
        mydata.add(100);
        //mydata.add("demo");
        mydata.add(33);
        mydata.add(null);
        //mydata.add(true);
        mydata.add(33);

        for(int i=0;i< mydata.size();i++){
            System.out.println(mydata.get(i));
        }
    }
}
