package javabasics.collections.listinterface.arraylist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorConcurrentModificationException {
    public static void main(String[] args) {
        //list of elements contains only integers
        List<Integer> arrayIntegerList = new ArrayList();
        arrayIntegerList.add(123);
        arrayIntegerList.add(456);
        arrayIntegerList.add(789);

        //getting the iterator from arrayList
        Iterator<Integer> integerIterator1 = arrayIntegerList.iterator();
        Iterator<Integer> integerIterator2 = arrayIntegerList.iterator();

        //reading next element from iterator 1
        System.out.println(integerIterator1.next());
        //removing element from iterator 1
        integerIterator1.remove();

        //reading the next element from iterator 2
        System.out.println(integerIterator2.next());
    }
}
