public class Cat {
  
  private String name;
  // if there is no constructor explicitly written, Java will auto gen a default cosntructor

  // if once constructor is provided, empty constructor shall be provided, 
  // or constructor without parameter is avoid! 
  
  public Cat(String name) {
    this.name = name;
  }

  public String getName() {
    return this.name;
  }

  public static void main(String[] args) {
    Cat cat1 = new Cat();
    Cat cat2 = new Cat("Rambo");
  }

}
