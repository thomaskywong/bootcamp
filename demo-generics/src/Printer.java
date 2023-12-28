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

  public void setValue(T value) {
    this.value = value;
  } 

  @Override 
  public String toString() {
    return String.valueOf(this.value);
  }


}
