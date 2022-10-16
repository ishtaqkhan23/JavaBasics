package javabasics.collections.listinterface.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        //list of elements contains integers and strings
        List arrayList = new ArrayList();
        arrayList.add(123);
        arrayList.add(1, "Nawaz");

        //printing the elements of collection
        System.out.println(arrayList);



        //list of elements contains only integers
        List<Integer> arrayIntegerList = new ArrayList<>();
        arrayIntegerList.add(123);
        arrayIntegerList.add(456);
        //if we try to add diff type then compiler will throw an error
        //arrayIntegerList.add("nawaz");

        //printing the elements of collection
        System.out.println(arrayIntegerList);




        //list of elements contains only Strings
        List<String> arrayStringList = new ArrayList();
        arrayStringList.add("Nawaz");
        arrayStringList.add("Ishtaq");

        //printing the elements of collection
        System.out.println(arrayStringList);
    }
}
