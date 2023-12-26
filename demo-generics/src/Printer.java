// Generics
public class Printer<T> {

  // Generics
  private T value;

  public Printer(T value) {
    this.value = value;
  }
  
  public T getValue() {
    return this.value;
  }

  @Override String toString() {
    return this
  }

  public static void main(String[] args) {
    
    Printer<Integer> integerPrinter = new Printer<>(10);

    Printer<String> stringprinter = new Printer<>("Hello");


  }

}
