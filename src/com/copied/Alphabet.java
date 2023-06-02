package com.copied;

import java.util.Scanner;

public class Alphabet {
    public static void main(String[] args) {
        //IsLetterORDigit
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter the value");
            char[] value = sc.nextLine().toCharArray();
            for (char ch1: value){
                boolean result = Character.isLetterOrDigit(ch1);
                if (result){
                    System.out.println("value is alphabet");
                }
                else {
                    System.out.println("value is Digit");
                }
            }
        }while (true);
    }
}
