/*
Instead of for loop we use Iterator method in sets

1. It accepts null as value
2. Doesn't maintain the insertion order
3. Neither sorted not ordered
4. Duplicate values are not allowed.

 */
package com.DemoCollections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DemoHashSet {

    public static void main(String[] args) {
        Set mydata =new HashSet();

        mydata.add(32);
        mydata.add(22);
        mydata.add(null);
        mydata.add(4);
        mydata.add(33);
        mydata.add(11);
        mydata.add(66);
        mydata.add(66);

        Iterator iterator = mydata.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
