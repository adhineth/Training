package com.copied;

public class FiveValues {
    public static void main(String[] args) {
        //print 5 values which are divisible by 2, 3 & 5
        for (int i=2;i<=6;i++){
            if(i%2==0 || i%3==0 ||i%5==0){
                System.out.println(i);
            }
        }
    }
}
