package com.copied;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        String input = "r,t,a,s,b,c";
        char[] chars = input.toCharArray();
        Arrays.sort(chars);
        String sortedString = new String(chars);
        System.out.println(sortedString);
    }
}
