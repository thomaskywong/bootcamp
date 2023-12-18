package practiseinheritance;

public enum CatBreed {
  
  AMERICAN_SHORTHAIR,
  BRITISH_SHORTHAIR,
  HONGKONG_SHORTHAIR,
  ;
  public static void main(String[] args) {
    for (CatBreed obj : CatBreed.values()) {
      System.out.println(obj);
      
    }
  }
}
