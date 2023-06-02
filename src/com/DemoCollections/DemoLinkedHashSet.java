/*
Instead of for loop we use Iterator method in sets

1. It accepts null as value
2. Maintains the insertion order
3. Not sorted
4. Duplicate values are not allowed.

 */
package com.DemoCollections;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class DemoLinkedHashSet {

    public static void main(String[] args) {
        Set<Integer> mydata =new LinkedHashSet<Integer>();

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
