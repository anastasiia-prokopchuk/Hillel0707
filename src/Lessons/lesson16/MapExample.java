package Lessons.lesson16;

import java.util.HashMap;
import java.util.Map;

public class MapExample {
    public static void main(String[] args) {
        HashMap<String, String> myHashMap = new HashMap<>();

        myHashMap.put("Alex", "24.07.1989");
        myHashMap.put("Sasha", "02.09.1999");
        myHashMap.put("Dima", "04.03.1979");


        System.out.println("DO we have Alex? :" + myHashMap.containsKey("Alex"));
        System.out.println("DO we have Alex? :" + myHashMap.containsKey("Ira"));


        System.out.println("DO we have 24.07.1989? :" + myHashMap.containsValue("24.07.1989"));
        System.out.println("DO we have 24.d07.1989? :" + myHashMap.containsValue("24.d07.1989"));


//        String str = "Do we have Alex? : ";
//         System.out.println(myHashMap.containsKey("Alex") ? str.concat("Да") : str.concat("Нет"));


//        System.out.println("Value for key Alex - " + myHashMap.get("Alex"));

//        System.out.println("Map before deleting: ");
//        for (Map.Entry<String, String> i : myHashMap.entrySet()) {
//            System.out.println(i.getKey() + " - " + i.getValue());
//        }
//
//        myHashMap.remove("Dima");
//
//        System.out.println("Map after deleting: ");
//        for (Map.Entry<String, String> i : myHashMap.entrySet()) {
//            System.out.println(i.getKey() + " - " + i.getValue());
//        }
    }
}
