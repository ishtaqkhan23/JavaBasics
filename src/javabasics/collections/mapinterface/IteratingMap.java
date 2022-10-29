package javabasics.collections.mapinterface;

import java.util.LinkedHashMap;
import java.util.Map;

public class IteratingMap {
    public static void main(String[] args) {
        Map<String, String> personalMap = new LinkedHashMap<>();
        personalMap.put("GoldKey","PureSilver");
        personalMap.put("Bccessories","PureSilver");
        personalMap.put("SilverKey","Silver");
        personalMap.put("SilverKey","PureSilver");
        personalMap.put("Cloths","PureSilver");
        personalMap.put("Electronics","PureSilver");
        personalMap.put("Accessories","PureSilver");

        for (String key: personalMap.keySet()){
            System.out.println(key);
        }

        for (Map.Entry<String, String> entry: personalMap.entrySet()){
            System.out.println("key--->"+ entry.getKey());
            System.out.println("value--->"+ entry.getValue());
        }


    }
}
