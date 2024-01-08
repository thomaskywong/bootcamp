import java.time.LocalDate;

public record Staff2 (String name, LocalDate dateOfEntry) {

  //all arguments constructor
  // getters .name(), .dateOfEntry()
  // .equals()
  // .hashCode()
  // .toString()

  public void print() {
    System.out.println("Name=" + this.name + ", Date of Entry=" + this.dateOfEntry);
  }
  
}
