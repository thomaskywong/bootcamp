import java.util.HashMap;
import java.util.Map;

public class DemoHashMap2 {
    public static void main(String[] args) {
        
        // Map: 
        // 1. key value pair -> <key, value> -> one entry
        // 2. key must be unique
        Map<Integer, String> students = new HashMap<>();

        

        // .put() 
        students.put(1001, "Thomas");
        students.put(1002, "Joyce");
        students.put(1003, "Jerry");

        // .size() return size of HashMap
        int size = students.size();
        System.out.println(students.size());    // 3

        HashMap<Integer, String> students2 = new HashMap<>();
        
        // iteration on 
        
        // no .getKey()
        // System.out.println(students.getkey("Thomas"));
        // System.out.println(students.getkey("Tommy"));

        for (Map<Interger, String> student: students){
            Integer key = student.getKey();
            String value = student.getValue();
            System.out.println("Key = " + key + ", Value= " + value);
        }
        
    }
}
