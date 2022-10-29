package javabasics.collections.mapinterface;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> personalMap = new LinkedHashMap<>();
        personalMap.put("GoldKey","PureSilver");
        personalMap.put("Bccessories","PureSilver");
        personalMap.put("SilverKey","Silver");
        personalMap.put("SilverKey","PureSilver");
        personalMap.put("Cloths","PureSilver");
        personalMap.put("Electronics","PureSilver");
        personalMap.put("Accessories","PureSilver");

        System.out.println(personalMap.get("GoldKey"));
        System.out.println(personalMap.get("SilverKey"));
        System.out.println(personalMap);

        Map<String, List<String>> personalMap1 = new HashMap<>();

        List<String> goldCollection = new LinkedList<>();
        goldCollection.add("Gold1");
        goldCollection.add("Gold2");
        personalMap1.put("GoldKey",goldCollection);

        List<String> silverCollection = new LinkedList<>();
        silverCollection.add("Silver1");
        silverCollection.add("Silver2");
        personalMap1.put("SilverKey",silverCollection);

//        System.out.println(personalMap1.get("GoldKey"));
//        System.out.println(personalMap1.get("SilverKey"));
    }
}
