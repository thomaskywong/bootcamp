package practicegenerics1;

import java.util.Objects;

public class Printer1<T extends Number> {

  T item;

  public Printer1(T item) {
    this.item = item;
  }

  public T getItem() {
    return this.item;
  }

  public void setItem(T item) {
    this.item = item;
  }

  @Override
  public String toString() {
    return String.valueOf(this.item);
  }

  @Override
  public boolean equals(Object obj) {
    if (obj == this) {
      return true;
    }

    if (!(obj instanceof Printer1)) {
      return false;
    }
    Printer1<T> t = (Printer1<T>) obj;

    return Objects.equals(t.getItem(), this.item);
  }

  @Override 
  public int hashCode() {
    return Objects.hash(this.item);
  }

}

