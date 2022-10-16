package javabasics.collections.listinterface.arraylist;

import java.util.ArrayList;
import java.util.List;

public class IteratingArrayListUsingEnhancedForLoop {

    public static void main(String[] args) {
        //list of elements contains only integers
        List<Integer> arrayIntegerList = new ArrayList();
        arrayIntegerList.add(123);
        arrayIntegerList.add(456);

        //enhanced for loop or for each loop
        for (Integer integer : arrayIntegerList) {
            System.out.println(integer * 2);
        }
    }
}
