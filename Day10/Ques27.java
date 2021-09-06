package Day10;

import java.util.HashMap;

public class Ques27 {
 
 public static void main(String[] args) {
    HashMap<Integer, String> hashmap = new HashMap<Integer, String>();
    hashmap.put(11,"Arasa");
    hashmap.put(22,"kumaran");
    hashmap.put(33,"Als");
    hashmap.put(44,"Jai");
    hashmap.put(55,"Karan");
    System.out.println(hashmap.containsValue("Sarvesh"));
 }
}