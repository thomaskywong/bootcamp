import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DemoTypeInference {
    public static void main(String[] args)  {
        String s = "hello";

        // var as datatype when declare AND initialization
        // 1) Cannot be used as return type of method, or input parameter type
        // 2) Has to assign value to variable if using var as datatype
        
        // k has type of long. Shall only be used at variable declaration AND initialization
         
        var k = 10L; 

        // var -> String after compilation
        var s2 = "hello";

        // s2 = 123; // compilation error, since var s2 = "hello" has indirectly fix var as String
        // cannot be reassigned to in value object

        List<Dog> dogs = new ArrayList<>(List.of(new Dog("ABC"), new Dog("DEF")));
        var dogs2 = new ArrayList<Dog>(List.of(new Dog("ABC"), new Dog("DEF")));

        System.out.println(dogs2);
        
        for(Dog dog : dogs)
            System.out.println(dog.getName());
        
        System.out.println();

        for(var dog : dogs)
            System.out.println(dog.getName());

        Map<Integer, Dog> dogMap = new HashMap<>();
        dogMap.put(1, new Dog("Bobo"));
        dogMap.put(2, new Dog("John"));
        dogMap.put(3, new Dog("Sisi"));
        dogMap.put(4, new Dog("Thomas"));
        for (Map.Entry<Integer, Dog> dog : dogMap.entrySet()) {
            System.out.println(dog);
        }


    }

    // cannot use "var" as return type of method
    // public static var add(int x, int y){
    //     return x + y;
    // }

    // cannot use "var" as input parameter type
    // public static int add(var x, var y){
    //     return x + y;
    // }
}
