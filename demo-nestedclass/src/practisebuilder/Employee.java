import java.time.LocalDate;
import java.util.Objects;

public class Employee {

  private String name;
  private int salary;
  private LocalDate dateOfEntry;

  private Employee(Builder builder) {
    this.name = builder.name;
    this.salary = builder.salary;
    this.dateOfEntry = builder.dateOfEntry;
  }

  public String getName() {
    return this.name;
  }

  public int getSalary() {
    return this.salary;
  }

  public LocalDate getDateOfEntry() {
    return this.dateOfEntry;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public String toString() {
    return "name=" + this.name + ", salary=" + this.salary + ", date of entry="
        + this.dateOfEntry;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;

    if (!(obj instanceof Employee))
      return false;

    Employee builder = (Employee) obj;

    return Objects.equals(this.name, builder.getName())
        && Objects.equals(this.salary, builder.getSalary())
        && Objects.equals(this.dateOfEntry, builder.getDateOfEntry());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.salary, this.dateOfEntry);
  }

  // builder shall be a STATIC NESTED CLASS 
  // No object is instantiated while using builder
  public static class Builder {

    private String name;
    private int salary;
    private LocalDate dateOfEntry;


    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder salary(int salary) {
      this.salary = salary;
      return this;
    }

    public Builder dateOfEntry(LocalDate dateOfEntry) {
      this.dateOfEntry = dateOfEntry;
      return this;
    }

    public Employee build() {
      return new Employee(this);
    }

    public String getName() {
      return this.name;
    }

    public int getSalary() {
      return this.salary;
    }

    public LocalDate getDateOfEntry() {
      return this.dateOfEntry;
    }

    @Override
    public String toString() {
      return "name=" + this.name + ", salary=" + this.salary
          + ", date of entry=" + this.dateOfEntry;
    }

    @Override
    public boolean equals(Object obj) {
      if (this == obj)
        return true;

      if (!(obj instanceof Builder))
        return false;

      Builder builder = (Builder) obj;

      return Objects.equals(this.name, builder.getName())
          && Objects.equals(this.salary, builder.getSalary())
          && Objects.equals(this.dateOfEntry, builder.getDateOfEntry());
    }

    @Override
    public int hashCode() {
      return Objects.hash(this.name, this.salary, this.dateOfEntry);
    }

  }

}