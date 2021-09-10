package collection.java;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;

public class Arraylist_to_Hashset {
    public static void main(String args[]) {

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("apple");
        arrayList.add("banana");
        arrayList.add("pineapple");
        arrayList.add("strawberry");
        arrayList.add("banana"); // duplicate element which we want to convert into hashset which doesn't contain duplicate values

        System.out.println("This is my Arraylist elements :" + arrayList);

        /* here we will convert arraylist into hashset using constructor.
         by passing the arraylist object into hashset constructor
         */

        HashSet<String> set = new HashSet<>(arrayList);

        // now print elements of hashset and you can see the duplicate elements got deleted in hashset

        for(String value : set)
             System.out.println(value);
            System.out.println(set.toString());
            System.out.println(set.add("mango"));
            System.out.println(set.contains("pineapple"));
            System.out.println(set.isEmpty());
            System.out.println(set.iterator());
            System.out.println(set.remove("banana"));

            System.out.println("This is my Hashset   elements :" + set);

            // we can also use addAll() method to add or convert elements from list to another

            LinkedList<String> linkedList = new LinkedList<>();
            linkedList.addAll(arrayList);
            linkedList.addFirst("peach");
            linkedList.addLast("watermelon");

            System.out.println("This is my Linkedlist elements :" + linkedList );



    }
}
