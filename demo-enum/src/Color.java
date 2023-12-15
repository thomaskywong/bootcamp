public enum Color {     // "enum" is java key word

    // Step 1: normal class
    // Step 2: Someone "new" this class object and plance it into memory


    // is only file until runtime
    // run enum before main() starts
    // 3 objects created before main(): Color.RED, Color.YELLOW, Color.BLACK
    RED, YELLOW, BLACK,;        // enum 

    // When to use?
    // Finite numbers of instances -> enum
    // Example 1: Monday, Tuesday ...
    // Example 2: Good, Bad
    // Example 3: North, East, West, South
    // Example 4: MINUTE, SECOND, HOUR

    // by default empty constructor
    // private Color() {
    //
    // }
  
}
