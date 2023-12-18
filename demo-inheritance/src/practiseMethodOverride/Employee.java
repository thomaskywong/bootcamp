package practiseMethodOverride;

public class Employee {

    private String name;
    private int id;

    public Employee (String name, int id) {
      this.name = name;
      this.id = id;
    }
    
    public void setName(String name) {
      this.name = name;
    }

    public void setId(int id) {
      this.id = id;
    }

    protected CharSequence getName() {
      return name;      // String -> CharSequence (upcast)
    }

    public int getId() {
      return this.id;
    }
  
}
