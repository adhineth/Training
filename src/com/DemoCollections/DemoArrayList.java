/*
1. No fixed data size
2. collection of data elements

3. Maintaining insertion order
4. Data not sorted by default
5. Allow duplicate values
6. Allow null as a value

Instead of doing for loop we are trying forEach(())
functional interface and lambda expression which come as JAVA8 feature

Collections.synchronizedList(mydata); //provide object name
Irrespective of ArrayList of LinkedList it will be converted as synchronized or Thread safe

Collections is a class which is part of Collections framework
Collections is a class of util package* -> (which contains several class/Interfaces/exceptions/enums)

performance will be slow for conversion to synchronization.
 */

package com.DemoCollections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DemoArrayList {
    public static void main(String[] args) {

        List<Integer> mydata = new ArrayList<Integer>();

        mydata.add(33);
        mydata.add(11);
        //mydata.add("demo");
        mydata.add(3);
        mydata.add(null);
        //mydata.add(true);
        mydata.add(33);

        Collections.synchronizedList(mydata);
        /*

        for(int i=0;i< mydata.size();i++){
            System.out.println(mydata.get(i);
        }

         */

        mydata.forEach((item)-> System.out.println(item));

    }
}
