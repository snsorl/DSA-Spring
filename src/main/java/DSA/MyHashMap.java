package DSA;

import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args){
    HashMap<String, Integer> peopleAndAge = new HashMap<>();
    peopleAndAge.put("Andrew", 1);
    peopleAndAge.put("Bob", 2);
    // Replaces with new valu
    peopleAndAge.put("Bob", 3);
    peopleAndAge.put("John", 3);
    peopleAndAge.remove("Bob", 3);
    System.out.println(peopleAndAge.keySet());
    System.out.println(peopleAndAge.values());

    }

    // Search, insertion, deletion at best is O(1). At worst, it is O(n);
}
