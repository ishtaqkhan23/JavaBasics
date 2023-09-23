package javabasics.programs;

import java.util.*;

public class FindMostOccurredDupInt {
    public static void main(String[] args) {
        List<Integer> integers = new LinkedList<>();
        Scanner sc= new Scanner(System.in);
        int noOfInputs = sc.nextInt();
        for (int i = 0; i< noOfInputs; i++){
            integers.add(sc.nextInt());
        }

        // k,v
        // int , value(count no of times vallue is present)
        // 1, 1, 1, 2, 2, 3
        // (1, 3), (2, 2), (3, 1)
        Map<Integer, Integer> inputMapWithValueCount = new HashMap<>();
        for(Integer input: integers){
            if(inputMapWithValueCount.containsKey(input)){
                int prvVal = inputMapWithValueCount.get(input);
                inputMapWithValueCount.put(input, prvVal + 1);
            } else {
                inputMapWithValueCount.put(input, 1);
            }
        }

        System.out.println(inputMapWithValueCount);

        //to find the key that occurred most no. of times
        int highestDuplicateVal = 0;//3
        int highestDupKey = 0;//1
        for (Map.Entry<Integer,Integer> entry: inputMapWithValueCount.entrySet()){
            if(entry.getValue() > highestDuplicateVal){ // 1 => 0 > 3
                highestDuplicateVal = entry.getValue();
                highestDupKey = entry.getKey();
            }
        }
        System.out.println("The input which is duplicated most of the time is :"+highestDupKey);
        System.out.println("No. of times duplicated :"+ highestDuplicateVal);
    }
}
