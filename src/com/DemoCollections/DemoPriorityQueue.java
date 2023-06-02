/*
1. Doesn't allow Null as the value
2. Allowing duplicates
3. Neither Sorted nor ordered

What's happening with peek and poll??


If we call poll() under iterator there is concurrent modification Exception
use it before we use iteration
 */
package com.DemoCollections;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class DemoPriorityQueue {
    public static void main(String[] args) {

        //To restrict the type of data we can use the generics called as a Integer
        //Inorder to say that it is deriving form Queue interface
        Queue<Integer> priorityQueue = new PriorityQueue<Integer>();


        priorityQueue.add(243);
        priorityQueue.add(432);
        priorityQueue.add(245);
        priorityQueue.add(463);
        priorityQueue.add(24);
        priorityQueue.add(43);
        priorityQueue.add(3);
        priorityQueue.add(23);
        //priorityQueue.add(null);
        priorityQueue.add(43);
        priorityQueue.add(13);
        priorityQueue.add(56);


        System.out.println("************");
        //System.out.println("poll : "+priorityQueue.poll());

        Iterator iterator = priorityQueue.iterator();

        /*

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

         */

        System.out.println("************");
        System.out.println("peek: "+priorityQueue.peek());
        //System.out.println("poll : "+priorityQueue.poll());
        System.out.println("************");



        while (iterator.hasNext()){
        System.out.println(iterator.next());
        }



    }
}
