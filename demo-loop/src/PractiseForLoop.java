public class PractiseForLoop {
  public static void main(String[] args) {

    // Count from 1 to 100. 
    // If the number is the multiple of 3, show "Buzz"
    // If the number is the multiple of 5, show "Fuzz"
    // If the number is the multiple of both 3 and 5, show "BuzzFuzz"
    // Show numeric value for all other numical values
    
    for (int i = 0; i < 100; i++){
      if ( (i+1)%3 == 0 && (i+1)%5  == 0) {
        System.out.println("BuzzFuzz");
      } else if ((i+1)%3 == 0) {
        System.out.println("Buzz");
      } else if ((i+1)%5 == 0) {
        System.out.println("Fuzz");
      } else {
        System.out.println(i+1);
      }

    }

  }
  
}
