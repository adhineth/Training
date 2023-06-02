package com.copied;

import java.util.Scanner;

public class Characters {
    public static void main(String[] args) {
        char ch;

        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter teh character in lower case");
        ch = scanner.nextLine().charAt(0);
        System.out.println("equivalent character in uppercase"+"\n" +(char)(ch-32));
    }
}
