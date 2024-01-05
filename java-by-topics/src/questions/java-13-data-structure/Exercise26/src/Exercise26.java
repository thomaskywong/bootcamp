import java.util.HashMap;
import java.util.Map;

/**
 * In this exercise, try to create an enum Fruit, with two fields, name (String) and price (int).
 * Revise foodTable to HashMap<Integer, Fruit>.
 * 
 * Expected Output: 
 * Before change: 
 * 1 = Apple 
 * 3 = Strawberry
 * 
 * After change: 
 * 1 = APPLE, price = 20 
 * 3 = STRAWBERRY, price = 70
 */
class Exercise26 {
    // finite number of instances
    enum Fruit {

        // code here
        APPLE(20),
        STRAWBERRY(70),
        ORANGE(50),
        ;

        private int price;

        private Fruit(int price) {
            this.price = price;
        }

        public int getPrice() {
            return this.price;
        }


    }

    public static void main(String[] args) {
        // initialize a HashMap
        HashMap<Integer, String> foodTable = new HashMap<>();

        // Add elements using put method
        foodTable.put(1, "Apple");
        foodTable.put(3, "Strawberry");
        foodTable.put(2, "Orange");

        // Remove elements 2
        foodTable.remove(2);

        // Iterate the map using
        // for-each loop
        // Iterating HashMap through for loop
        System.out.println("Before change:"); 
        for (Map.Entry<Integer, String> set : foodTable.entrySet()) {
            // Printing all elements of a Map
            System.out.println(set.getKey() + " = " + set.getValue());
        }
        
        HashMap<Integer, Fruit> foodTable2 = new HashMap<>();
        
        // Add elements using put method
        foodTable2.put(1, Fruit.APPLE);
        foodTable2.put(3, Fruit.STRAWBERRY);
        foodTable2.put(2, Fruit.ORANGE);

        // Remove elements 2
        foodTable.remove(2);

        System.out.println("After change:"); 
        for (Map.Entry<Integer, Fruit> set : foodTable2.entrySet()) {
            // Printing all elements of a Map
            System.out.println(set.getKey() + " = " + set.getValue() + ", price = " + set.getValue().getPrice());
        }
    }
}
