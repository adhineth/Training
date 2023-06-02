
/*

1. It maintains insertion order
2. It is not sorted by default
3. It allows duplicate values
4. It allows null as value
 */

package com.DemoCollections;

import java.util.Vector;

public class DemoVector2 {
    public static void main(String[] args) {

        Vector<Integer> mydata = new Vector<Integer>(3);

        mydata.add(4);
        mydata.add(2);
        mydata.add(4);
        mydata.add(5);
        mydata.add(null);

        for (int i=0; i<mydata.size();i++) {
            System.out.println(mydata.get(i));
        }

    }
}
