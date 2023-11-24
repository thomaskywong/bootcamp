public class PractiseSwitchString {
  public static void main(String[] args) {
    String seatClass = "Business Class";
    System.out.println("Seat Class: " + seatClass);

    switch(seatClass) {
      case "First Class":
        System.out.println("Meal: Primium steak");
        break;
      case "Business Class":
        System.out.println("Meal: Carbonara");
        break;
      case "Economy Class":
        System.out.println("Meal: Chicken fried rice");
        break;
      default:
    }
  }
  
}
