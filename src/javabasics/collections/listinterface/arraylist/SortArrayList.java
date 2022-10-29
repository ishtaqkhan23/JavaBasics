package javabasics.collections.listinterface.arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortArrayList {
    public static void main(String[] args) {
        List<Integer> arrayIntegerList = new ArrayList<>();
        arrayIntegerList.add(123);
        arrayIntegerList.add(9);
        arrayIntegerList.add(456);

        System.out.println(arrayIntegerList);
        System.out.println("================");

        Collections.sort(arrayIntegerList);
        System.out.println(arrayIntegerList);

    }
}
