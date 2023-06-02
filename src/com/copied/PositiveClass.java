package com.copied;

import java.util.Scanner;

public class PositiveClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        do {
            System.out.println("ENter the number");
            num = scanner.nextInt();

            if(num>0){
                System.out.println("number is positive");
            }else if(num<0){
                System.out.println("number is negative");
            }else {
                System.out.println("number is zero");
            }
        }while (true);
    }
}
