import java.util.Objects;

public class Staff {

  private String name;
  private int yearOfExp;

  public Staff() {

  }

  private Staff(Builder builder) {
    this.name = builder.name;
    this.yearOfExp = builder.yearOfExp;
  }

  // public void setName(String name) {
  //   this.name = name;
  // }

  public void setYearOfExp(int yearOfExp) {
    this.yearOfExp = yearOfExp;
  }

  public String getName() {
    return this.name;
  }

  public int getYearOfExp() {
    return this.yearOfExp;
  }

  public static Builder builder() {
    return new Builder();
  }

  @Override
  public String toString() {
    return "name=" + this.name + ", year of experience=" + this.yearOfExp;
  }

  @Override
  public boolean equals(Object obj) {
    if (this==obj)
      return true;

    if (!(obj instanceof Staff)) 
      return false;
    
    Staff staff = (Staff) obj;

    return Objects.equals(this.name, staff.getName())
           && Objects.equals(this.yearOfExp, staff.getYearOfExp());
  }

  @Override
  public int hashCode() {
    return Objects.hash(this.name, this.yearOfExp);
  }

  public static class Builder {

    private String name;
    private int yearOfExp;

    public Builder name(String name) {
      this.name = name;
      return this;
    }

    public Builder yearOfExp(int yearOfExp) {
      this.yearOfExp = yearOfExp;
      return this;
    }


    public Staff build() {
      return new Staff(this);
    }

  }

  public static void main(String[] args) {

    Staff staff1 = Staff.builder().name("Thomas").yearOfExp(10).build();
    System.out.println(staff1);
    System.out.println(staff1.getName());

    Staff staff2 = Staff.builder().name("Thomas").yearOfExp(10).build();
    System.out.println(staff1.equals(staff2));
    System.out.println(staff1.hashCode());
    System.out.println(staff2.hashCode());


    



  }

}
