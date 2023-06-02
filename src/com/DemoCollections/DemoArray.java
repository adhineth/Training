/*
1. in for loop we did not write method rather we used static variable
 */

package com.DemoCollections;

public class DemoArray {
    public static void main(String[] args) {

        int[] mydata = new int[3];

        mydata[0] =7;
        mydata[1] = 22;
        mydata[2] = 43;

        for(int i=0;i< mydata.length;i++){

            System.out.println(mydata[i]);

        }

    }
}
