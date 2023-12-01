public class RunTrain {
  public static void main(String[] args) {
    
    Train thomas = new Train("Thomas");

    System.out.println("Thomas' Speed = " + thomas.getSpeed());
    System.out.println("Thomas is moving forward = " + thomas.getIsForward());

    thomas.decelerate();
    System.out.println("Thomas' Speed = " + thomas.getSpeed());


    thomas.accelerate();
    thomas.accelerate();
    thomas.accelerate();
    System.out.println("Thomas' Speed = " + thomas.getSpeed());
    System.out.println("Thomas is moving forward = " + thomas.getIsForward());

    thomas.decelerate();
    System.out.println("Thomas' Speed = " + thomas.getSpeed());
    System.out.println("Thomas is moving forward = " + thomas.getIsForward());

    thomas.accelerate();
    thomas.accelerate();
    thomas.breaking();
    System.out.println("Thomas' Speed = " + thomas.getSpeed());
    System.out.println("Thomas is moving forward = " + thomas.getIsForward());
    System.out.println();

    thomas.accelerate();
    thomas.accelerate();
    System.out.println("Thomas' Speed = " + thomas.getSpeed());

    thomas.reverse();
    System.out.println("Thomas' Speed = " + thomas.getSpeed());
    System.out.println("Thomas is moving forward = " + thomas.getIsForward());
   
    thomas.accelerate();
    thomas.accelerate();
    thomas.accelerate();
    System.out.println("Thomas' Speed = " + thomas.getSpeed());
    System.out.println("Thomas is moving forward = " + thomas.getIsForward());

    thomas.reverse();
    System.out.println("Thomas' Speed = " + thomas.getSpeed());
    System.out.println("Thomas is moving forward = " + thomas.getIsForward());
    System.out.println();

    Train james = new Train("James");

    System.out.println("James' Speed = " + james.getSpeed());
    System.out.println("Jame is moving forward = " + james.getIsForward());
    
    james.accelerate();
    james.accelerate();
    james.accelerate();
    james.accelerate();
    System.out.println("James' Speed = " + james.getSpeed());
    System.out.println("Jame is moving forward = " + james.getIsForward());

    james.decelerate();
    james.decelerate();
    System.out.println("James' Speed = " + james.getSpeed());
    System.out.println("Jame is moving forward = " + james.getIsForward());

    james.breaking();
    System.out.println("James' Speed = " + james.getSpeed());
    System.out.println("Jame is moving forward = " + james.getIsForward());  
    
    james.reverse();
    System.out.println("James' Speed = " + james.getSpeed());
    System.out.println("Jame is moving forward = " + james.getIsForward()); 

    james.accelerate();
    james.accelerate();
    james.accelerate();
    james.accelerate();
    james.accelerate();
    james.accelerate();
    james.accelerate();
    james.accelerate();
    james.accelerate();
    james.accelerate();
    james.accelerate();
    james.accelerate();
    System.out.println("James' Speed = " + james.getSpeed());
    System.out.println("Jame is moving forward = " + james.getIsForward()); 

    james.reverse();
    System.out.println("James' Speed = " + james.getSpeed());
    System.out.println("Jame is moving forward = " + james.getIsForward()); 

  }
}
