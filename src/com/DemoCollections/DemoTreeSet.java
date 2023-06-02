/*
1. Doesn't allow null as a value
2. Data sorted by default and maintains the ascending order
3. It Doesn't maintain Insertion order
4. No duplicate values
 */

package com.DemoCollections;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class DemoTreeSet {
    public static void main(String[] args) {
        Set<Integer> mydata = new TreeSet<Integer>();

        mydata.add(32);
        mydata.add(22);
        //mydata.add(null);
        mydata.add(4);
        mydata.add(33);
        mydata.add(11);
        mydata.add(66);
        mydata.add(66);

        Collections.synchronizedSet(mydata);

        Iterator iterator = mydata.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
