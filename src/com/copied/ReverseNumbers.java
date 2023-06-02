package com.copied;

import java.util.Scanner;

public class ReverseNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int remainder, reverse=0;
        System.out.println("Enter the number");
        int number = scanner.nextInt();
        while (number >0){
            remainder=number%10;
            reverse= reverse*10+remainder;
            number=number/10;
        }System.out.println(reverse);
    }
}
