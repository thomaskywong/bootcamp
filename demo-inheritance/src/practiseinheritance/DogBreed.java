package practiseinheritance;

public enum DogBreed {

  CHIHUAHUA('C'),
  HUSKY('H'),
  PUG('P'),
  ;

  private char val;

  private DogBreed(char val) {
    this.val = val;
  }

  // public getVal() for getting char value of each breed
  public char getVal() {
    return this.val;
  }

  public static void main(String[] args) {
    for (DogBreed obj : DogBreed.values()) {
      System.out.println(obj + " " + obj.getVal());
      
    }
  }
  
}
