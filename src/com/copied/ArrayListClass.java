package com.copied;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListClass {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        integerList.add(153);
        integerList.add(406);
        integerList.add(749);
        System.out.println(integerList);
        Collections.sort(integerList);
        System.out.println(integerList);
        Collections.reverse(integerList);
        System.out.println(integerList);
    }
}
