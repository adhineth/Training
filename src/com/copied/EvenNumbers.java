package com.copied;

public class EvenNumbers {
    public static void main(String[] args) {
        //print even numbers btwn 23 & 57, each number shld be printed in sepserate row
        for(int i=23;i<=57;i++){
            if(i%2==0){
                System.out.println("\t"+i);
            }
        }
    }
}
