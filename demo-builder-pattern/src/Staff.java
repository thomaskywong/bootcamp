public class Staff {

  private String name;
  private int yearOfExp;

  public Staff() {

  }

  private Staff(Builder builder) {



  }


  public static Staff builder() {
    return new Staff();
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

    public void setName(String name) {
      this.name = name;

    }

    public void setYearOfExp(int yearOfExp) {
      this.yearOfExp = yearOfExp;

    }

    public Staff build() {
      return new Staff(this);
    }

  }

  public static void main(String[] args) {

    Staff staff = new Staff();



  }

}
