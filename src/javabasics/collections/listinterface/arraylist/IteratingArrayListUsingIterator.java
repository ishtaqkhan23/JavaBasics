package javabasics.collections.listinterface.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratingArrayListUsingIterator {
    public static void main(String[] args) {
        //list of elements contains only integers
        List<Integer> arrayIntegerList = new ArrayList();
        arrayIntegerList.add(123);
        arrayIntegerList.add(456);
        arrayIntegerList.add(22);
        arrayIntegerList.add(44);

        //getting the iterator from arrayList
        Iterator<Integer> integerIterator = arrayIntegerList.iterator();


        //iterating the iterator using while loop
        while (integerIterator.hasNext()){
            System.out.println(integerIterator.next());
            System.out.println(integerIterator.next() * 2);
        }

    }
}
