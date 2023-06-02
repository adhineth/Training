package com.copied;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ArrayListString {
    public static void main(String[] args) {
        List<String> namesAl = new ArrayList<>();
        namesAl.add("avimy");
        namesAl.add("din");
        namesAl.add("pramy");
        namesAl.add("sup");
        System.out.println(namesAl);
        Collections.sort(namesAl);
        System.out.println(namesAl);
        Iterator<String> iterator = namesAl.iterator();
        while(iterator.hasNext()){
            if(iterator.next().endsWith("my")){
                iterator.remove();
            }
            System.out.println(namesAl);
        }
    }
}
